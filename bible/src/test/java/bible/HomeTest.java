package bible;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import baseClass.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.WaitUtility;

public class HomeTest extends Base {

	
	HomePage homepageobj;
	LoginPage loginpageobj;
	
	@Test
	public void TC_11homepagevisible() throws InterruptedException {
		homepageobj=new HomePage(driver);
		WaitUtility.HARD_WAIT(2000);
		homepageobj.dashboardvisible();
		WaitUtility.waitForElement(driver, homepageobj.dashboardvisible);
		assertTrue(homepageobj.dashboardvisible.isDisplayed());
	}
	
}