package wow.lardeur;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PageAccueil {

	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[2]/button") 
	WebElement cookies;
	
	@FindBy(name="q") 
	WebElement name;
	
	
	public void clickCookies (WebDriver driver) throws InterruptedException {
	Thread.sleep(3000);
	cookies.click();			
	}
	
	
	public PageRecherche Research (WebDriver driver, String recherche) {
		name.clear();
		name.sendKeys(recherche);
		name.sendKeys(Keys.RETURN);	
		return PageFactory.initElements(driver, PageRecherche.class);
			
	}

}
