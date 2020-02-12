package wow.lardeur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRecherche {

	
	@FindBy(xpath="//td[@class='icon-boss-padded']/a[.='Lardeur']") 
	WebElement lardeur_boss;
	
	public PagePNJ PNJClick (WebDriver driver) {
		lardeur_boss.click();
		return PageFactory.initElements(driver, PagePNJ.class);
	}
}
