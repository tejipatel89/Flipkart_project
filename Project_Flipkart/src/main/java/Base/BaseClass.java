package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Project\\345dipuo\\chromedriver.exe");

		 //driver = new ChromeDriver();
				System.setProperty("webdriver.gecko.driver", "F:\\Framework_new\\geckodriver.exe");

				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}