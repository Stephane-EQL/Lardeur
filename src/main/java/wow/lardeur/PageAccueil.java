package wow.lardeur;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PageAccueil {

	@FindBy(xpath="//div[@class='as-oil-l-item initial-btn-wrapper']") 
	WebElement cookies;
	
	@FindBy(name="q") 
	WebElement name;
	
	
	public void clickCookies (WebDriver driver) throws InterruptedException {	
	cookies.click();			
	}
	
	
	public PageRecherche Research (WebDriver driver, String recherche) {
		name.clear();
		name.sendKeys(recherche);
		name.sendKeys(Keys.RETURN);	
		return PageFactory.initElements(driver, PageRecherche.class);
			
	}

}
