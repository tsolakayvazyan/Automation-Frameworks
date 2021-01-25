package am.itu.qa.zalando.facebook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.zalando.facebook.page.ZalandoFacebookPageConstants.*;

public class ZalandoFacebookPage extends ZalandoFacebookButton {

	public ZalandoFacebookPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = FACEBOOK_HOME_PAGE_XPATH)
	WebElement facebookHomePage;

	public boolean isOnFacebookPage() {
		return facebookHomePage.isDisplayed();
	}
}
