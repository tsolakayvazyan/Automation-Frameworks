package am.itu.qa.zalando.tweeter.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import static am.itu.qa.zalando.tweeter.page.ZalandoTweeterPageConstants.*;

public class ZalandoTweeterPage extends ZalandoWomenHomePage {

	public ZalandoTweeterPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = ZALANDO_TWEETS_XPATH)
	WebElement tweets;

	public boolean isTweetsIconPresent() {
		return tweets.isDisplayed();
	}

}
