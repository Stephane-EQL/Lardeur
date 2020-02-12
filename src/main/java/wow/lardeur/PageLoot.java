package wow.lardeur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLoot {
	
	@FindBy(xpath="//div[@id='tt2168']") 
	WebElement itemlist;
	
	@FindBy(xpath="//b[@class='q3']//ancestor::table[@style]//b[@class='q3']")
	WebElement item_name;
	
	@FindBy(xpath="//b[@class='q3']//ancestor::table[@style]//span[@class='q']" + 
			"	")
	WebElement item_level;
	
	
	
	//nomobjet
	//niveau
	//matiere
	//statistiques
	//prix
	

}
