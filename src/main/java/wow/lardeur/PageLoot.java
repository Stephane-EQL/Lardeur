package wow.lardeur;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class PageLoot {

	WebDriver driver = new ChromeDriver();

	@FindBy(xpath="//div[@id='tt2168']") 
	WebElement itemlist;

	@FindBy(xpath="//b[@class='q3']//ancestor::table[@style]//b[@class='q3']")
	WebElement item_name;

	@FindBy(xpath="//b[@class='q3']//ancestor::table[@style]//span[@class='q']")
	WebElement item_level;

	@FindBy(xpath="//b[@class='q3']//ancestor::div[contains(@id, 'tt')]//span")
	WebElement span_list;


	public void collectLootStats (WebDriver driver) {
		By mySelector = By.xpath("//b[@class='q3']//ancestor::div[contains(@id, 'tt')]//span");
		List<WebElement> myElements = driver.findElements(mySelector); {
			for(WebElement e : myElements) {
				System.out.println(e.getText());
			}
		}
	}

	public List<String> loadFile(String filePath) throws FileNotFoundException {
		   
	    URI uri = null;
	    
	    File file = new File(filePath);
	    ArrayList<String> list = new ArrayList<String>();
	    if(file.exists()) {
	    	Scanner s = new Scanner(file, "UTF-8");
	    	
	    	while (s.hasNextLine()){
	    		list.add(s.nextLine());
	    	}
	    	s.close();
	    	
	    	}
	    return list;
	}
	
}





//nomobjet
//niveau
//matiere
//statistiques
//prix


