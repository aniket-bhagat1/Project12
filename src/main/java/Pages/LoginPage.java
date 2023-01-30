package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase{

//	@FindBy(name = "username") private WebElement username;
//	@FindBy(name = "password") private WebElement password;
	@FindBy(xpath = "//input[@name='username']") private WebElement username;
	@FindBy(xpath = "//input[@name='password']") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath = "//div[@class='orangehrm-login-logo']") private WebElement orangeHRMLogo;
	@FindBy(xpath = "//div[@class='orangehrm-login-branding']") private WebElement orangeHRMBranding;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyOrangeHRMLogo() throws Exception {
		Thread.sleep(2000);
		return orangeHRMLogo.isDisplayed();
	}
	public boolean verifyOrangeHRMBranding() throws Exception {
		Thread.sleep(2000);
		return orangeHRMBranding.isDisplayed();
	}
	
	public String loginToApp() throws Exception {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
//		username.sendKeys(ReadData.readPropertyFile("username"));
//		password.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
}
