package Tests;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginPageTests extends BaseClass {

	@Test(priority = 1)
	public void AMlogin() {
		
		driver.get(Amazone);
		LoginPage a = new LoginPage(driver);
		a.login("9168750957", "passwordoftej");
		
	}
	
	@Test(priority = 2, enabled=false)
	public void verifyelements() {
		LoginPage b = new LoginPage(driver);
		b.verifyelements();
		
		
	}
	

	
	
	
}
