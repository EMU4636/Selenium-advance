package burlington;

import org.testng.annotations.Test;

import pages.HomePage;

public class SmokeTest extends Base {
	
	HomePage homepage;
	
	
	@Test
	public void burlingtonTitleUrlLogo() throws InterruptedException {
		homepage = new HomePage(dr);
		homepage.HomepageTitleverify();
		homepage.HomePageURLverify();
		//homepage.verifyHomeLogo();	
		homepage.newWindo();
	}
	
	@Test
	public void burlingtonTopMenuBar() throws InterruptedException {
		homepage = new HomePage(dr);
		homepage.closeEmailSignUpPopUp();
		homepage.getSizeFromTopMenu();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
