package bible;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Base;
import constants.Constants;
import pages.DeductionPage;
import utilities.ExcelUtility;

public class DeductionTest extends Base{

	DeductionPage deductionpageobj;
	@Test
	public void TC_17adddeduction() throws IOException, InterruptedException {
		deductionpageobj=new DeductionPage(driver);
		deductionpageobj.deductionvisible();
		deductionpageobj.deductioneditworker();
		deductionpageobj.deductionadd();
		deductionpageobj.deductionworkerselect();
		deductionpageobj.workerselectdropdown.sendKeys(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Deduction"));
		deductionpageobj.workerselectdropdown.sendKeys(Keys.ENTER);		
		deductionpageobj.deductiontypeworker(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Deduction"));
		deductionpageobj.deductionworkeramount.sendKeys(ExcelUtility.getNumeric(1, 2, Constants.EXCELFILE, "Deduction"));
		deductionpageobj.deductioneffectivefrom.sendKeys(ExcelUtility.getNumeric(1, 3, Constants.EXCELFILE, "Deduction"));
		deductionpageobj.deductionsavebtn();
		Assert.assertEquals(deductionpageobj.workerdedcutionname.getText(), "Worker1qa");
		
		
	}
	
	public void TC_27verifymandatoryfields() {
		
		deductionpageobj=new DeductionPage(driver);
		deductionpageobj.deductionvisible();
		deductionpageobj.deductioneditworker();
		deductionpageobj.deductionadd();
		
	}
}
