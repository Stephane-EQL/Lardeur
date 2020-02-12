package wow.lardeur;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Assert;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class CheckLoot_Test {

	String recherche = "Lardeur";
		
	@Test
	public void Cnx() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://fr.wowhead.com/");
		driver.manage().window().maximize();
		
		PageAccueil page_accueil = PageFactory.initElements(driver, PageAccueil.class);
				
		page_accueil.clickCookies(driver);		
		PageRecherche page_recherche = page_accueil.Research(driver, recherche);
		
		PagePNJ page_pnj = page_recherche.PNJClick(driver);
		PageLoot page_loot = page_pnj.LootClick(driver);
		
		String listeObservee = page_loot.itemlist.getText();
		System.out.println(listeObservee);
		BufferedWriter listeO = new BufferedWriter(new FileWriter("ListeTxt.txt"));
		
			
	}

}
