package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception {
		initialization();
		login = new LoginPage();
		Thread.sleep(2000);
	}
	
	@Test (priority=2)
	public void loginToAppTest() throws Exception {
		String actRes = login.loginToApp();
		String expRes = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actRes, expRes);
		Reporter.log(actRes);
	}
	@Test (enabled=true)
	public void verifyOrangeHRMLogoTest() throws Exception {
		boolean actRes = login.verifyOrangeHRMLogo();
		Assert.assertEquals(actRes, true);
	}
	@Test (priority=1)
	public void verifyOrangeHRMBrandingTest() throws Exception {
		boolean actRes = login.verifyOrangeHRMBranding();
		Assert.assertEquals(actRes, true);
	}
	@AfterMethod (alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}
	
}
