package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObject.LogIn;
import pageObject.MyAccountPage;
import pageObject.WomanArticles;

public class WhenLogin {

	
	  WebDriver driver = SetUpClass.driver;//inicializar los metodos en la clase no en los metodos
	  LogIn lg;
	  WomanArticles wa;
	  MyAccountPage ma;
	
	  @When("user clic on sign in")
		public void user_clic_on_sign_in() {
		    // Write code here that turns the phrase above into concrete actions
		  lg = new LogIn(driver);
		    lg.clicSubmitLogin();
		}
		
	@When("user enter valids email address {string}")
	public void user_enter_valids_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
	  //  driver.findElement(By.id("email")).sendKeys(email);
		lg = new LogIn(driver);
	    lg.sendEmail(email);
		
	}

	@When("user enter valids password {string}")
	public void user_enter_valids_password(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("passwd")).sendKeys(pass);
		lg = new LogIn(driver);
		lg.sendPass(pass);
	}

	@When("user clic the sign in button")
	public void user_clic_the_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // driver.findElement(By.id("SubmitLogin")).click();
		//id SubmitLogin
	    lg = new LogIn(driver);
	    lg.clicSubmitLogin();
	}
	
	@When("user enter invalids email address {string}")
	public void user_enter_invalids_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(email);
	}



	

	@When("user clic on Woman")
	public void user_clic_on_Woman() {
	    // Write code here that turns the phrase above into concrete actions
		ma = new MyAccountPage(driver);
	    ma.cliclWomenNav();
	}
	
	@When("user clic on t-shirt")
	public void user_clic_on_t_shirt() {
	    // Write code here that turns the phrase above into concrete actions
	    wa = new WomanArticles(driver);
	    wa.selectArticle(0);
	    
	}

	

	@When("user clic on add to cart a t-shirt")
	public void user_clicl_on_add_to_cart_a_t_shirt() {
	    // Write code here that turns the phrase above into concrete actions
		wa = new WomanArticles(driver);
	    wa.clickProceedTo();
	}

	
	


}