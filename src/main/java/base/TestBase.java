package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;

public class TestBase {
	public static WebDriver driver;

	public void intializeBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\com.swaglabs.qa\\src\\main\\java\\resources\\chromedriver.exe");
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.setProperty("edgedriver.edge.driver", "");
		} else {
			System.out.println("Provide valid broowser Name");
		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
}
