package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class WorkerPage {
	
	WebDriver driver;
	
	public WorkerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//a[text()=\"Workers\"]")
	public WebElement workersvisible;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h1")
	public WebElement workerheadingvisible;
	
	@FindBy(xpath="//a[text()=\"Create Worker\"]")
	public WebElement createworkerclick;
	
	@FindBy(id="worker-gender")
	public WebElement workergenderselectdropdwn;
	
	@FindBy(id="worker-branch_id")
	public WebElement workerbranchdropdown;
	
	@FindBy(id="worker-first_name")
	public WebElement workerfirstnametextfield;
	
	@FindBy(id="worker-division_id")
	public WebElement workerdivisiondrpdwn;
	
	@FindBy(id="worker-last_name")
	public WebElement workerlastnametextfield;
	
	@FindBy(id="worker-employment_type")
	public WebElement workeremployementtypedrpdwn;
	
	@FindBy(id="worker-address1")
	public WebElement workerAddressLinetextfield;
	
	@FindBy(id="worker-phone")
	public WebElement workerphonetextfield;
	
	@FindBy(id="worker-payslip_method")
	public WebElement workerpayslipmethod;
	
	@FindBy(id="worker-email")
	public WebElement workeremail;
	
	
	@FindBy(id="worker-postcode")
	public WebElement workerpostcode;
	
	@FindBy(id="worker-ni_number")
	public WebElement workerninumber;
	
	@FindBy(xpath="//button[text()=\"Next\"]")
	public WebElement workernextbuttoncreate;
	
	@FindBy(id="worker-dob")
	public WebElement workerdateofborth;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h1")
	public WebElement workercreatedornot;
	
	@FindBy(xpath="//a[text()=\"Bank Details\"]")
	public WebElement workervisiblebankdetails;
	
	@FindBy(xpath="//input[@id=\"worker-ac_name\"]")
	public WebElement workerbankdetails;
	
	@FindBy(xpath="//input[@id=\"workersearch-first_name\"]")
	public WebElement workersearchfirstnamefield;
	
	@FindBy(xpath="//button[text()=\"Search\"]")
	public WebElement workersearchbutton;
	
	@FindBy(xpath="//*[@id=\"w1\"]/table/tbody/tr[1]/td[2]")
	public WebElement workersearchverifyname;
	
	@FindBy(xpath="//a[@href=\"/payrollapp/worker/update?id=1049\"]")
	public WebElement workereditbutton;
	
	@FindBy(xpath="//input[@id=\"worker-known\"]")
	public WebElement workereditknownfield;
	
	@FindBy(xpath="//button[text()=\"Next\"]")
	public WebElement workereditsavebutn;
	
	@FindBy(xpath="//input[@id=\"worker-bank_name\"]")
	public WebElement workerbankname;
	
	@FindBy(xpath="//button[text()=\"Save\"]")
    public WebElement workereditbanksavebtn;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h1")
	public WebElement workerheadingvisblebankdetails;
	
	
	@FindBy(xpath="//a[@href=\"/payrollapp/worker/delete?id=1\"]")
	public WebElement workerdeletebutn;
	
	@FindBy(xpath="//a[text()=\"Expense\"]")
	public WebElement workerexpensebtn;
	
	
	@FindBy(xpath="//h1[starts-with(text(),\"Worker Expenses:\")]")
	public WebElement workerexpensetitleverify;
	
	@FindBy(xpath="//a[text()=\"Rate\"]")
	public WebElement workerratebtn;
	
	@FindBy(xpath="//button[text()=\"Search\"]")
	public WebElement workerratesearch;
	
	@FindBy(xpath="//*[@id=\"w1-container\"]/table/tbody/tr[1]/td[2]")
	public WebElement rateverifyclient;
	
	@FindBy(xpath="//*[@id=\"select2-workerratesearch-client_id-container\"]/span")
	public WebElement rateclickclientsearch;
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	public WebElement rateclienttextfield;
	
	@FindBy(id="workersearch-first_name")
	public WebElement workersearchfirstname;
	
	@FindBy(xpath="//input[@id=\"workersearch-last_name\"]")
	public WebElement clientlastnamesearchtextfield;
	
	@FindBy(xpath="//input[@id=\"workersearch-postcode\"]")
	public WebElement clientpostcodesearchfield;
	
	@FindBy(xpath="//input[@id=\"workersearch-ni_number\"]")
	public WebElement clientninumbersearchfield;
	
	@FindBy(xpath="//button[text()=\"Search\"]")
	public WebElement clientsearchbtn;
	
	@FindBy(xpath="//button[text()=\"Reset\"]")
	public WebElement clientresetbtn;
	
	@FindBy(xpath="//*[@id=\"w1\"]/table/tbody/tr/td[2]")
	public WebElement firstnameworkerverify;
	
	
	
	public void  workersvisible() {
		PageUtility.clickOnElement(workersvisible);
	}
	
   public WebElement workerheadingvisible() {
	return workerheadingvisible;
   }
   public void createworkerclick() {
	PageUtility.clickOnElement(createworkerclick);
   }
   
   public void workergenderselectdropdwn(String Gender) {
	   PageUtility.selectDropdownbyText(workergenderselectdropdwn, Gender);
   }
   
   public void workerbranchdropdown(String branch) {
	   PageUtility.selectDropdownbyText(workerbranchdropdown, branch);
   }
   
   public void workerfirstnametextfield(String firstname) {
	   PageUtility.enterText(workerfirstnametextfield, firstname);
   }
   
   
   public void workerdivisiondrpdwn(String division) {
	   PageUtility.selectDropdownbyText(workerdivisiondrpdwn, division);
   }
   public void workerlastnametextfield(String lastname) {
	   PageUtility.enterText(workerlastnametextfield, lastname);
   }
   
   public WebElement workerdateofborth() {
	   return workerdateofborth;
   }
   
   public void workeremployementtypedrpdwn(String empltype) {
	   PageUtility.selectDropdownbyText(workeremployementtypedrpdwn, empltype);
   }
   
   public void workerAddressLinetextfield(String Address) {
	   PageUtility.enterText(workerAddressLinetextfield, Address);
   }
   
   public WebElement workerphonetextfield() {
	    return workeremployementtypedrpdwn;
   }
   
   public void workerpayslipmethod(String payslip) {
	   PageUtility.selectDropdownbyText(workerpayslipmethod, payslip);
   }
   
   public void workeremail(String email) {
	   PageUtility.enterText(workeremail, email);
   }
   
   public WebElement workerpostcode() {
	   return workerpostcode;
   }
   public WebElement workerninumber() {
	   return workerninumber;
   }
   
   public void workernextbuttoncreate() {
	   PageUtility.clickOnElement(workernextbuttoncreate);
   }
   
   public WebElement workercreatedornot() {
	   return workercreatedornot;
   }
   public void workervisiblebankdetails() {
	   PageUtility.clickOnElement(workervisiblebankdetails);
   }
   
   public void workerbankdetails() {
	   PageUtility.clickOnElement(workerbankdetails); 
   }
   
   public void workersearchfirstnamefield(String firstname) {
	   PageUtility.enterText(workersearchfirstnamefield, firstname);
   }
   
   public void workersearchbutton() {
	   PageUtility.clickOnElement(workersearchbutton);
   }
   
   public void workereditbutton() {
	   PageUtility.clickOnElement(workereditbutton);
   }
   
   public void workereditsavebutn() {
	   PageUtility.clickOnElement(workereditsavebutn);
   }
   
   public void workereditbanksavebtn() {
	   PageUtility.clickOnElement(workereditbanksavebtn);
   }
 public void workerheadingvisblebankdetails() {
	 PageUtility.isElementDisplayed(workerheadingvisblebankdetails);
 }
 
 public void workerdeletebutn() {
	 PageUtility.clickOnElement(workerdeletebutn);
 }
 
 public void workerexpensebtn() {
	 PageUtility.clickOnElement(workerexpensebtn);
 }
 public void workerratebtn() {
	 PageUtility.clickOnElement(workerratebtn);
 }
 
 public void workerratesearch() {
	 PageUtility.clickOnElement(workerratesearch);
 }
 
 public void rateclickclientsearch() {
	 PageUtility.clickOnElement(rateclickclientsearch);
 }
 
 
 public void clientlastnamesearchtextfield(String lastname) {
		PageUtility.enterText(clientlastnamesearchtextfield, lastname);
	}
	
	public void clientpostcodesearchfield(String postcode) {
		PageUtility.enterText(clientpostcodesearchfield, postcode);
	}
	public void clientsearchbtn() {
		PageUtility.clickOnElement(clientsearchbtn);
	}
	
	public void clientresetbtn() {
		PageUtility.clickOnElement(clientresetbtn);
	}
}
