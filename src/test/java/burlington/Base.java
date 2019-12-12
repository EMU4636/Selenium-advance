package burlington;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	WebDriver dr;
	
	@BeforeSuite
	public void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\13474\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void getWebSite() {
		dr.get("https://www.burlington.com");
	}
	
	
	@AfterTest
	public void closebrowser() {
		dr.close();
	}

}
