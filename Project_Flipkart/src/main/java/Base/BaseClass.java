package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Config.Environmenturls;

public class BaseClass extends Environmenturls {
	
	public static WebDriver driver;

	@BeforeSuite
	public static void BB() {
		

		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Project\\345dipuo\\chromedriver.exe");

		 //driver = new ChromeDriver();
				System.setProperty("webdriver.gecko.driver", "F:\\Framework_new\\geckodriver.exe");

				driver = new FirefoxDriver();
				System.out.println("Browser Launched");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
