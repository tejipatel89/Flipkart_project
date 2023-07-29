package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Config.Environmenturls;

public class BaseClass extends Environmenturls {
	
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public static void BB() {
		

//		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Project\\345dipuo\\chromedriver.exe");
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--Incognito");
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability(ChromeOptions.CAPABILITY, opt);
//		 driver = new ChromeDriver(caps);
				
			
	    System.setProperty("webdriver.gecko.driver", "F:\\Framework_new\\geckodriver.exe");
	    
			FirefoxOptions opt = new FirefoxOptions();
			opt.addArguments("-private");				
		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, opt);				
			driver = new FirefoxDriver(caps);
			
			//driver = new FirefoxDriver();
		 
		 
				
				System.out.println("Browser Launched");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
