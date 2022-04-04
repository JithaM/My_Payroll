package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ReportPage {

	
	WebDriver driver;
	
	public ReportPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()=\"Report\"]")
	public WebElement reportpageclick;
	
	@FindBy(xpath="//a[text()=\"Deduction History\"]")
	public WebElement deductionhistoryreport;

	@FindBy(xpath="/html/body/header/div[3]/div/div/div[1]/h11")
	public WebElement deductionheadinvisible;
	
	
	
	
	public void reportpageclick() {
		PageUtility.clickOnElement(reportpageclick);
	}
	public void deductionhistoryreport() {
		PageUtility.clickOnElement(deductionhistoryreport);
	}
}
