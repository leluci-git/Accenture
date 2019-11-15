package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomanArticles {
WebDriver driver;

	
	public WomanArticles(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul@class = 'product_list grid row']/li")//tomas un ul que esta dentro de una clase  '' y el li busca 
	List<WebElement> articles;
	
	@FindBy(xpath =  "//span[text() = 'add to cart']")
			List<WebElement> addToCart;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to')]")
	WebElement proceded;
	
	public void selectArticle( int index) {
		if (index <= articles.size()-1) {
			Actions ac = new Actions(driver);
			ac.moveToElement(articles.get(index)).perform();
			addToCart.get(index).click();
			
		}else {
			System.out.println("Error");
		}
	}
	
	public void clickProceedTo() {
		proceded.click();
		
	}
}
