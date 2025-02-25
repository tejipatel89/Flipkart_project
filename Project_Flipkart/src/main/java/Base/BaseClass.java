package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Config.Environmenturls;

public class BaseClass extends Environmenturls {
	
	public static RemoteWebDriver driver;

	@SuppressWarnings("deprecation")	
	@BeforeTest
	@Parameters("BrowserName")
	public static void BB(String browser) throws MalformedURLException {
		
if (browser.equalsIgnoreCase("Chrome")) {
//		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Project\\345dipuo\\chromedriver.exe");
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--Incognito");
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability(ChromeOptions.CAPABILITY, opt);
//		 driver = new ChromeDriver(caps); 
	
	
	 ChromeOptions opt = new ChromeOptions();
     opt.addArguments("--Incognito");
     DesiredCapabilities caps = new DesiredCapabilities();
     caps.setCapability(ChromeOptions.CAPABILITY, opt);
	 driver = new RemoteWebDriver(new URL("http://192.168.0.104:4444"), caps);
		 
}
				
else if (browser.equalsIgnoreCase("Firefox")) {
	    System.setProperty("webdriver.gecko.driver", "E:\\Framework_new\\geckodriver.exe");
	    
			//FirefoxOptions opt = new FirefoxOptions();
			//opt.addArguments("-private");				
		   // DesiredCapabilities caps = new DesiredCapabilities();
		   // caps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, opt);
		   // driver = new RemoteWebDriver(new URL("http://192.168.0.104:4444"), caps);
			//driver = new FirefoxDriver(caps);
			
			driver = new FirefoxDriver();
			}
		 
				
				System.out.println("Browser Launched");
				System.out.println("Browser Launchedtests");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
