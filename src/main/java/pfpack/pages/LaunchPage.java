package pfpack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfpack.base.BasePage;
import pfpack.util.Constants;

public class LaunchPage extends BasePage {
	
	
	
	@FindBy(className="zh-customers")
	public WebElement customers;
	

	@FindBy(className="zh-customers")
	public WebElement support;
	
	

	@FindBy(className="zh-customers")
	public WebElement Login;
	

	@FindBy(className="zh-customers")
	public WebElement Signup;
	
	public LaunchPage(WebDriver driver,ExtentTest eTest) {
		
		this.driver = driver;
		this.eTest = eTest;
		
	}
	public boolean goToLoginPage() {
		
		driver.get(Constants.APP_URL);
		
		eTest.log(LogStatus.INFO,"Application URL"+Constants.APP_URL+"got opened");
		
		Login.click();
		eTest.log(LogStatus.INFO,"Login option got clicked");
		
		LoginPage loginPage =new LoginPage(driver,eTest);
		
		PageFactory.initElements(driver, loginPage);
		
		boolean loginstatus = loginPage.doLogin();
		
		return loginstatus;
		
	}

}
