package bible;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Base;
import pages.PayslipcreatePage;
import utilities.WaitUtility;

public class PayslipCreateTest extends Base {
	
	PayslipcreatePage payslipcreateobj;
	
public void TC_19payslipscreate() {
		
	payslipcreateobj=new PayslipcreatePage(driver);
	payslipcreateobj.clickonpayslip();
		WaitUtility.waitForElement(driver, payslipcreateobj.payslipheadingverify);
		String payslipheadactual=payslipcreateobj.payslipheadingverify.getText();
		Assert.assertEquals(payslipheadactual, "PAYSLIPS");
}
@Test
	public void TC_30payslippdfview() {
		payslipcreateobj=new PayslipcreatePage(driver);
		payslipcreateobj.clickonpayslip();
		payslipcreateobj.payslippdfclick();
		String parent=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> itr=s.iterator();
		System.out.println(parent);
		String child="";
		while(itr.hasNext()) {
			child=(String) itr.next();
			System.out.println(child);
		}

		driver.switchTo().window(child);
		System.out.println(driver.switchTo().window(child).getTitle());
		driver.switchTo().window(parent);
		WaitUtility.waitForElement(driver, payslipcreateobj.payslipheadingverify);
		WaitUtility.waitForElement(driver, payslipcreateobj.payslipheadingverify);
	}
}