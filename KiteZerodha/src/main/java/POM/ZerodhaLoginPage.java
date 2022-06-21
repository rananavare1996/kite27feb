package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

    @FindBy(xpath=" //input[@id='userid']") private WebElement userid;
	@FindBy(xpath=" //input[@id='password']") private WebElement password;
	@FindBy(xpath=" //button[@type='submit']") private WebElement login;
	@FindBy(xpath=" //a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy(xpath=" //a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	@FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']")private WebElement errormsgforid;
	@FindBy(xpath=" //span[text()='Password should be minimum 6 characters.']")private WebElement errormsgforpass;
	public ZerodhaLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	 }
	
	public void enteruserid(String user) {
	userid.sendKeys(user);
	}
	public void enterpassword(String pass) {
	password.sendKeys(pass);
	}
	public void loginonclick() {
	login.click();	
	}
	public void clickonforgot() {
	forgot.click(); 
	}
	public void clickonsignup() {
	signup.click();
	}
    public  String geterrormsgid() {
    String name= errormsgforpass.getText();
    return name;
   }
}