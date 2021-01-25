package am.itu.qa.zalando.nonsence.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.zalando.nonsence.search.ZalandoNonSenceSearchConstants.*;

public class ZalandoNonSenceSearchResult extends ZalandoNonSenceSearchInput {

	public ZalandoNonSenceSearchResult(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = WARNING_MESSAGE_XPATH)
	WebElement warningMessage;

	public boolean isWarningMessagePresent() {
		return warningMessage.isDisplayed();
	}
}
