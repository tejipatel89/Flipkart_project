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
		String Ele2 = "& Orders";
		String loginname  = "Tejbahadur";
		
		By mobileno =  By.xpath("//*[@id='ap_email_login']");     //input[@id='ap_email']
		By Continue =  By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/span/form/span/span/input");
		By password =  By.xpath("//*[@id='ap_password']");
		By SigninButton = By.xpath("//*[@id='signInSubmit']");
		//WebElement ElementAll = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']//following::span[text()='All']"));		
		By SigninButton2 = By.xpath("//*[@id='auth-signin-button']");
		By ElementAll = By.xpath("//i[@class='hm-icon nav-sprite']//following::span[text()='All']");		
		//WebElement ElementAmazonepay = driver.findElement(By.xpath("//a[contains(@href, '/gp/sva/dashboard?ref_=nav_cs_apay')]"));		
		By ElementOrders = By.xpath("/html/body/div[1]/header/div[1]/div[1]/div[3]/div/a[1]/span[2]");
	    By Hellobefore =  By.xpath("//div[@class='nav-line-1-container']//following::span[text()='TEJBAHADUR']");
		By Helloafter = By.xpath("//*[@id='nav-link-accountList-nav-line-1']");
		
		public LoginPage(WebDriver driver1) {
		this.driver = driver1;					}
		
		public void login(String id, String pas) throws InterruptedException {

			driver.findElement(mobileno).sendKeys(id);
			driver.findElement(Continue).click();
			driver.findElement(password).sendKeys(pas);
			driver.findElement(SigninButton).click();
			Thread.sleep(45000);
			driver.findElement(SigninButton2).click();
			String loginname2 =driver.findElement(Helloafter).getText();
			System.out.println(loginname2);
			Thread.sleep(65);
			//Assert.assertEquals(loginname, loginname2);			
			//System.out.println("Loginsucceeded ");
			
			

		}
		
		public void verifyelements() {
			//String Ele11 = ((WebElement) ElementAll).getText();
		//	String Ele22 = ((WebElement) ElementAmazonepay).getText();
			
			//String Ele11 =driver.findElement(ElementAll).getText();	
			//System.out.println(Ele11);
		//	Assert.assertEquals(Ele1, Ele11);			
			//System.out.println("All link is present. ");
			
			
			String Ele22 =driver.findElement(ElementOrders).getText();
			System.out.println("Element Found");
			System.out.println(Ele22);
			Assert.assertEquals(Ele2, Ele22);
			
			System.out.println("Orders menu is present. ");
			
			
			
		}
		
}
