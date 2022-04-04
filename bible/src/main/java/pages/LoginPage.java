package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@id=\"loginform-username\"]")
	public WebElement username;
	
	@FindBy(id="loginform-password")
	public WebElement password;
	
	@FindBy(name="LoginForm[rememberMe]")
	public WebElement remembermechkbox;

	@FindBy(name="login-button")
	public WebElement loginbutton;
	
	@FindBy(xpath="//p[text()=\"Incorrect username or password.\"]")
	public WebElement incorrectuserpwdmessage;
	
	@FindBy(xpath="//a[@class=\"dropdown-toggle\"]")
	public WebElement carollogoutoption;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	public WebElement logoutbutton;
	
	
	public void enterUsername(String uName) {
		PageUtility.enterText(username, uName);
	}

	public void enterPassword(String pword) {
		PageUtility.enterText(password, pword);
	}

	public  void loginbutonclick() {
		PageUtility.clickOnElement(loginbutton);
	}
	public WebElement incorrectuserpwdmessage() {
		return incorrectuserpwdmessage;
	}
	public WebElement carollogoutoption() {
		return carollogoutoption;
	}
	
	public WebElement logoutbutton() {
		return logoutbutton;
	}
	
}
