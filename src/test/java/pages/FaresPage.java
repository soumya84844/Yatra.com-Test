package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaresPage extends BasePage {

	@FindBy(xpath = "//button[@autom='morefares']")
	List<WebElement> viewFares;
	
	@FindBy(xpath="//div[@class='booknow-btn fs-14 pr-5']//tbody/tr[2]//button")
	WebElement book;
	
	public FaresPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public void clickViewFares() {
		
		viewFares.get(0).click();
		
	}
	
	public void clickBook() {
		
		book.click();
		
	}

}
