package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brows {
	public static WebDriver openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\selinium AUTOMATION\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
}
