package wow.lardeur;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class CheckLoot_Test {

	WebDriver driver; 
	String recherche = "Lardeur";
	
	
	@Before	
	public void setUp() throws InterruptedException {
	
	driver = Outils.SelectDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.get("https://fr.wowhead.com/");		
	driver.manage().window().maximize();
	}
	
	@Test
	public void Cnx() throws InterruptedException, IOException {		
				
		PageAccueil page_accueil = PageFactory.initElements(driver, PageAccueil.class);
				
		page_accueil.clickCookies(driver);		
		PageRecherche page_recherche = page_accueil.Research(driver, recherche);
		
		PagePNJ page_pnj = page_recherche.PNJClick(driver);
		PageLoot page_loot = page_pnj.LootClick(driver);
		
		//String listeObservee = page_loot.itemlist.getText();
		//System.out.println(listeObservee);
		//BufferedWriter listeO = new BufferedWriter(new FileWriter("ListeTxt.txt"));
		page_loot.collectLootStats(driver);
		
		
		
	}

}

