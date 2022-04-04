package bible;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Base;
import constants.Constants;
import pages.ClientPage;
import pages.WorkerPage;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class WorkerTest extends Base{
	
	WorkerPage workerpageobj;
	ClientPage clientpageobj;
	
	public void TC_12workerpageload() throws InterruptedException {
		
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		WaitUtility.waitForElement(driver, workerpageobj.workerheadingvisible);
		String actualresult=workerpageobj.workerheadingvisible().getText();
		
		Assert.assertEquals(actualresult, "WORKERS");
			
	}
	
	public void TC_13workercreation() throws IOException, InterruptedException {
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		Thread.sleep(2000);
		workerpageobj.createworkerclick();
		Thread.sleep(2000);
		workerpageobj.workergenderselectdropdwn(ExcelUtility.getString(1, 0, Constants.EXCELFILE, "Worker"));
		Thread.sleep(2000);
		workerpageobj.workerbranchdropdown(ExcelUtility.getString(1, 12, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerfirstnametextfield(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerdivisiondrpdwn(ExcelUtility.getString(1, 11, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerlastnametextfield(ExcelUtility.getString(1, 2, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerdateofborth.click();
		Thread.sleep(2000);
		workerpageobj.workerdateofborth().sendKeys(prop1.getProperty("workerdob"));
		workerpageobj.workeremployementtypedrpdwn(ExcelUtility.getString(1, 4, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerAddressLinetextfield(ExcelUtility.getString(1, 3, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerphonetextfield.sendKeys(ExcelUtility.getNumeric(1, 5, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerpayslipmethod(ExcelUtility.getString(1, 6, Constants.EXCELFILE, "Worker"));
		workerpageobj.workeremail(ExcelUtility.getString(1, 8, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerpostcode().sendKeys(ExcelUtility.getNumeric(1, 9, Constants.EXCELFILE, "Worker"));
		workerpageobj.workerninumber.sendKeys(ExcelUtility.getNumeric(1, 7, Constants.EXCELFILE, "Worker"));
		WaitUtility.HARD_WAIT(2000);
		PageUtility.ScrollBy(driver);
		workerpageobj.workernextbuttoncreate();
		WaitUtility.HARD_WAIT(2000);
		Assert.assertEquals(true, workerpageobj.workervisiblebankdetails.isDisplayed());
	}

	public void TC_14workersearchfirstname() throws InterruptedException, IOException {
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		WaitUtility.waitForElement(driver, workerpageobj.workerheadingvisible());
		workerpageobj.workersearchfirstnamefield(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Worker"));
		workerpageobj.workersearchbutton();
		Thread.sleep(2000);
		String workeractual=workerpageobj.workersearchverifyname.getText();
		Assert.assertEquals(workeractual, "Worker1qa");
		
	}
	
	public void TC_15enterworkerbankdetails() throws IOException, InterruptedException {
		workerpageobj=new WorkerPage(driver);
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		WaitUtility.waitForElement(driver, workerpageobj.workerheadingvisible());
		workerpageobj.workersearchfirstnamefield(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Worker"));
		workerpageobj.workersearchbutton();
		WaitUtility.HARD_WAIT(2000);
		workerpageobj.workereditbutton();
		workerpageobj.workervisiblebankdetails();
		workerpageobj.workerbankname.sendKeys("BankName");
		PageUtility.ScrollBy(driver);
		workerpageobj.workereditbanksavebtn();
		WaitUtility.waitForElement(driver, workerpageobj.workerheadingvisblebankdetails);
		Assert.assertEquals(true, workerpageobj.workerheadingvisblebankdetails.isDisplayed());
		
		
		
	}

	
	public void TC_16workerdelete() {
		workerpageobj=new WorkerPage(driver);
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		WaitUtility.waitForElement(driver, workerpageobj.workerheadingvisible());
		workerpageobj.workerdeletebutn();
		PageUtility.acceptAlert(driver);
		
	}
	
	
	
	public void TC_25workerexpenseverify() throws IOException, InterruptedException {
		
		workerpageobj=new WorkerPage(driver);
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		WaitUtility.waitForElement(driver, workerpageobj.workerheadingvisible());
		workerpageobj.workersearchfirstnamefield(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Worker"));
		workerpageobj.workersearchbutton();
		WaitUtility.HARD_WAIT(2000);
		workerpageobj.workereditbutton();
		workerpageobj.workerexpensebtn();
		String workeractualtitle=workerpageobj.workerexpensetitleverify.getText();
		Assert.assertEquals(workeractualtitle, "WORKER EXPENSES: WORKER1QA");
		
	}
	
	
	public void TC_26workerrateverify() throws IOException, InterruptedException {
		workerpageobj=new WorkerPage(driver);
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		WaitUtility.waitForElement(driver, workerpageobj.workerheadingvisible());
		workerpageobj.workersearchfirstnamefield(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Worker"));
		workerpageobj.workersearchbutton();
		WaitUtility.HARD_WAIT(2000);
		workerpageobj.workereditbutton();
		workerpageobj.workerratebtn();
		workerpageobj.rateclickclientsearch();
		workerpageobj.rateclienttextfield.sendKeys(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Client"));
		workerpageobj.rateclienttextfield.sendKeys(Keys.ENTER);
		workerpageobj.workerratesearch();
		String actualclientrate=workerpageobj.rateverifyclient.getText();
		Assert.assertEquals(actualclientrate, "Jitha1");
		
	}
	
	
	public void TC_27searchworkerwithallfilter() throws IOException {
		
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		workerpageobj.workersearchfirstname.sendKeys(ExcelUtility.getString(2, 1, Constants.EXCELFILE, "Worker"));
		workerpageobj.clientlastnamesearchtextfield(ExcelUtility.getString(2, 2, Constants.EXCELFILE, "Worker"));
		workerpageobj.clientpostcodesearchfield(ExcelUtility.getString(2, 3, Constants.EXCELFILE, "Worker"));
		workerpageobj.clientninumbersearchfield.sendKeys(String.valueOf(ExcelUtility.getNumeric(2, 4, Constants.EXCELFILE, "Worker")));
		workerpageobj.clientsearchbtn();
		String actualtextworker=workerpageobj.firstnameworkerverify.getText();
		Assert.assertEquals(actualtextworker, "Tom Mathew Xaviour");
	}
	@Test
	public void TC_28resetwithallfilter() throws IOException {
		
		workerpageobj=new WorkerPage(driver);
		workerpageobj.workersvisible();
		workerpageobj.workersearchfirstname.sendKeys(ExcelUtility.getString(2, 1, Constants.EXCELFILE, "Worker"));
		workerpageobj.clientlastnamesearchtextfield(ExcelUtility.getString(2, 2, Constants.EXCELFILE, "Worker"));
		workerpageobj.clientpostcodesearchfield(ExcelUtility.getString(2, 3, Constants.EXCELFILE, "Worker"));
		workerpageobj.clientninumbersearchfield.sendKeys(String.valueOf(ExcelUtility.getNumeric(2, 4, Constants.EXCELFILE, "Worker")));
		workerpageobj.clientresetbtn();
		String firstname=workerpageobj.workersearchfirstname.getText();
		Assert.assertEquals(firstname, "");
	}
	
	
	
}
