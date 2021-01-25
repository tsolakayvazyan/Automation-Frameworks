package am.itu.zalando.jobs.page;

import static am.itu.zalando.jobs.page.ZalandoJobsPageConstants.JOBS_FOUND_TEXT_XPATH;
import static am.itu.zalando.jobs.page.ZalandoJobsPageConstants.JOB_SEARCH_BTN_XPATH;
import static am.itu.zalando.jobs.page.ZalandoJobsPageConstants.JOB_SEARCH_INPUT_BOX_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZalandoSearchForJobsPage extends ZalandoJobsPage {

	public ZalandoSearchForJobsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = JOB_SEARCH_INPUT_BOX_XPATH)
	WebElement jobSearch;

	@FindBy(xpath = JOB_SEARCH_BTN_XPATH)
	WebElement searchBtn;

	@FindBy(xpath = JOBS_FOUND_TEXT_XPATH)
	WebElement foundBtn;

	public void typeDesiredJob(String jobType) {
		jobSearch.sendKeys(jobType);
	}

	public void clickOnSearchBtn() {
		searchBtn.click();
	}

	public boolean findJobsFoundText() {
		return foundBtn.isDisplayed();
	}
}
