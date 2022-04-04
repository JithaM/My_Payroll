package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage {
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	
	
	@FindBy(xpath="//a[text()=\"Dashboard\"]")
	public WebElement dashboardvisible;
	
	@FindBy(xpath="//a[text()=\"Company\"]")
	public WebElement companyvisible;
	
	@FindBy(xpath="//a[text()=\"Clients\"]")
	public WebElement clientsvisible;
	
	@FindBy(xpath="//a[text()=\"Workers\"]")
	public WebElement workersvisible;
	
	@FindBy(xpath="//a[text()=\"Deduction\"]")
	public WebElement deductionvisible;
	
	@FindBy(xpath="//a[text()=\"TimeSheet\"]")
	public WebElement timesheetvisible;
	
	@FindBy(xpath="//a[text()=\"Payslip\"]")
	public WebElement payslipvisible;
	
	@FindBy(xpath="//a[text()=\"Invoice\"]")
	public WebElement invoicevisible;
	
	@FindBy(xpath="//a[text()=\"Report\"]")
	public WebElement reportvisible;
	
	@FindBy(xpath="//h1[text()=\"Payroll Application\"]")
	public WebElement homepagetitle;
	
	
	
	public String getLoginPageTitle() {
		return PageUtility.getPageTitle(driver);
	}
	
	public void dashboardvisible() {
		PageUtility.clickOnElement(dashboardvisible);
	}
	public Boolean verifyHomePagedashboardDisplayed() {
		return PageUtility.isElementDisplayed(dashboardvisible);
			}
	public Boolean verifyHomePagecompanyDisplayed() {
		return PageUtility.isElementDisplayed(companyvisible);
			}
	
	public Boolean verifyHomePageclientsDisplayed() {
		return PageUtility.isElementDisplayed(clientsvisible);
			}
	public Boolean verifyHomePageworkersDisplayed() {
		return PageUtility.isElementDisplayed(workersvisible);
			}
	public Boolean verifyHomePagedeductionDisplayed() {
		return PageUtility.isElementDisplayed(deductionvisible);
			}
	public Boolean verifyHomePagetimesheetDisplayed() {
		return PageUtility.isElementDisplayed(timesheetvisible);
			}
	public Boolean verifyHomePagepayslipDisplayed() {
		return PageUtility.isElementDisplayed(payslipvisible);
			}
	public Boolean verifyHomePageinvoiceDisplayed() {
		return PageUtility.isElementDisplayed(invoicevisible);
			}
	public Boolean verifyHomePageReportDisplayed() {
		return PageUtility.isElementDisplayed(reportvisible);
			}
	public WebElement homepagetitle() {
		return (homepagetitle);
	}
}
