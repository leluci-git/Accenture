package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession{
	
	static WebDriver driver;
	
		public static WebDriver CreateDriverSession() {
			
			System.setProperty("webdriver.chrome.driver","scr//test//resources//Drivers//chromedriver.exe");
			return new ChromeDriver();
			
		}
		
		public static WebDriver getWebDriverSession() {
			
			if (driver == null)
			{	
				driver =  CreateDriverSession();
				return driver;
			}else
			{
				return driver;
			
			}
			
	}
		
}
