package test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Pojo.Browser1;
import Utility.Paramtrization;

public class PinPageTest {
	WebDriver driver;
	@BeforeMethod
	public void onBrowser() {
    driver=Browser1.openBrowser();
	}

	@Test()
	public void loginvalidcredentialTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String username=Paramtrization.getData("LOGINDATA", 0, 1);
		String password=Paramtrization.getData("LOGINDATA", 1, 1);
		zerodhaLoginPage.enteruserid(username);
		zerodhaLoginPage.enterpassword(password);
		zerodhaLoginPage.loginonclick();
		
		Thread.sleep(2000);
	  
		ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
		String pin=Paramtrization.getData("LOGINDATA", 2, 1);
		zerodhaPinPage.enterPin(pin);
		zerodhaPinPage.clickOnContinue();
		Thread.sleep(3000);
		
		
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
}


