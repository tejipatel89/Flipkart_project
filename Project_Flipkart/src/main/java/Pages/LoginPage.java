package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {

	
		
		WebDriver driver;
		
		By mobileno =  By.xpath("//input[@id='ap_email']");     //input[@id='ap_email']
		By Continue =  By.xpath("//input[@id='continue']");
		By password =  By.xpath("//input[@id='ap_password']");
		By SigninButton = By.xpath("//input[@id='signInSubmit']");
	
		
		public LoginPage(WebDriver driver1) {
			this.driver = driver1;					}
		
		public void login(String id, String pas) {

			driver.findElement(mobileno).sendKeys(id);
			driver.findElement(Continue).click();
			driver.findElement(password).sendKeys(pas);
			driver.findElement(SigninButton).click();

		}
		
}
