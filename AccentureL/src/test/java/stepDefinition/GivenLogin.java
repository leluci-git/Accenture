package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import pageObject.HomePage;
import pageObject.LogIn;

public class GivenLogin {

	public static WebDriver driver = SetUpClass.driver;
	HomePage hp;
	LogIn lg;
	
	/*@Given("user open the browser to the page")
	public void user_open_the_browser_to_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/

@Given("user enter to the loging page")
public void user_enter_to_the_loging_page() {
    // Write code here that turns the phrase above into concrete actions
	
	//driver.findElement(By.className("login")).click();
	hp = new HomePage(driver);
	hp.clickOnSignIn();
	
	

}

@Given("User Should be Logged")

	public void user_should_be_logged() {
	hp = new HomePage(driver);
	hp.clickOnSignIn();
		lg = new LogIn(driver);
		lg.logInToPage();		
	}
}


