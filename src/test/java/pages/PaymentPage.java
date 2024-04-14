package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

	@FindBy(xpath = "//span[@id='totalAmountSpan']")
	WebElement finalFare;
	
	public PaymentPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public void displayPrice() {
		
		System.out.println("\n\nRs. " + finalFare.getText() + "\n\n");
		
	}

}
