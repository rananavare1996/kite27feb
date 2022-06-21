package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppagecreateacc {
	
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signupclk;
    @FindBy (xpath="//input[@type='text']")private WebElement mobnum;
    @FindBy(xpath="//button[@type='submit']") private WebElement  submit;
    
    
    
    public Signuppagecreateacc(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickonsignup() {
    	signupclk.click();
    	
    }
    public void entermobilenumber(String mob) {
    	mobnum.sendKeys(mob);
    }
    
    public void entersubmitclick() {
    	submit.click();
    }
    
    
    
    
    
    
}
