package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class TimesheetPage {
	
	public TimesheetPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	
	@FindBy(xpath="//a[text()=\"TimeSheet\"]")
	public WebElement timesheetvisible;
	
	@FindBy(xpath="//button[text()=\"Generate Playslip\"]")
	public WebElement generatepayslipoption;
	
	@FindBy(xpath="//button[text()=\"Generate Invoice\"]")
	public WebElement generateinvoicebutton;
	
	@FindBy(xpath="//a[text()=\"Approved Timesheets\"]")
	public WebElement approvedtimesheet;
	
	@FindBy(xpath="//a[@href=\"/payrollapp/timesheet/view?id=5\"]")
	public WebElement approvedtimesheetview;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h1")
	public WebElement timesheetheadingvisible;
	
	@FindBy(xpath="//a[text()=\"Create Timesheet\"]")
	public WebElement createtimesheetbtn;
	
	@FindBy(xpath="//button[text()=\"Skip\"]")
	public WebElement createtimesheetskip;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h1")
	public WebElement createtimesheetheading;
	
	
	
	
	public void timesheetvisible() {
		PageUtility.clickOnElement(timesheetvisible);
	}
	
	public void generatepayslipoption() {
		
		PageUtility.clickOnElement(generatepayslipoption);
		
	}
	
public void generatepayslipoption1() {
		
		PageUtility.isElementDisplayed(generatepayslipoption);
		
	}

public void generateinvoicebutton() {
	PageUtility.clickOnElement(generateinvoicebutton);
}
public void approvedtimesheet() {
	PageUtility.clickOnElement(approvedtimesheet);
}
public void approvedtimesheetview() {
	PageUtility.clickOnElement(approvedtimesheetview);
}
public void createtimesheetbtn() {
	PageUtility.clickOnElement(createtimesheetbtn);
}
public void createtimesheetskip() {
	PageUtility.clickOnElement(createtimesheetskip);
}




}
