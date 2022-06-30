package pfpack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import pfpack.base.BasePage;

public class HomePage extends BasePage {
	
	
	
	
	@FindBy(css="[class^='zicon-apps-chat']")
	public WebElement cliqOption;
	
	@FindBy(css="[class^='zicon-apps-crm']")
	public WebElement crmOption;
	
	@FindBy(css="[class^='zicon-apps-salesiq']")
	public WebElement salesIQOption;
	
	public HomePage(WebDriver driver,ExtentTest eTest) {
		
		this.driver = driver;
		this.eTest = eTest;
	}
	
	public boolean verifyDisplayofHomePage() {
		
	return(isElementPresent(crmOption));
	

	
	
		
		
	}
	
	
	
	//Reusable method to verify the presence of CRM option
	
	//Reusable method for navigating to CRM option
	
	//Reusable method for navigating to SalesIQ option
	
	//Reusable method for navigating to Cliq option
	
}


