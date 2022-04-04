package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import constants.Constants;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.WaitUtility;

public class Base {

	
	public WebDriver driver;
	public static Properties prop,prop1;
	FileInputStream fs;
	LoginPage loginpageobj;
	@BeforeMethod
	public WebDriver browserinitialization() throws IOException {
		
		prop = new Properties();		
		try {
			fs = new FileInputStream(System.getProperty("user.dir") + Constants.CONFIGfILE);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			prop.load(fs);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		prop1 = new Properties();		
		try {
			fs = new FileInputStream(System.getProperty("user.dir") + Constants.TESTDATAFILE);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			prop1.load(fs);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(WaitUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		loginpageobj=new LoginPage(driver);
		loginpageobj.enterUsername(ExcelUtility.getString(1, 0, Constants.EXCELFILE,"Login")); 
		loginpageobj.enterPassword(ExcelUtility.getString(1, 1, Constants.EXCELFILE, "Login"));
		 
		loginpageobj.loginbutonclick();
		driver.manage().window().maximize();
		return driver;
						
	}
	
	
	public String getScreenShotpath(String testCaseName,WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
        File Source=ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
        FileUtils.copyFile(Source, new File(destinationFile));
        return destinationFile;

		
	}
	
	  @AfterMethod 
	  public void teardown() {
		  driver.close(); 
		  }
	 
	
	}
