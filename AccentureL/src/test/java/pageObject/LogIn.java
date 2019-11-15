package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(name = "email")
	WebElement lblEmail;
	
	@FindBy(name = "passwd")
	WebElement lbPass;
	
	@FindBy(id = "SubmitLogin")
	WebElement btnSignIn;
	
	
	public void sendEmail(String email) {
		lblEmail.sendKeys(email);
	}
	public void sendPass(String pass) {
		lbPass.sendKeys(pass);
	}
	public void clicSubmitLogin() {
		btnSignIn.click();
	}
	
	
		
	public void logInToPage() {
		
		lblEmail.sendKeys("test800@hotmail.com");
		lbPass.sendKeys("test123");
		
	}
}
