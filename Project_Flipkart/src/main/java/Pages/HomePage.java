package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	WebDriver driver;

	By Sell = By.xpath("//div[@id='nav-xshop']/a[1]");
	By Ele2 = By.xpath("//div[@id='nav-xshop']/a[2]");
	By Ele3 = By.xpath("//div[@id='nav-xshop']/a[3]");
	By Ele4 = By.xpath("//div[@id='nav-xshop']/a[4]");
	// By AmazoneminiTvi = By.xpath("//div[@id='nav-xshop']/a[2]");
	// By Best_sellers= By.xpath("//a[text()='Best Sellers'][@class='nav-a ']");
	// By Mobiles = By.xpath("//a[text()='Mobiles'][@class='nav-a ']");
	By Ele5 = By.xpath("//div[@id='nav-xshop']/a[5]");
	By Ele6 = By.xpath("//div[@id='nav-xshop']/a[6]");

	By Searchbox = By.xpath("//input[@id='twotabsearchtextbox']");
	By SearchButton = By.xpath("//input[@id='nav-search-submit-button']");
	By SearchButton_clean = By.xpath("//input[@id='twotabsearchtextbox']");

	By serach_suggestionoption = By.xpath("//div[@class='s-suggestion-container']");
	String sug_name = "laptop bag";

	By Home_All = By.xpath("//i[@class='hm-icon nav-sprite']");
	By Cat_Mob_Comp = By.xpath("//div[text()='Mobiles, Computers']");
	By Screen_prot = By.xpath("//a[text()='Screen Protectors']");
	By power_bank = By.xpath("//span[text()='Power banks']");
	
	
	By Firstmenu_mobile  =  By.xpath("//a[text()='Mobiles']");
	By secondMenu_mobile  = By.xpath("//a[@class='nav-a nav-hasArrow']/span[contains(text(), 'Mobiles & Accessories')]");
	By HoverElements = By.xpath("//div[@class='nav-template nav-flyout-content']/div[1]/div[1]/ul[@class='mm-category-list']/li");
	String charger =  "Chargers";
	By Topbrand =  By.xpath("//span[contains(text(), 'Top Brands')]");
	By Samsung_chargr = By.xpath("//span[contains(text(), 'Samsung Original 25W Single Port')]");
	
	
	By Foot1 = By.xpath("//a[text()= 'Australia']");
	By Foot2 = By.xpath("//a[text()= 'Brazil']");
	By Foot3 = By.xpath("//a[text()= 'Canada']");
	By Foot4 = By.xpath("//a[text()= 'China']");
	By Foot5 = By.xpath("//a[text()= 'France']");
	By Foot6 = By.xpath("//a[text()= 'Germany']");
	
	
	
	
	

	public HomePage(WebDriver driver1) {
		this.driver = driver1;
	}

	public void CheckMenus() {

		List<String> expected = new ArrayList<>();

		expected.add(driver.findElement(Sell).getText());
		expected.add(driver.findElement(Ele2).getText());
		expected.add(driver.findElement(Ele3).getText());
		expected.add(driver.findElement(Ele4).getText());
		expected.add(driver.findElement(Ele5).getText());
		expected.add(driver.findElement(Ele6).getText());

		System.out.println("Expected Menues sequence is as " + expected);

		List<String> original1 = new ArrayList<String>();

		for (int i = 1; i <= 6; i++) {

			WebElement ele = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[" + i + "]"));

			original1.add(ele.getText());

		}

		System.out.println("Menues sequence is as " + original1);

		Boolean abc = expected.equals(original1);

		System.out.println(abc);

		if (abc) {

			System.out.println("Menues Squence is proper");
		} else {
			System.out.println("Menues Squence is not proper");
		}
	}

	public void Searchitem(String item) {

		System.out.println("Normal Search");
		driver.findElement(Searchbox).sendKeys(item);
		driver.findElement(SearchButton).click();
		driver.findElement(SearchButton_clean).clear();
	}

	public void SuggestionSearch(String item) {

		System.out.println("Suggestion search");

		driver.findElement(Searchbox).sendKeys(item);

		List<WebElement> serach_suggestionlist = driver.findElements(serach_suggestionoption);

		for (int k = 0; k < serach_suggestionlist.size(); k++) {

			String s = serach_suggestionlist.get(k).getText();

			System.out.println(s);

			if (serach_suggestionlist.get(k).getText().contains("bag")) {
				
				System.out.println("Laptop Bag found and going to click");

				serach_suggestionlist.get(k).click();
				break;

			}
		}

		System.out.println("Suggestion search Ends here");

	}

	public void sliderwindowselectprduct() {

		System.out.println("Slider window starts");
		
		// Thread.sleep(3000);
		
		

		driver.findElement(Home_All).click();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(Cat_Mob_Comp).click();
		driver.findElement(Screen_prot).click();

		boolean powerbank_present = driver.findElement(power_bank).isDisplayed();

		if (powerbank_present) {

			System.out.println("Power Bank option is present ");
			
		}

		else {

			System.out.println("Power Bank option is NOT present ");
		}
	}
	
	
	
	public void verifySamsungCharger() {
		
		System.out.println("verify Samsung Charger starts");
		driver.findElement(Firstmenu_mobile).click();
		
		Actions act = new Actions(driver);
		WebElement secondMenu_mobilee = driver.findElement(secondMenu_mobile);
		act.moveToElement(secondMenu_mobilee).build().perform();
		
		List<WebElement> mobileList= driver.findElements(HoverElements);
		
		for (int z=0; z<mobileList.size(); z++) {
			
			//By q = mobileList.get(z);
			String p = mobileList.get(z).getText();
			
			System.out.println(p);
			
			if (p.equalsIgnoreCase(charger)) {
				
				System.out.println("Chargers found and going to click");
				mobileList.get(z).click();
				
				break;
				
			}
		}
		
				driver.findElement(Topbrand).click();
		
		Boolean sam_char_displayed = driver.findElement(Samsung_chargr).isDisplayed();
		
		if(sam_char_displayed) {
			
			System.out.println("Samsung Charger Element is present on the Page");
		}
		
		else {
			
			System.out.println("Samsung Charger is not present");
			
		}
		
		
		
		
	}
	
	public void CheckFooter() {

		List<String> expected = new ArrayList<>();

		expected.add(driver.findElement(Foot1).getText());
		expected.add(driver.findElement(Foot2).getText());
		expected.add(driver.findElement(Foot3).getText());
		expected.add(driver.findElement(Foot4).getText());
		expected.add(driver.findElement(Foot5).getText());
		expected.add(driver.findElement(Foot6).getText());

		System.out.println("Expected Menues sequence is as " + expected);

		List<String> original1 = new ArrayList<String>();

		for (int i = 1; i <= 6; i++) {

			//WebElement ele = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[" + i + "]"));
			WebElement ele = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//a[@class='nav_a']"));
			
			

			original1.add(ele.getText());

		}

		System.out.println("Menues sequence is as " + original1);

		Boolean abc = expected.equals(original1);

		System.out.println(abc);

		if (abc) {

			System.out.println("Menues Squence is proper");
		} else {
			System.out.println("Menues Squence is not proper");
		}
	}

	
	
	
	

}
