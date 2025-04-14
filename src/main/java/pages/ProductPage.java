package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import base.TestBase;

public class ProductPage extends TestBase {

	@FindBy(xpath = "//div[text()='Swag Labs']")
	WebElement AppLogo;
	@FindBy(xpath = "//select[@data-test='product-sort-container']")
	WebElement FilterButton;
	@FindBy(xpath = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement Sauce_Labs_Backpack_AddtocrtBtn;

	@FindBy(xpath = "//button[text()='Remove']")
	WebElement Sauce_Labs_Backpack_RemoveBtn;

	@FindBy(name = "add-to-cart-sauce-labs-bike-light")
	WebElement sauce_labs_bike_lightBtn;
	@FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement sauce_labs_bolt_t_shirt;
	@FindBy(name = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement sauce_labs_fleece_jacket;
	@FindBy(name = "add-to-cart-sauce-labs-onesie")
	WebElement sauce_labs_onesie;
	@FindBy(name = "add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement t_shirt_red;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifySwagLabLogo() {
		assertTrue(AppLogo.isDisplayed(), "Swaglab Logo is not displayed");
		if (AppLogo.isDisplayed() == true) {
			System.out.println("Logged in Successfully");
		} else {
			System.out.println("Please Login before adding product the cart");
		}

		Reporter.log("verifySwagLabLogo", true);
	}

	public void verifyFilterBnonProductPage() {
		assertTrue(FilterButton.isDisplayed(), "Filter Button is not displayed");
		Select s = new Select(FilterButton);
		s.selectByVisibleText("Price (high to low)");
		Reporter.log("verifyFilterBnonProductPage", true);
	}

	public void verifyAddingProductToCart() {

		Sauce_Labs_Backpack_AddtocrtBtn.click();
		System.out.println("Product2 is:- " + Sauce_Labs_Backpack_AddtocrtBtn.getText());
		/*
		 * sauce_labs_bolt_t_shirt.click(); System.out.println("Product3 is :- " +
		 * sauce_labs_bolt_t_shirt.getText());
		 * 
		 * sauce_labs_fleece_jacket.click(); System.out.println("Product4 is :-" +
		 * sauce_labs_fleece_jacket.getText());
		 * 
		 * sauce_labs_onesie.click(); System.out.println("Product5 is :-" +
		 * sauce_labs_onesie.getText());
		 * 
		 * t_shirt_red.click(); System.out.println("Product6 is" +
		 * t_shirt_red.getText());
		 */
		Reporter.log("verifyAddingProductToCart", true);
	}

}
