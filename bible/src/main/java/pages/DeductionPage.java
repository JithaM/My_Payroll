package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class DeductionPage {
	
	WebDriver driver;
	
	

	public DeductionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Deduction\"]")
	public WebElement deductionvisible;
	
	@FindBy(xpath="//a[@href=\"/payrollapp/deduction/update?id=5551\"]")
	public WebElement deductioneditworker;

	@FindBy(xpath="//a[@href=\"/payrollapp/deduction/create\"]")
	public WebElement deductionadd;
	
	@FindBy(id="select2-deduction-worker_id-container")
	public WebElement deductionworkerselect;
	
	@FindBy(id="deduction-type")
	public WebElement deductiontypeworker;
	
	@FindBy(id="deduction-amount")
	public WebElement deductionworkeramount;
	
	@FindBy(id="deduction-effective_from")
	public WebElement deductioneffectivefrom;
	
	@FindBy(xpath="//button[text()=\"Save\"]")
	public WebElement deductionsavebtn;
	
	@FindBy(xpath="//input[@class=\"select2-search__field\"]")
	public WebElement workerselectdropdown;
	
	@FindBy(xpath="//*[@id=\"w0\"]/tbody/tr[3]/td")
	public WebElement workerdeductionverify;
	
	@FindBy(xpath="//*[@id=\"w0\"]/tbody/tr[1]/td")
	public WebElement workerdedcutionname;
	
	
	public void deductionvisible() {
		PageUtility.clickOnElement(deductionvisible);
	}
	
	public void deductioneditworker() {
		PageUtility.clickOnElement(deductioneditworker);
	}
	
	public void deductionadd() {
		PageUtility.clickOnElement(deductionadd);
	}
	
	public void deductionworkerselect() {
		PageUtility.clickOnElement(deductionworkerselect);
	}
	
	public void workerselectdropdown(String worker) {
		PageUtility.enterText(workerselectdropdown, worker);
	}

	public void deductiontypeworker(String workertype) {
		PageUtility.selectDropdownbyText(deductiontypeworker, workertype);
	}
	
	public void deductionsavebtn() {
		PageUtility.clickOnElement(deductionsavebtn);
	}
	
	

}
