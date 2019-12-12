package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.SharedMethod;

public class HomePage {
	
	WebDriver dr;
	SharedMethod sm;

	
	public HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id="LinkLogoNoHeading")
	By HomePageLogo;
	
	@FindBy(xpath="//div[@id='menuContainer']/ul/li")
	By topMenu;
	
	@FindBy(id="closeEmailPopup")
	WebElement EmailPopUp;
	
	@FindBy(xpath="//div[@id='menuContainer']/ul/li[4]")
	WebElement MenForNewWindo;
	
	public void HomepageTitleverify() throws InterruptedException {
		sm = new SharedMethod(dr);
		sm.closePopupBox(EmailPopUp);
		sm.mySleep(2000);
		sm.verifyTitle("Burlington: Shop Clothes, Shoes, Jewelry, Accessories");
	}

	public void HomePageURLverify() throws InterruptedException {
		sm = new SharedMethod(dr);
		sm.verifyURL("www.burlington.com");
		sm.mySleep(2000);
	}
	
	public void verifyHomeLogo() throws InterruptedException {
		sm = new SharedMethod(dr);
		sm.mySleep(3000);
		sm.verifyLogo(HomePageLogo);
	}
	
	public void  getSizeFromTopMenu() throws InterruptedException {
		sm = new SharedMethod(dr);
		sm.mySleep(2000);
		sm.getSize(topMenu);
	}
	
	
	public void closeEmailSignUpPopUp() {
		sm = new SharedMethod(dr);
		sm.closePopupBox(EmailPopUp);
	}
	
	public void getTitleFromTopMenuBar() {
		sm = new SharedMethod(dr);	
	}
	
	public void rightClick() throws InterruptedException {
		sm = new SharedMethod(dr);
		sm.rightClick(MenForNewWindo);
		sm.mySleep(3000);
	}
	
	
	
	
	
	
	
	
	
}
