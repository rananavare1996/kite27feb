package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {
	
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\selinium AUTOMATION\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		return driver;
		
		
		
	}

	
}
