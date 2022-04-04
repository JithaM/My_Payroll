package bible;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Base;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.WaitUtility;

public class LoginTest extends Base {
	
    
	LoginPage loginpageobj;
	HomePage homepageobj;
	@Test(priority = 1)
 	public void TC_01verifyuserloginwithvalidcredentials() throws IOException, InterruptedException {
		loginpageobj=new LoginPage(driver);
		homepageobj=new HomePage(driver);
		driver.manage().timeouts().pageLoadTimeout(WaitUtility.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		Assert.assertEquals(true, homepageobj.homepagetitle().isDisplayed());
		  WaitUtility.HARD_WAIT(2000);
     	  }
	@Test(priority=2)
	public void TC_02verifyuserloginwithinvalidcredentials() throws IOException, InterruptedException {
		loginpageobj=new LoginPage(driver);
		loginpageobj.carollogoutoption().click();
		WaitUtility.waitForElement(driver, loginpageobj.logoutbutton());
		loginpageobj.logoutbutton().click();
		loginpageobj.enterUsername(ExcelUtility.getString(2, 0, Constants.EXCELFILE, "Login"));
		loginpageobj.enterPassword(ExcelUtility.getString(2, 1, Constants.EXCELFILE, "Login"));
		WaitUtility.HARD_WAIT(2000);
		loginpageobj.loginbutonclick();
		WaitUtility.waitForElement(driver, loginpageobj.incorrectuserpwdmessage());
		Assert.assertEquals(true, loginpageobj.incorrectuserpwdmessage().isDisplayed());
		
	}
			
}
