package pfpack.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pfpack.base.BaseTest;
import pfpack.pages.LaunchPage;
import pfpack.util.Constants;
import pfpack.util.ExtentManager;

public class LoginTest extends BaseTest {
	
	
	
	
	
	@Test
	public void testLogin()  {
		

		eReport = ExtentManager.getInstance();
		
		 eTest = eReport.startTest("Login Test");
		 
		eTest.log(LogStatus.INFO,"Stating Login Test");
		
		openBrowser(Constants.BROWSER_TYPE);
		
		LaunchPage launchpage = new LaunchPage(driver,eTest);
		
		PageFactory.initElements(driver, launchpage);
			
		boolean loginstatus = launchpage.goToLoginPage();
		
		if(loginstatus) {
			
		}else {
			
			reportFail("Login Test failed");
			
			
		}
		
	}
	
	@AfterMethod
	public void testClosure() {
		
		if(eReport!=null) {
			
			eReport.endTest(eTest);
			eReport.flush();// refreshing
		}
		
		if(driver!=null) {
			
			driver.quit();
			
			
		}
		
	
}
}