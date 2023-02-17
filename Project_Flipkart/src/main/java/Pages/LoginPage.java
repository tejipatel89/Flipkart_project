package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPage {

	
	WebDriver driver;
		
		
		String Ele1= "All";
		String Ele2 = "Amazon Pay";
		
		By mobileno =  By.xpath("//input[@id='ap_email']");     //input[@id='ap_email']
		By Continue =  By.xpath("//input[@id='continue']");
		By password =  By.xpath("//input[@id='ap_password']");
		By SigninButton = By.xpath("//input[@id='signInSubmit']");
		//WebElement ElementAll = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']//following::span[text()='All']"));
		
		By ElementAll = By.xpath("//i[@class='hm-icon nav-sprite']//following::span[text()='All']");
		
		//WebElement ElementAmazonepay = driver.findElement(By.xpath("//a[contains(@href, '/gp/sva/dashboard?ref_=nav_cs_apay')]"));
		
		
		By ElementAmazonepay = By.xpath("//a[contains(@href, '/gp/sva/dashboard?ref_=nav_cs_apay')]");
	
		
		public LoginPage(WebDriver driver1) {
			this.driver = driver1;					}
		
		public void login(String id, String pas) {

			driver.findElement(mobileno).sendKeys(id);
			driver.findElement(Continue).click();
			driver.findElement(password).sendKeys(pas);
			driver.findElement(SigninButton).click();

		}
		
		public void verifyelements() {
			//String Ele11 = ((WebElement) ElementAll).getText();
		//	String Ele22 = ((WebElement) ElementAmazonepay).getText();
			
			String Ele11 =driver.findElement(ElementAll).getText();			
			Assert.assertEquals(Ele1, Ele11);			
			System.out.println("All likn is present. ");
			
			
			String Ele22 =driver.findElement(ElementAmazonepay).getText();
			Assert.assertEquals(Ele2, Ele22);
			
			System.out.println("Amazon pay menu is present. ");
			
			
			
		}
		
}
