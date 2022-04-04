package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ClientPage {
	WebDriver driver;
	
	public ClientPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()=\"Clients\"]")
	public WebElement clientsvisible;
	
	@FindBy(id="clientsearch-client_name")
	public WebElement clientsearchtextfield;
	
	@FindBy(id="clientsearch-id")
	public WebElement clientidsearchfield;
	
	@FindBy(xpath="//button[text()=\"Search\"]")
	public WebElement clientsearchbutton;
	
	@FindBy(xpath="//a[@href=\"/payrollapp/client/update?id=1\"]")
	public WebElement clienteditbutton;
	
	@FindBy(xpath="//a[@href=\"/payrollapp/client/view?id=1\"]")
	public WebElement clientviewbutton;
	
	@FindBy(xpath="//select[@id=\"client-branch_id\"]")
	public WebElement clienteditselectbranchdropdwn;
	
	@FindBy(xpath="//select[@id=\"client-invoice_order\"]")
	public WebElement clienteditselectinvoicedropdwn;
	
	@FindBy(xpath="//select[@id=\"client-division_id\"]")
	public WebElement clienteditselectdivisiondropdwn;
	
	@FindBy(xpath="//a[text()=\"Create Client\"]")
	public WebElement clientcreatebutton;
	
	@FindBy(xpath="//input[@id=\"client-invoice_contact\"]")
	public WebElement clientinvoicecontacttextfield;
	
	@FindBy(xpath="//select[@id=\"client-invoice_delivery_method\"]")
	public WebElement clientinvoicedeliverymethdropdwn;
	
	@FindBy(xpath="//input[@id=\"client-client_name\"]")
	public WebElement clientnametextfield;
	
	@FindBy(id="client-phone")
	public WebElement clientphonenumberfield;
	
	@FindBy(xpath="//select[@id=\"client-master_document\"]")
	public WebElement clientmasterdocument;
	
	@FindBy(xpath="//textarea[@id=\"client-client_address\"]")
	public WebElement clientaddressfield;
	
	@FindBy(xpath="//input[@id=\"client-settilement_days\"]")
	public WebElement clientsettlementdays;
	
	@FindBy(id="client-email")
	public WebElement clientemailfield;
	
	@FindBy(xpath="//select[@id=\"client-vat_rate\"]")
	public WebElement clientvatratedrpdwn;
	
	@FindBy(id="client-postcode")
	public WebElement clientpostcodetextfield;
	
	@FindBy(xpath="//input[@id=\"client-company_reg\"]")
	public WebElement clientcompanyregfield;
	
	@FindBy(xpath="//button[text()=\"Save\"]")
	public WebElement clientsavebutton;
	
	@FindBy(xpath="//div[@class=\"row\"]//div//h1")
	public WebElement clientaddedheading;
	
	@FindBy(xpath="//div[@id=\"w1\"]/table/tbody/tr/td[2]")
	public WebElement clientnamesearchfield;
	
	@FindBy(xpath="//*[@id=\"w1\"]/table/tbody/tr[1]/td[1]")
	public WebElement clientidfoundsearchfield;
	
	
	@FindBy(xpath="//*[@id=\"w1\"]/table/tbody/tr[1]/td[6]/a[1]")
	public WebElement clientsearchviewbutton;
	
	@FindBy(xpath="//*[@id=\"w1\"]/table/tbody/tr/td[1]")
	public WebElement clientseachelementfound;
	
	@FindBy(xpath="//div[text()=\"No results found.\"]")
	public WebElement clientsearchnotfound;
	
	@FindBy(xpath="//*[@id=\"w1\"]/table/tbody/tr[1]/td[2]")
	public WebElement clientnameviewverify;
	
		
	@FindBy(xpath="//a[@href=\"/payrollapp/client/update?id=685\"]")
	public WebElement clientnameeditbutton;
	
	@FindBy(xpath="//h1[starts-with(text(),\"Update Client:\")]")
	public WebElement clienteditnameverify;
	
	@FindBy(xpath="//button[text()=\"Reset\"]")
	public WebElement clientresetbutton;
	
	@FindBy(xpath="//button[text()=\"Save\"]")
	public WebElement clientsavebtn;

	@FindBy(xpath="//*[@id=\"w0\"]/tbody/tr[15]/td")
	public WebElement invoicecontactedited;
	
	
	
	public void clientcreateoption() {
		PageUtility.clickOnElement(clientcreatebutton);
	}

	public void homepagetitle() {
		PageUtility.clickOnElement(clientsvisible);
	}
	
	public void  clienteditbranchdropdown(String text) {
		PageUtility.selectDropdownbyText(clienteditselectbranchdropdwn, text);
	}
	
	public void clienteditinvoiceorderdropdown(String text) {
		PageUtility.selectDropdownbyText(clienteditselectinvoicedropdwn, text);
	}

	public void clienteditselectdivisiondropdwn(String text) {
		PageUtility.selectDropdownbyText(clienteditselectdivisiondropdwn, text); 
	}
	public void clientinvoicecontacttextfield(String invoicecontact) {
		PageUtility.enterText(clientinvoicecontacttextfield, invoicecontact);
	}
	public void clientinvoicedeliverymethdropdwn(String text) {
		PageUtility.selectDropdownbyText(clientinvoicedeliverymethdropdwn, text); ;
	}
	
	public void clientnametextfield(String name) {
		PageUtility.enterText(clientnametextfield, name);
	}
	public WebElement clientphonenumberfield() {
		return clientphonenumberfield;
	}
	
	public void clientmasterdocument(String text) {
		PageUtility.selectDropdownbyText(clientmasterdocument, text);;
	}
	
	public void clientaddressfield(String ClientAddress) {
		PageUtility.enterText(clientaddressfield, ClientAddress);
		
	}
	
	public WebElement clientsettlementdays() {
		return clientsettlementdays;
	}
	public void clientemailfield(String Email) {
		PageUtility.enterText(clientemailfield, Email);
	}
	
	public void clientvatratedrpdwn(String text) {
		PageUtility.selectDropdownbyText(clientvatratedrpdwn, text);;
	}
	public WebElement clientpostcodetextfield() {
		return clientpostcodetextfield;
	}
	
	public void clientcompanyregfield(String CompanyReg) {
		PageUtility.enterText(clientcompanyregfield, CompanyReg);
	}
	public void clientsavebutton() {
		PageUtility.clickOnElement(clientsavebutton);
	}
	public WebElement clientaddedheading() {
		return clientaddedheading;
	}
	public WebElement clientnamesearchfield() {
		return clientnamesearchfield;
	}
	
	public void clientsvisible() {
		PageUtility.clickOnElement(clientsvisible);
	}
	public WebElement clientsearchtextfield() {
		return clientsearchtextfield;
		
	}
	
	public void clientsearchbutton() {
		PageUtility.clickOnElement(clientsearchbutton);
	}
	
	public WebElement clientidsearchfield() {
		return clientidsearchfield;
	}
	
	public WebElement clientidfoundsearchfield() {
		return clientidfoundsearchfield;
	}
	
	public void clientsearchviewbutton() {
		PageUtility.clickOnElement(clientsearchviewbutton);
	}
	
	public void clientseachelementfound() {
		PageUtility.isElementDisplayed(clientseachelementfound);
	}
	
	public void clientsearchnotfound() {
		PageUtility.isElementDisplayed(clientsearchnotfound);
	}
	
	public void clientnameeditbutton() {
		PageUtility.clickOnElement(clientnameeditbutton);
	}
	public void clientnameeditviewverify() {
		PageUtility.clickOnElement(clienteditbutton);
	}
	public void clientresetbutton() {
		PageUtility.clickOnElement(clientresetbutton);
	}
	
	public void clientsavebtn() {
		PageUtility.clickOnElement(clientsavebtn);
	}
	
	public WebElement invoicecontactedited() {
		return invoicecontactedited;
	}
	
}
