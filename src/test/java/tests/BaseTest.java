package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import setup.*;
import pages.*;

public class BaseTest {
	
	ExcelSetup excelSetup;
	DriverSetup driverSetup;
	
	WebDriver driver;
	
	BookingDetailsPage bdp;
	FaresPage fp;
	HomePage hp;
	PaymentPage pp;
	
	String browser;
	String sheetName;
	
	@BeforeTest
	public void setup() throws Exception {
		
		excelSetup = new ExcelSetup();
		driverSetup = new DriverSetup();
		
		sheetName = "InputTestData";
		browser = excelSetup.getExcelData(sheetName, 1, 0);
		
		driver = driverSetup.getWebDriver(browser);
		
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		bdp = new BookingDetailsPage(driver);
		fp = new FaresPage(driver);
		hp = new HomePage(driver);
		pp = new PaymentPage(driver);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
