package Settings;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DefaultSettings {

	private static WebDriver driver;

	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void getInicialization(String nameBrowser) {

		if (driver == null) {
			switch (nameBrowser) {
			case "Chrome":
				getChromeDriver();
				break;	
			case "Firefox":
				getFirefoxDriver();
				break;
			case "IE":
				getInternetExplorerDriver();
				break;
			default:
				getChromeDriver();
				break;
			}
		}
	}

	public static void closeBrowser() {

		if (driver != null) {
			driver.quit();
			driver = null;

		}
	}

	private static String getDriverBrowser(String name) {
		String navegador = getPath().concat("Navegadores") + File.separator + name;
		return navegador;
	}

	protected static String getPath() {
		String path = System.getProperty("user.dir") + File.separator;
		return path;
	}

	private static void getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", getDriverBrowser("chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	private static void getFirefoxDriver(){
		System.setProperty("webdriver.gecko.driver", getDriverBrowser("geckodriver.exe"));
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	private static void getInternetExplorerDriver(){
		
		System.setProperty("webdriver.ie.driver", getDriverBrowser("IEDriverServer.exe"));
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
	}
	
}
