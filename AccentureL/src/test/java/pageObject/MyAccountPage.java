package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	//@FindBy(xpath = "//[contains(@text() = 'woman']")
	@FindBy(css = "woman")
	WebElement womanNavBarOption;
	
	public void cliclWomenNav() {
		
		womanNavBarOption.click();
	}
	
}
