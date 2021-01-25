package am.itu.qa.zalando.page.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoKidsHomePage;

import static am.itu.qa.zalando.page.home.ZalandoHomePageConstants.SEARCH_INPUT_XPATH;
import static am.itu.qa.zalando.page.search.ZalandoSearchResultsPageConstants.*;

public class ZalandoSearchResultsPage extends ZalandoKidsHomePage {

	public ZalandoSearchResultsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ZALANDO_ALT_IMG_XPATH)
	WebElement altImg;

	@FindBy(xpath = ZALANDO_SALE_BTN_XPATH)
	WebElement saleBtn;

	@FindBy(xpath = SEARCH_RESULT_TEXT)
	WebElement searchRes;

	@FindBy(xpath = SEARCH_INPUT_XPATH)
	WebElement searchInput;

	public boolean isAltImgPresent() {
		return altImg.isDisplayed();
	}

	public boolean isSaleBtnPresent() {
		return saleBtn.isDisplayed();
	}


	public ZalandoSearchResultsPage searchForCoats(String textToType) {
		searchInput.clear();
		searchInput.sendKeys(textToType);
		searchInput.submit();
		return new ZalandoSearchResultsPage(driver);
	}

	public boolean isSearchResultTextPresent() {
		return searchRes.isDisplayed();
	}
}
