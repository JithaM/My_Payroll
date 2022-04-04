package bible;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Base;
import pages.TimesheetPage;
import utilities.PageUtility;
import utilities.WaitUtility;

public class TimesheetTest extends Base {
	
	TimesheetPage timesheetpageobj;
	@Test
	public void TC_21generateslip() throws InterruptedException {
		
		timesheetpageobj=new TimesheetPage(driver);
		timesheetpageobj.timesheetvisible();
		timesheetpageobj.generatepayslipoption();
		WaitUtility.HARD_WAIT(2000);
		PageUtility.handleAlert(driver);
		PageUtility.acceptAlert(driver);
		Assert.assertFalse(timesheetpageobj.generatepayslipoption.isEnabled());
	}

	@Test
	public void TC_22generateinvoice() throws InterruptedException {
		
		timesheetpageobj=new TimesheetPage(driver);
		timesheetpageobj.timesheetvisible();
		timesheetpageobj.generateinvoicebutton();
		WaitUtility.HARD_WAIT(2000);
		PageUtility.handleAlert(driver);
		PageUtility.acceptAlert(driver);
		Assert.assertFalse(timesheetpageobj.generateinvoicebutton.isEnabled());
		
	}
	
	@Test
	
	public void TC_23Approvetimesheet() {
				
		timesheetpageobj=new TimesheetPage(driver);
		timesheetpageobj.timesheetvisible();
		timesheetpageobj.approvedtimesheet();
		timesheetpageobj.approvedtimesheetview();
		String headingactual= timesheetpageobj.timesheetheadingvisible.getText();
		Assert.assertEquals(headingactual, "TIMESHEET# 5");
		
		
	}
	
	@Test
	public void TC_24createTimesheet() throws InterruptedException {
		
		timesheetpageobj=new TimesheetPage(driver);
		timesheetpageobj.timesheetvisible();
		timesheetpageobj.createtimesheetbtn();
		timesheetpageobj.createtimesheetskip();
		PageUtility.acceptAlert(driver);
		WaitUtility.waitForElement(driver, timesheetpageobj.createtimesheetheading);
		String actualheading=timesheetpageobj.createtimesheetheading.getText();
		WaitUtility.HARD_WAIT(2000);
		Assert.assertEquals(actualheading, "CREATE TIMESHEET");
		
	}
	

	
	
}
