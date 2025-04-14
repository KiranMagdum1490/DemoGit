package com.swaglabs.qa.TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.ProductPage;
import utility.Utils;

public class SwaglabLoginTest extends TestBase {
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		intializeBrowser(browser);
	}

	@Test(priority = 1)
	public void loginpgaetest() throws EncryptedDocumentException, IOException {
		LoginPage lp = new LoginPage(driver);
		// lp.verifySwglablogin_logo();
		lp.verifySwagLabsUsernameTextbox();
		lp.verifySwagLabsPasswordTextbox();
		lp.verifySwagLabsLoginBtn();
		lp.verifySwaglabSetUsernamePassword(Utils.getStringTestData(0, 0), Utils.getStringTestData(0, 1));
	}

	@Test(priority = 2)
	public void productPageTest() {
		ProductPage p = new ProductPage();
		p.verifySwagLabLogo();
		p.verifyFilterBnonProductPage();
		p.verifyAddingProductToCart();
	}

	@AfterMethod
	public void Capturess(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println(result.getStatus());
			Utils.getScreenshot(driver, result.getMethod().getMethodName());
		}
	}

	@AfterTest(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}

}
