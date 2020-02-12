package wow.lardeur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePNJ {
	
	@FindBy(xpath="//table[@class='listview-mode-default']//a[@class='q3 listview-cleartext']") 
	WebElement listLoot;
	
	public PageLoot LootClick (WebDriver driver) {
		listLoot.click();
		return PageFactory.initElements(driver, PageLoot.class);
	}

		
	
	

}
