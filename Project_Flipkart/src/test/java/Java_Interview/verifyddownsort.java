package Java_Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class verifyddownsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\seleniumusefullcomponent\\geckodriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		System.out.println("Browser launched");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\seleniumusefullcomponent\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement dd = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));

		Select sel = new Select(dd);
		List<WebElement> opts = sel.getOptions();

		List<String> Act = new ArrayList<String>();

		for (WebElement temp1 : opts) {

			Act.add((temp1.getText()));
		}
		
		Act.remove("Select");

		System.out.println("List before Sorting Act" + Act);

		List<String> temp = new ArrayList<String>(Act);
//		for (WebElement optss : opts) {
//
//			temp.add((optss.getText()));
//		}
		
		temp.remove("Select");
		Collections.sort(temp);
		
		System.out.println("List After Sorting temp" + temp);
		
		boolean abc =temp.equals(Act);
		
		
		
		System.out.println(abc);
		
	
		
		if (abc) {
			
			System.out.println("Drop down list is sorted");
		}
		else {
			System.out.println("Drop down list is not sorted");
		}

	}

}
