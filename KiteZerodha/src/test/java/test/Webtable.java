package test;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.Browser;

import Pojo.Brows;
import Pojo.Browser1;

public class Webtable {
	public static void main(String[] args) {
	WebDriver driver=Brows.openBrowser("https://demo.guru99.com/test/web-table-element.php");
	WebElement stock=driver.findElement(By.xpath("//table//tbody//tr[4]//td[4]"));	
    String name=stock.getText();                                       //specific value
	System.out.println(name);
		

	 WebElement rows=driver.findElement(By.xpath("//table//tbody//tr[2]"));
	 String name1=rows.getText();                                 //specific row all
	 System.out.println(name1);

	 List<WebElement> rowcount=driver.findElements(By.xpath("//table//tbody//tr"));
	 int a=	rowcount.size();           //row count
	 System.out.println(a);
		
	 List<WebElement> currentprice=driver.findElements(By.xpath("//table//tbody//tr//td[4] "));
	 
	 double max=0;
	 for(int i=0; i<currentprice.size();i++) {
		 WebElement price=currentprice.get(i);
		 String currentpricevalue=price.getText();
		 
		 double value=Double.parseDouble(currentpricevalue);       //max prise find
		 
         
		 if(value>max) {
			 max=value;
		 }
		 System.out.println(max);
	 }
	 
	 
	 
	 
	 
		 
     List<WebElement> columncount=driver.findElements(By.xpath("//table//thead//tr//th"));
	 int b=columncount.size();         //column size
	 System.out.println(b);
	}
	
	
	
}	
	
	
	
	
	
	
	


