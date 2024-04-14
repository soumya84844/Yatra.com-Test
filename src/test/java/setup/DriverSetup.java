package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverSetup {
	
	WebDriver driver;
	
	public WebDriver getWebDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-blink-features=AutomationControlled");
			op.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(op);
			
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			EdgeOptions op = new EdgeOptions();
			op.addArguments("--disable-blink-features=AutomationControlled");
			op.addArguments("--disable-notifications");
			
			driver = new EdgeDriver(op);
			
		}
		
		return driver;
		
	}

}
