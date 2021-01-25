package am.itu.qa.zalando.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.zalando.page.home.ZalandoHomePageConstants.*;
import am.itu.qa.zalando.page.base.ZalandoBasePage;
import am.itu.qa.zalando.page.search.ZalandoSearchResultsPage;
import am.itu.zalando.jobs.page.ZalandoJobsPage;

public class ZalandoKidsHomePage extends ZalandoBasePage {

	public ZalandoKidsHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = SEARCH_INPUT_XPATH)
	WebElement searchInput;

	@FindBy(xpath = DATA_PREFERENCIES_XPATH)
	WebElement dataPref;

	@FindBy(xpath = SAVE_NOW_BTN_ON_HOME_PAGE_XPATH)
	WebElement saveNow;

	@FindBy(xpath = ZALANDO_JOBS_BTN)
	WebElement jobsBtn;

	public ZalandoSearchResultsPage searchText(String textToSearch) {
		searchInput.sendKeys(textToSearch);
		searchInput.submit();

		return new ZalandoSearchResultsPage(driver);
	}

	public ZalandoDataPrefernciesPopUpPage cliclOnDataPrefBtn() {

		dataPref.click();

		return new ZalandoDataPrefernciesPopUpPage(driver);

	}

	public boolean verifySaveNowBtnIsPresent() {
		return saveNow.isDisplayed();

	}

	public ZalandoJobsPage clickOnJobsBtn() {
		jobsBtn.click();
		return new ZalandoJobsPage(driver);
	}
	
}
