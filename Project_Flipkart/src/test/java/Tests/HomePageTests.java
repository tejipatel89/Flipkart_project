package Tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;

public class HomePageTests extends BaseClass {


		
		@Test(priority = 1)
		public void verifymenuSequence() {
			
			HomePage c = new HomePage(driver);
			c.CheckMenus();
						
		}
		
		
		
		@Test(priority = 2)
		public void CheckFooterr() {
			
			HomePage c = new HomePage(driver);
			c.CheckFooter();
		
		
		}
		
		@Test(priority = 3)
		public void searchitems() {
			
			HomePage c = new HomePage(driver);
			c.Searchitem("Laptop");
		
		
		}
		
		
		@Test(priority = 4, enabled=false)
		public void SuggestionSearch() {
			
			HomePage c = new HomePage(driver);
			c.SuggestionSearch("Laptop");
		
		
		}
		
		
		@Test(priority = 5)
		public void sliderwindowselectprductt() {
			
			HomePage c = new HomePage(driver);
			c.sliderwindowselectprduct();
		
		
		}
		
		@Test(priority = 7)
		public void VerifyLinks() throws IOException {
			
			HomePage D = new HomePage(driver);
			D.Linkscount();
		
		
		}
		
		@Test(priority = 6)
		public void verifySamsungChargerr() {
			
			HomePage c = new HomePage(driver);
			c.verifySamsungCharger();
		
		
		}
		
		

		
	


}
