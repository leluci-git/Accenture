package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenLogin {

	WebDriver driver = SetUpClass.driver;
	
	@Then("user should be in the profile page")
	public void user_should_be_in_the_profile_page() {
	//	Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account, error");
		//Assert.assertEquals("Sign in", "Sign out");
	  	   	}  
	
	@Then("user should not be in the profile page")
	public void user_should_not_be_in_the_profile_page() {
	    Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=authentication, error");
	     	}
	@Then("user should be in the Woman page")
	public void user_should_be_in_the_Woman_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_category=3&controller=category");
	}
}


