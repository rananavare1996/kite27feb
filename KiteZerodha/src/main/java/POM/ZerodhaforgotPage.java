package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaforgotPage {
@FindBy(xpath=" //input[@placeholder='User ID']")private WebElement useridforgot;
@FindBy(xpath="// input[@placeholder='PAN']")private WebElement PAN;
@FindBy(xpath=" //input[@placeholder='E-mail (as on account)']")private WebElement Email;
@FindBy(xpath="//input[@placeholder='Captcha']") private WebElement Captcha;
@FindBy(xpath="//button[@type='submit']") private WebElement Reset;
@FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']")private WebElement backtologin;


public ZerodhaforgotPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void userid(String user) {
	useridforgot.sendKeys(user);	
}
public void enterpan(String pan) {
	PAN.sendKeys(pan);
}
public void enteremail(String emal) {
	Email.sendKeys(emal);
}
public void captcha(String cptca) {
	Captcha.sendKeys(cptca);
}
public void rest() {
	Reset.click();
}
public void backlgn() {
backtologin.click();
}
}
