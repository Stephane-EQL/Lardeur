package wow.lardeur;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Outils {

	public static String BROWSER=System.getProperty("browser");

	static WebDriver driver;
	
	public static WebDriver SelectDriver () {
			
		if (BROWSER.equals("Chrome")) {	
			System.setProperty("webdriver.chromedriver", "/lardeur/src/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		} else if (BROWSER.equals("Firefox")) {
			System.setProperty("webdriver.geckodriver", "/lardeur/src/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;
		}
		System.setProperty("webdriver.chromedriver", "/lardeur/src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
}
