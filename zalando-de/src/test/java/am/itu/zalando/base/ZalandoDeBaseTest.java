package am.itu.zalando.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ZalandoDeBaseTest {

	public WebDriver driver;

	@Parameters({ "browser", "driverPath", "driverType" })
	@BeforeTest
	public void setBrowser(String browser, String driverPath, String driverType) {

		System.setProperty("driverPath", "driverType");
		System.out.println("Now is running  " + browser);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://en.zalando.de/women-home/");
		driver.manage().window().maximize();
	}
/*
	@AfterClass
	public void afterTest() {

		driver.quit();

	}*/

}