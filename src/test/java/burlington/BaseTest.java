package burlington;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver dr;
	
	
	
	@BeforeSuite
	public void dynamicOpenBrowser() throws IOException {
		
		Properties prop= new Properties();
		
		FileInputStream fls= new FileInputStream("C:\\Users\\13474\\eclipse-workspace\\TestNGhomeWork\\src\\test\\java\\burlington\\data.properties");
		
		prop.load(fls);
		
	String browserName = prop.getProperty("browser");
	
	if(browserName == "firefox") {
		System.setProperty("webdriver.gecko.driver", "");
		dr = new FirefoxDriver();
	}
	else if(browserName=="IE") {
		System.setProperty("", "");
		dr = new InternetExplorerDriver();
				
	}
	else {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\13474\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	            dr = new ChromeDriver(); 	
	}
	
	}	
	
	

	
	
		
	
	@AfterTest
	public void closeBrowser() {
		dr.close();
	}
	
	@AfterSuite
	public void quitBrowser() {
		dr.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
