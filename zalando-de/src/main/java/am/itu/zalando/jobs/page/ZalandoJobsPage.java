package am.itu.zalando.jobs.page;

import static am.itu.zalando.jobs.page.ZalandoJobsPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoKidsHomePage;

public class ZalandoJobsPage extends ZalandoKidsHomePage {

	public ZalandoJobsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = CHECK_OUT_JOBS_BTN_XPATH)
	WebElement checkOut;

	public ZalandoSearchForJobsPage checkOutForJobs() {
		checkOut.click();
		return new ZalandoSearchForJobsPage(driver);
	}remote

}
