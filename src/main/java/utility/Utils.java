package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class Utils extends TestBase {
	public static void getScreenshot(WebDriver driver, String methodName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		System.out.println(d);
		String Filename = methodName + d.toString().replace(" ", "_").replace(":", "_") + ".png";
		System.out.println(Filename);
		File f = new File("C:\\Users\\Admin\\Desktop\\SS\\" + Filename);
		System.out.println("Failed Method name is:- " + methodName);
		FileUtils.copyFile(file, f);
	}

	public static String getStringTestData(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\SS\\Data.xlsx");
		String value = WorkbookFactory.create(file).getSheet("LoginCred").getRow(row).getCell(col).getStringCellValue();
		return value;
	}

	// ===== Java Script Executor===========

	public static void borderbyJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	// capturing the title. ==> Method which accepts the parameter but will return
	// title

	public static String titlebyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String Title = js.executeScript("return document.title;").toString();
		return Title;
	}

	// click on element
	public static void clickbyJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	// generate userdefined alert.

	public static void alertbyJS(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

	// refresh the page
	public static void refreshbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	// Scrolling the page.

	public static void scrolldownbyJS(WebDriver driver, int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scroll(" + x + "," + y + ")"); // scroll down
	}

	public static void scrollupbyJS(WebDriver driver, int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scroll(" + x + "," + y + ")"); // scroll up
	}

	// scroll into view.

	public static void scrollIntoViewbyJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}
}
