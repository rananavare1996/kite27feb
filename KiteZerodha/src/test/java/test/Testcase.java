package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Pojo.Browser1;
import Utility.Paramtrization;

public class Testcase {
	WebDriver driver;

	@BeforeMethod
	public void browser() {
	driver =Browser1.openBrowser();
	}
	@Test(priority=0)
	public void loginvalidcredentialTest() throws EncryptedDocumentException, IOException, InterruptedException {
	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
	String username=Paramtrization.getData("LOGINDATA", 0, 1);
	String password=Paramtrization.getData("LOGINDATA", 1, 1);
	zerodhaLoginPage.enteruserid(username);
	zerodhaLoginPage.enterpassword(password);
	zerodhaLoginPage.loginonclick();
	String title=driver.getTitle();
	System.out.println(title);
	String acceptedtitle="Kite - Zerodha's fast and elegant flagship trading platform";
	Assert.assertEquals(acceptedtitle, title);
	
	Thread.sleep(2000);
	
    ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
	String pin=Paramtrization.getData("LOGINDATA", 2, 1);
	zerodhaPinPage.enterPin(pin);
	zerodhaPinPage.clickOnContinue();
	Thread.sleep(1000);
	String title1=driver.getTitle();
	System.out.println(title1);
	String acceptedtitle1="Dashboard / Kite";
	Assert.assertEquals(acceptedtitle1, title1);
	
	 ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
     String serch=Paramtrization.getData("LOGINDATA", 10, 1);
     Thread.sleep(1000);
    
     zerodhaHomePage.enterSerchsells(serch);
     zerodhaHomePage.ClickonBuyshare(driver);
     zerodhaHomePage.BuyTataMotorShare();
     zerodhaHomePage.RadioClickOnMarket();
     zerodhaHomePage.BuyTataMotorShare();
     zerodhaHomePage.ClickonToggle();
     zerodhaHomePage.ClickonSell();
	}
     
    @Test
	public void loginvalidcredentialTest1() throws EncryptedDocumentException, IOException, InterruptedException {
	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
	String username=Paramtrization.getData("LOGINDATA", 0, 1);
	String password=Paramtrization.getData("LOGINDATA", 1, 1);
	zerodhaLoginPage.enteruserid(username);
	zerodhaLoginPage.enterpassword(password);
	zerodhaLoginPage.loginonclick();
	String title=driver.getTitle();
	System.out.println(title);
	String acceptedtitle="Kite - Zerodha's fast and elegant flagship trading platform";
	Assert.assertEquals(acceptedtitle, title);
	
	Thread.sleep(2000);
	
    ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
	String pin=Paramtrization.getData("LOGINDATA", 2, 1);
	zerodhaPinPage.enterPin(pin);
	zerodhaPinPage.clickOnContinue();
	Thread.sleep(1000);
	String title1=driver.getTitle();
	System.out.println(title1);
	String acceptedtitle1="Dashboard / Kite";
	Assert.assertEquals(acceptedtitle1, title1);
    
	ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
    String serch=Paramtrization.getData("LOGINDATA", 10, 1);
    Thread.sleep(1000);
   
    zerodhaHomePage.enterSerchsells(serch);
    zerodhaHomePage.ClickOngraph(driver);
    zerodhaHomePage.AddToWatatchList(driver);
    
   
	}
 
   
	
	
	
	

}