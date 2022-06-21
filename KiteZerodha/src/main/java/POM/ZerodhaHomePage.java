package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	@FindBy(xpath=" //input[@type='text']") private WebElement  Searchtext;
	@FindBy(xpath=" (//span[@class=\"tradingsymbol\"])[14]") private WebElement Tatamotor;
	@FindBy(xpath="(//button[@type=\"button\"])[1]")private WebElement BuyTataButton;
	@FindBy(xpath="(//label[@class='su-radio-label'])[5]")private WebElement overnight;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[6] ")private WebElement Marketradio;
	@FindBy(xpath=" //button[@class='submit'] ")private WebElement Finalbuy;
	@FindBy(xpath="//label[@class=\"su-switch-control\"]")private WebElement RadioToggle;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement Sell;
	@FindBy(xpath="//span[@class='icon icon-plus']") private WebElement watchlistadd;
	@FindBy(xpath="(//span[@class='icon icon-trending-up'])[1]")private WebElement SEEgraph;
	public ZerodhaHomePage(WebDriver driver) {
   PageFactory.initElements(driver, this);
   
    }
       public void enterSerchsells(String Serch) {
    	Searchtext.click(); 
    	
	    Searchtext.sendKeys(Serch);
	}
     public void ClickonBuyshare(WebDriver driver) throws InterruptedException {
    	 Actions act=new Actions(driver);
    	 act.moveToElement(Tatamotor).perform();
    	 
    	 act.moveToElement(BuyTataButton);
    	 act.click();
    	 act.perform();
    	 }
        public void RadioClickOnMarket() {
	    Marketradio.click(); 
        }
        public void BuyTataMotorShare() {
	    Finalbuy.click();
        }
        public void ClickonToggle() {
	    RadioToggle.click();
	    }
        public void ClickonSell() throws InterruptedException {
        Thread.sleep(1000);
    	    Sell.click();
    	}
        public void ClickOngraph(WebDriver driver) {
        	 Actions act1=new Actions(driver);
        	 act1.moveToElement(Tatamotor).perform();
        	 SEEgraph.click();
        }       
        
        public void AddToWatatchList(WebDriver driver) throws InterruptedException {
        	 Actions act2=new Actions(driver);
        	 Thread.sleep(1000);

        	 act2.moveToElement(Tatamotor).perform();
          	 watchlistadd.click();
        }
     
       
	    
	
	    
        }


     
        
    	
    	 
   
    
    
   

