package am.itu.qa.zalando.google.play.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.zalando.google.play.page.ZalandoGooglePlayConstants.*;

public class ZalandoGooglePlayPage extends ZalandoGooglePlayButton {

	public ZalandoGooglePlayPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = GOOGLE_PLAY_HOME_PAGE_XPATH)
	WebElement googlePlayHP;

	public boolean isGooglePlayLogoPresent() {
		return googlePlayHP.isDisplayed();

	}
}
