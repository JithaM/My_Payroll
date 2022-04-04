package bible;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Base;
import pages.ReportPage;

public class ReportTest extends Base{
	
	ReportPage reportpageobj;
@Test
	public void TC_20deductionhistoryreport() {
		reportpageobj= new ReportPage(driver);
		reportpageobj.reportpageclick();
		reportpageobj.deductionhistoryreport();
		String deductionvisible=reportpageobj.deductionheadinvisible.getText();
		Assert.assertEquals(deductionvisible, "DEDUCTION HISTORY");
	}
}
