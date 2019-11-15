package pages;

import utils.WebDriverSession;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class GivenLoginPage {

	public GivenLoginPage() {
		
		PageFactory.initElements(WebDriverSession.getWebDriverSession(), this);
	}
	
	 @FindBy (css=".login")
	 public WebElement login   ;
	 
	 @FindBy (css = ".banner")
	 public WebElement banner; 
	 
	 @FindBy (css = "Search_query_top")
	 public WebElement searchbar; 
	
	
	
	}

