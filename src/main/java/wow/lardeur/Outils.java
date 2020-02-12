package wow.lardeur;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Outils {

	private static String BROWSER=System.getProperty("browser");

	public static void SelectDriver () {
			
		if (BROWSER.equals("Chrome")) {           
			WebDriver driver = new ChromeDriver();
		} else if (BROWSER.equals("Firefox")) {
			WebDriver driver = new FirefoxDriver();
		}
	}
}
