package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Login;

public class browser {
	public static WebDriver driver;
	public static Actions act;
	public WebDriverWait wait; 
	
	public static void setDriver() throws Exception {
		Prop.setupProperties();
		String driverName = Prop.getProperty("browser");
		
		if(driverName.equals("chrome")) {
			setChromeDriver();
		}else if(driverName.equals("firefox")) {
			setFirefoxDriver();
			
		}else {
			System.out.println("invalid Driver name");
		}
		act = new Actions(driver);
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void  getUrl() {
		driver.navigate().to(Prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	private static void setFirefoxDriver() {
		String driverpath=System.getProperty("user.dir")+"\\driver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		driver =new FirefoxDriver();
	}

	private static void setChromeDriver() {
		
		String driverpath=System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" ,driverpath);
		driver =new ChromeDriver();
	}

	public static void closeBrowser() {
		driver.quit();
		
	}
	
}
