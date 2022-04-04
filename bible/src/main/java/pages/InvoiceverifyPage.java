package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class InvoiceverifyPage {
	
	
	public InvoiceverifyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	

	@FindBy(xpath="//a[text()=\"Invoice\"]")
	public WebElement invoicevisible;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h1")
	public WebElement invoiceheadingverify;
	
	@FindBy(xpath="//a[@href=\"/payrollapp/invoice/generate?id=1218\"]")
	public WebElement payrollpdfbtnclick;
	
	public void invoicevisible() {
		PageUtility.clickOnElement(invoicevisible);
	}
	public void payrollpdfbtnclick() {
		PageUtility.clickOnElement(payrollpdfbtnclick);
	}
	
	
}
