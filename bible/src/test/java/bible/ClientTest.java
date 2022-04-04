package bible;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.Base;
import constants.Constants;
import pages.ClientPage;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ClientTest extends Base {

	
	ClientPage clientpageobj;
	PageUtility pageutilityobj;
	@Test(priority = 1)
	public void TC_03clientcreate() throws IOException, InterruptedException {
		
		clientpageobj=new ClientPage(driver);
		clientpageobj.homepagetitle();
		clientpageobj.clientcreateoption();
		clientpageobj.clienteditbranchdropdown(ExcelUtility.getString(1, 8, Constants.EXCELFILE, "Client"));
		clientpageobj.clienteditinvoiceorderdropdown(ExcelUtility.getString(1, 9, Constants.EXCELFILE, "Client"));
		clientpageobj.clienteditselectdivisiondropdwn(ExcelUtility.getString(1, 10, Constants.EXCELFILE, "Client"));
		clientpageobj.clientinvoicecontacttextfield(ExcelUtility.getString(1, 0, Constants.EXCELFILE, "Client"));
		clientpageobj.clientinvoicedeliverymethdropdwn(ExcelUtility.getString(1, 11, Constants.EXCELFILE, "Client"));
		clientpageobj.clientnametextfield(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Client"));
		clientpageobj.clientphonenumberfield().sendKeys(String.valueOf(ExcelUtility.getNumeric(1, 2, Constants.EXCELFILE, "Client")));
		clientpageobj.clientmasterdocument(ExcelUtility.getString(1, 12, Constants.EXCELFILE, "Client"));
		clientpageobj.clientaddressfield(ExcelUtility.getString(1, 3, Constants.EXCELFILE, "Client"));
		clientpageobj.clientsettlementdays.sendKeys(ExcelUtility.getNumeric(1, 4, Constants.EXCELFILE, "Client"));
		clientpageobj.clientemailfield(ExcelUtility.getString(1, 5, Constants.EXCELFILE, "Client"));
		clientpageobj.clientvatratedrpdwn(ExcelUtility.getString(1, 13, Constants.EXCELFILE, "Client"));
		clientpageobj.clientpostcodetextfield().sendKeys(String.valueOf(ExcelUtility.getNumeric(1, 6, Constants.EXCELFILE, "Client")));
		clientpageobj.clientcompanyregfield(ExcelUtility.getString(1, 7, Constants.EXCELFILE, "Client"));
		PageUtility.ScrollBy(driver);
		clientpageobj.clientsavebutton();
		WaitUtility.HARD_WAIT(2000);
		String expecteduser="JITHA1";
		String actualuser=clientpageobj.clientaddedheading().getText();
		Assert.assertEquals(actualuser, expecteduser);
	}
	@Test
	public void TC_04searchclientname() throws IOException, InterruptedException {
		clientpageobj=new ClientPage(driver);
		clientpageobj.clientsvisible();
		WaitUtility.waitForElement(driver, clientpageobj.clientsearchtextfield);
		clientpageobj.clientsearchtextfield.sendKeys(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Client"));
		clientpageobj.clientsearchbutton();
		WaitUtility.HARD_WAIT(2000);
		String actual=clientpageobj.clientnamesearchfield().getText();
		WaitUtility.HARD_WAIT(2000);
		Assert.assertEquals(actual, "Jitha1");
				
	}
	@Test
	public void TC_05searchclientid() throws IOException, InterruptedException {
		clientpageobj=new ClientPage(driver);
		clientpageobj.clientsvisible();
		WaitUtility.waitForElement(driver, clientpageobj.clientsearchtextfield);
		clientpageobj.clientidsearchfield().sendKeys(String.valueOf(ExcelUtility.getNumeric(1, 14, Constants.EXCELFILE, "Client")));
		WaitUtility.HARD_WAIT(2000);
		clientpageobj.clientsearchbutton();
		String actual=clientpageobj.clientidfoundsearchfield().getText();
		WaitUtility.HARD_WAIT(2000);
		Assert.assertEquals(actual, "1");
						
		}

	@Test(dataProvider = "getData")
	public void TC_06verifysearchclientnameidoption(String fname,String id,String reason) throws IOException, InterruptedException {
		clientpageobj=new ClientPage(driver);
		clientpageobj.clientsvisible();
		clientpageobj.clientsearchtextfield.sendKeys(fname);
		Thread.sleep(2000);
		clientpageobj.clientidsearchfield().sendKeys(id);
		Thread.sleep(2000);
		clientpageobj.clientsearchbutton();
		Thread.sleep(2000);
		//clientpageobj.clientsearchviewbutton();
		if(clientpageobj.clientseachelementfound.isDisplayed()) {
			assertTrue(true);
			
			}
		else if(clientpageobj.clientsearchnotfound.isDisplayed()){
			assertTrue(true);
			
		}
		
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][3];
				data[0][0]="JITHA1";
				data[0][1]="685";
				data[0][2]="searched user";
				
				data[1][0]="abin";
				data[1][1]="111";
				data[1][2]="notapplicable";
				
				return data;
	}
	@Test
	public void TC_07clientsearchviewoption() throws IOException, InterruptedException {
		clientpageobj=new ClientPage(driver);
		clientpageobj.clientsvisible();
		clientpageobj.clientsearchtextfield.sendKeys(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Client"));
		clientpageobj.clientsearchbutton();
		clientpageobj.clientsearchviewbutton();
		WaitUtility.HARD_WAIT(2000);
		String actualclient= clientpageobj.clientnameviewverify.getText();
		WaitUtility.HARD_WAIT(2000);
		assertEquals(actualclient, "Jitha1");
	}
	@Test
	public void TC_08clientsearcheditoption() throws IOException, InterruptedException {
		
		clientpageobj=new ClientPage(driver);
		clientpageobj.clientsvisible();
		clientpageobj.clientsearchtextfield.sendKeys(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Client"));
		clientpageobj.clientsearchbutton();
		Thread.sleep(2000);
		clientpageobj.clientnameeditbutton();
		Thread.sleep(2000);
		String clienteditverify=clientpageobj.clienteditnameverify.getText();
		Thread.sleep(2000);
		Assert.assertEquals(clienteditverify, "UPDATE CLIENT: JITHA1");
	}
	@Test
	
	public void TC_09clientresetnameidsearch() throws IOException, InterruptedException {
		
		clientpageobj=new ClientPage(driver);
		clientpageobj.clientsvisible();
		clientpageobj.clientsearchtextfield.sendKeys(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Client"));
		clientpageobj.clientidsearchfield().sendKeys(ExcelUtility.getNumeric(1, 14, Constants.EXCELFILE, "Client"));
		WaitUtility.HARD_WAIT(2000);
		clientpageobj.clientresetbutton();
		String actualresetvalue=clientpageobj.clientsearchtextfield.getText();
		Assert.assertEquals(actualresetvalue, "");
	}
	
	public void TC_10editclientdetails() throws IOException, InterruptedException {
		clientpageobj=new ClientPage(driver);
		clientpageobj.clientsvisible();
		clientpageobj.clientsearchtextfield.sendKeys(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Client"));
		clientpageobj.clientsearchbutton();
		Thread.sleep(2000);
		clientpageobj.clientnameeditbutton();
		clientpageobj.clientinvoicecontacttextfield.clear();
		clientpageobj.clientinvoicecontacttextfield.sendKeys("updated invoice");
		PageUtility.ScrollBy(driver);
		clientpageobj.clientsavebtn();
		String actualinvoicecontact=clientpageobj.invoicecontactedited.getText();
		Assert.assertEquals(actualinvoicecontact, "updated invoice");
		
	}
	
	
	
}
