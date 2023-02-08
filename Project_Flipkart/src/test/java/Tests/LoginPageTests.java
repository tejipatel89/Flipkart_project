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
}
