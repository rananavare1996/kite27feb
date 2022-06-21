package test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.ZerodhaLoginPage;
import POM.ZerodhaforgotPage;
import Pojo.Browser1;
import Utility.Paramtrization;
import Utility.Report;

@Listeners(TestListner.class)

public class LoginPageTest extends BaseTest {
ExtentReports reports;
ExtentTest test;
	
	
@BeforeTest
public void extentReports() {
	reports=Report.createReport();
}


	@BeforeMethod
	public void browser() {
	driver =Browser1.openBrowser();
	}
	
	@Test
	public void loginvalidcredentialTest() throws EncryptedDocumentException, IOException {
	test =reports.createTest("loginvalidcredentialTest");
	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
	String username=Paramtrization.getData("LOGINDATA", 0, 1);
	String password=Paramtrization.getData("LOGINDATA", 1, 1);
	zerodhaLoginPage.enteruserid(username);
	zerodhaLoginPage.enterpassword(password);
	zerodhaLoginPage.loginonclick();
	}
	@Test
	public void forgotpassword() throws EncryptedDocumentException, IOException, InterruptedException {
		test=reports.createTest("forgotpassword");
	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
	Thread.sleep(2000);
	zerodhaLoginPage.clickonforgot();
	
	ZerodhaforgotPage zerodhaforgotPage =new ZerodhaforgotPage (driver);
	String username=Paramtrization.getData("LOGINDATA", 4, 1);
	String pan=Paramtrization.getData("LOGINDATA", 5, 1);
	String email=Paramtrization.getData("LOGINDATA", 6, 1);
	zerodhaforgotPage.userid(username);
	zerodhaforgotPage.enterpan(pan);
	zerodhaforgotPage.enteremail(email);
	//zerodhaforgotPage.rest();
	
	}
	
	@Test
	public void ClickOnLoginWithotData() throws EncryptedDocumentException, IOException {
		test=reports.createTest("ClickOnLoginWithotData");

	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
	zerodhaLoginPage.loginonclick();
	 
	String text=zerodhaLoginPage.geterrormsgid();
    String  excepted="Password should be minimum 6 characters.";
    Assert.assertEquals(text, excepted);  // hard assert
   // SoftAssert softassert=new SoftAssert();// softassert .........................................asert depens on which type to be used to perform agains operatin (imp)
    //softassert.assertEquals(text, excepted);
    
    String username=Paramtrization.getData("LOGINDATA", 0, 1);
	String password=Paramtrization.getData("LOGINDATA", 1, 1);
	zerodhaLoginPage.enteruserid(username);
	zerodhaLoginPage.enterpassword(password);
	zerodhaLoginPage.loginonclick();
	}
    
	 
	@AfterMethod
	public void closeBrowser(ITestResult result) {
	
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
			else if(result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status.PASS, result.getName());
			}
			else {
				test.log(Status.SKIP, result.getName());
			}	
			}
		
	 @AfterTest
	 public void flushResult() {
		reports.flush();
	}
		
		
		
			
			
			
		}

	
	
	
	
    
    
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

