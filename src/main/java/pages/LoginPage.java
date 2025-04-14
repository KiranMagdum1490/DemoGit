package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import base.TestBase;
import utility.Utils;

public class LoginPage extends TestBase {
	@FindBy(xpath = "div[class='login_logo']")
	private WebElement LoginLogo;
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement UsernameTextbox;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement PasswordTextbox;
	@FindBy(xpath = "//input[@data-test='login-button']")
	private WebElement LoginBtn;
	@FindBy(xpath = "div[class=\"login_credentials\"]")
	private WebElement AllUsernames;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifySwglablogin_logo() {
		Assert.assertTrue(LoginLogo.isDisplayed(), "Login logo is not displayed");
		Reporter.log("verifySwglablogin_logo", true);
		System.out.println("This is new change");
	}

	public void verifySwagLabsUsernameTextbox() {
		Assert.assertTrue(UsernameTextbox.isEnabled(), "UsernameTextbox is not Enabled");
		Assert.assertTrue(UsernameTextbox.isDisplayed(), "UsernameTextbox is not displayed");
		Reporter.log("verifySwagLabsUsernameTextbox", true);
		System.out.println("This is new change");
		System.out.println("This is new change");
	}

	public void verifySwagLabsPasswordTextbox() {
		Assert.assertTrue(PasswordTextbox.isEnabled(), "PasswordTextbox is not Enabled");
		Assert.assertTrue(PasswordTextbox.isDisplayed(), "PasswordTextbox is not displayed");
		Reporter.log("verifySwagLabsPasswordTextbox", true);
		System.out.println("This is new change");
		System.out.println("This is new change");
		System.out.println("This is new change");
		System.out.println("This is new change");
	}

	public void verifySwagLabsLoginBtn() {
		// Utils.borderbyJS(driver, LoginBtn);
		Assert.assertTrue(LoginBtn.isEnabled(), "LoginBtn is not Enabled");
		Assert.assertTrue(LoginBtn.isDisplayed(), "LoginBtn is not displayed");
		Reporter.log("verifySwagLabsLoginBtn", true);

	}

	public void verifySwaglabSetUsernamePassword(String un, String pwd) {
		UsernameTextbox.sendKeys(un);
		PasswordTextbox.sendKeys(pwd);

		LoginBtn.click();

	}
}
