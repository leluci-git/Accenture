package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;

import pages.GivenLoginPage;
import utils.WebDriverSession;

public class GivenLogin {

	
	public static WebDriver driver; //Borrar
	
	@Given("user open the browser to the page")
	public static void user_open_the_browser_to_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver(); //borrar
		driver.get("http://automationpractice.com/index.php");
		//WebDriver driver = WebDriverSession.getWebDriverSession();  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebDriver
	}

@Given("user enter to the loging page")
public void user_enter_to_the_loging_page() {
    // Write code here that turns the phrase above into concrete actions
	//pages.login.click();  
	driver.findElement(By.className("login")).click();
}
public static void Waituntilpageload () {
	WebDriver driver = WebDriverSession.CreateDriverSession();
   WebDriverWait wait = new WebDriverWait(driver,10);
   GivenLoginPage page = new GivenLoginPage();
   wait.until(ExpectedConditions.visibilityOf(page.login));
	
	
			
}



   public static void HardAssert() {
	   WebDriver driver = WebDriverSession.getWebDriverSession();
	   Assert.assertEquals("Goooogle", driver.getCurrentUrl());
   }
   
   public static void softAssert() {
	   SoftAssert  softassert = new SoftAssert();
	 // SoftAssert.asser
	   
   }
}