package test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Signuppagecreateacc;
import Pojo.Browser1;
import Utility.Paramtrization;

public class Zerodhasignuptest {
WebDriver driver;
	
	@BeforeTest()
		public void onBrowsers(){
		driver=Browser1.openBrowser();
		
	}
	
	@Test()
	public void validsignupclick() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Signuppagecreateacc signuppagecreateacc=new Signuppagecreateacc(driver) ;
		
			signuppagecreateacc.clickonsignup();
			
			ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
            list.get(0);
            driver.switchTo().window(list.get(1));
	       
			String name=Paramtrization.getData("LOGINDATA",8 ,1 );
			signuppagecreateacc.entermobilenumber(name);
			signuppagecreateacc.entersubmitclick();
			
            
			
			
		}
	
}

