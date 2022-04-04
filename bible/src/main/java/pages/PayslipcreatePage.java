package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class PayslipcreatePage {
	
	public PayslipcreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	
	
	@FindBy(xpath="//a[text()=\"Payslip\"]")
	public WebElement clickonpayslip;
	
	
	@FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h1")
	public WebElement payslipheadingverify;
	
	@FindBy(xpath="//a[@href=\"/payrollapp/payslip/pdf?id=2781\"]")
	public WebElement payslippdfclick;
	
	public void clickonpayslip() {
		PageUtility.clickOnElement(clickonpayslip);
	}
public void payslippdfclick() {
	PageUtility.clickOnElement(payslippdfclick);
}
}
