package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class WhenLogin {

	
	  WebDriver driver = GivenLogin.driver;
	
	
	@When("user enter valids email address {string}")
	public void user_enter_valids_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("email")).sendKeys(email);
		
	}

	@When("user enter valids password {string}")
	public void user_enter_valids_password(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("passwd")).sendKeys(pass);
	}

	@When("user clic the sign in button")
	public void user_clic_the_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("SubmitLogin")).click();
		//id SubmitLogin
	    
	}
	
	@When("user enter invalids email address {string}")
	public void user_enter_invalids_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(email);
	}

	

	

	
	


}