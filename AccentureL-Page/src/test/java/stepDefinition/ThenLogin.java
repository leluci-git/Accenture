package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;


public class ThenLogin {

	WebDriver driver = GivenLogin.driver;
	

	@Then("user should be in the profile page")
	public void user_should_be_in_the_profile_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account,error");
	   driver.quit();
	   
	}

	
	@Then("user should not be in the profile page")
	public void user_should_not_be_in_the_profile_page() {
	   // Assert.assertEquals("There is 1 error", driver.getTitle());
	    driver.quit();    
	}

	

}


