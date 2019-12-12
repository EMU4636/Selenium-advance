package common;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SharedMethod {
	
	WebDriver dr;
	Actions act;
	
	public SharedMethod(WebDriver dr) {
	    this.dr = dr;
	}
	
	public void verifyTitle(String expectedTitle) {
		String actualTitle = dr.getTitle();
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Title matiched");
		}
		else{
			System.out.println("Title did not matched");
		}
	}
	
	
	public void verifyURL(String expectedURL) {
		String actualURL = dr.getCurrentUrl();
		if(actualURL.contains(expectedURL)) {
			System.out.println("Right URL");
		}
		else {
			System.out.println("Wrong page");
	
	    }	
	}
	
	public void closePopupBox(WebElement element) {
		if(element.isDisplayed()) {
			element.click();
		}
		else {
			System.out.println("No PopUpBox");
		}
	}
	
	public void typeOnElement(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	public void mySleep(long sceond) throws InterruptedException {
		Thread.sleep(sceond);
	}
	
	
	public void getSize(By by) {
		int sizes = dr.findElements(by).size();
		System.out.println(sizes);	
	}
	
	public void verifyLogo(By a) {
		
		if(dr.findElement(a).isDisplayed()) {
			System.out.println("Element is Displayed");
		}
		else {
			System.out.println("Element not Visiable");
		}
	}
	
	public void getTitleFromLink(By a, By b) {
		int size =dr.findElements(a).size();
		System.out.println(size);
		for(int i=1; i<=size; i++) {
			dr.findElement(b).click();
			dr.getTitle();
			dr.navigate().back();	
	     }
	}
	
	public void rightClick(WebElement target) {
        act = new Actions(dr);
        act.contextClick(target).build().perform();
     }

	public void screenShot() {
		int num=(int)Math.random();
		File f=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\13474\\eclipse-workspace\\TestNGhomeWork\\screenShot " + num + " .png));
	}
	
	
	
	
	
	public void windowHandle() {
		 
		 String pWind= dr.getWindowHandle();
		Set<String> cWind=  dr.getWindowHandles();
		
		for(String wind:cWind) {
			if(!wind.equals(pWind)) {
				dr.switchTo().window(wind);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
