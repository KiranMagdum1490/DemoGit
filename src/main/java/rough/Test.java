package rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws IOException {
		/*
		 * FileInputStream file = new
		 * FileInputStream("C:\\Users\\Admin\\Desktop\\Data.xlsx"); String value =
		 * WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).
		 * getStringCellValue(); System.out.println(value); String value1 =
		 * WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).
		 * getStringCellValue(); System.out.println(value1);
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		File srcf = UserName.getScreenshotAs(OutputType.FILE);
		File destF = new File("C:\\Users\\Admin\\Desktop\\SS\\screenshot4.png");
		FileUtils.copyFile(srcf, destF);
	}
}
