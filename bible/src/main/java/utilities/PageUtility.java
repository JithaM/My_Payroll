package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	
	public static void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static Boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	public static void ScrollBy(WebDriver driver) {
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,1000)"); 
	}
	
	public static void selectDropdownbyText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void selectDropdownbyInt(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);
	}
	public static void handleAlert(WebDriver driver) {
		driver.switchTo().alert();
	}

	public static void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public static void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public static void enterTextAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static String getAlertText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

}
