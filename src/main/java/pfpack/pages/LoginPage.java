package pfpack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfpack.base.BasePage;
import pfpack.util.Constants;

public class LoginPage extends BasePage {
	
	
	
	@FindBy(id="lid")
	public WebElement emailField;
	
	@FindBy(id="pwd")
	public WebElement passwordField;
	
	@FindBy(id="signin_submit")
	public WebElement singInButton;
	
	//Reusable method for logging into the application
	public  LoginPage(WebDriver driver,ExtentTest eTest) {
		
		this.driver= driver;
		this.eTest= eTest;
		
		
	}
	
	public boolean doLogin() {
		
		emailField.sendKeys(Constants.USERNAME);
		eTest.log(LogStatus.INFO,"Username got entered into the Email address field on login page");
		passwordField.sendKeys(Constants.PASSWORD);
		eTest.log(LogStatus.INFO,"password got entered successfully");
		singInButton.click();
		eTest.log(LogStatus.INFO,"signIn button got clicked");
		
		HomePage homepage= new HomePage(driver,eTest);
		PageFactory.initElements(driver, homepage);
		
		boolean loginstatus = homepage.verifyDisplayofHomePage();
		
		return loginstatus;
		
		
		
		
	}
	
	//Other reusable methods


}
