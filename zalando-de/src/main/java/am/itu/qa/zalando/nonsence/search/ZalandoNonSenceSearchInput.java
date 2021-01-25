package am.itu.qa.zalando.nonsence.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.zalando.nonsence.search.ZalandoNonSenceSearchConstants.*;

import am.itu.qa.zalando.page.base.ZalandoBasePage;

public class ZalandoNonSenceSearchInput extends ZalandoBasePage {

	public ZalandoNonSenceSearchInput(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = SEARCH_BOX_XPATH)
	WebElement searchBox;

	public ZalandoNonSenceSearchResult typeNonsence(String textToType) {
		searchBox.sendKeys(textToType);
		searchBox.submit();
		return new ZalandoNonSenceSearchResult(driver);
	}

}
