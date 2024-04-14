package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//div[@class='booking-btn-flx']/div[1]/input")
	WebElement searchFlight;
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public void clickSearch() {
		
		searchFlight.click();
		
	}

}
