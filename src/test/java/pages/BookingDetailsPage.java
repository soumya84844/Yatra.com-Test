package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookingDetailsPage extends BasePage {

	@FindBy(xpath = "//input[@id='additionalContactEmail']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='additionalContactMobile']")
	WebElement mobile;
	
	@FindBy(xpath = "//select[@id='title0']")
	WebElement title;
	
	@FindBy(xpath = "//input[@id='travellerf0']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='travellerl0']")
	WebElement lastName;
	
	@FindBy(xpath = "//button[@class='button primary pax-proceed-btn cursor-pointer']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//div[@id='checkoutBase']/div[12]//button[2]")
	WebElement confirmBtn;
	
	@FindBy(xpath = "//div[@class='overlay-holder new-theme force-refresh-overlay body-stop-scroll']//button[2]")
	WebElement seatBtn;
	
	@FindBy(xpath = "//button[@id='gtm_saveflightreview']")
	WebElement paymentBtn;
	
	@FindBy(xpath = "//input[@ng-click='continueWithInsurance(false)']")
	WebElement insuranceBtn;
	
	public BookingDetailsPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public void fillDetails(String email, String mobile, String title, String firstName, String lastName) {
		
		this.email.sendKeys(email);
		this.mobile.sendKeys(mobile);
		
		Select select = new Select(this.title);
		select.selectByVisibleText(title);
		
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		
	}
	
	public void submitDetails() throws Exception {
		
		Actions actions = new Actions(driver);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", continueBtn);
		
		Thread.sleep(1000);
		
		continueBtn.click();
		
		Thread.sleep(1000);
		
//		confirmBtn.click();
		actions.moveToElement(confirmBtn).click().build().perform();
		
		Thread.sleep(3000);
		
//		seatBtn.click();
		actions.moveToElement(seatBtn).click().build().perform();
		
		Thread.sleep(1000);
		
		jse.executeScript("arguments[0].scrollIntoView()", paymentBtn);
		paymentBtn.click();
		
		Thread.sleep(1000);
		
		insuranceBtn.click();
		
	}

}
