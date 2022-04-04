package bible;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Base;
import pages.InvoiceverifyPage;
import utilities.WaitUtility;

public class InvoiceverifyTest extends Base {
	
	InvoiceverifyPage invoiceverifyobj;
	




public void TC_18invoiceverify() {
		
	    invoiceverifyobj=new InvoiceverifyPage(driver);
	    invoiceverifyobj.invoicevisible();
		WaitUtility.waitForElement(driver, invoiceverifyobj.invoiceheadingverify);
		String invoiceheadingactual=invoiceverifyobj.invoiceheadingverify.getText();
		Assert.assertEquals(invoiceheadingactual, "INVOICE");
		
	}
@Test
public void TC_29invoicewindowhandle() throws InterruptedException {
	invoiceverifyobj=new InvoiceverifyPage(driver);
    invoiceverifyobj.invoicevisible();
	WaitUtility.waitForElement(driver, invoiceverifyobj.invoiceheadingverify);
	invoiceverifyobj.payrollpdfbtnclick();
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
	WaitUtility.waitForElement(driver, invoiceverifyobj.invoiceheadingverify);
	String invoiceheadingactual=invoiceverifyobj.invoiceheadingverify.getText();
	
	Assert.assertEquals(invoiceheadingactual, "INVOICE");
	
}
}
