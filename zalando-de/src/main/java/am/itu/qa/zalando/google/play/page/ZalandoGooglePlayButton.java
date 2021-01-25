package am.itu.qa.zalando.google.play.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.zalando.google.play.page.ZalandoGooglePlayConstants.*;
import am.itu.qa.zalando.page.base.ZalandoBasePage;

public class ZalandoGooglePlayButton extends ZalandoBasePage {

	public ZalandoGooglePlayButton(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = GOOGLE_PLAY_BTN_XPATH)
	WebElement googlePlayBtn;

	public ZalandoGooglePlayPage clickOnGooglePlayBtn() {
		googlePlayBtn.click();
		return new ZalandoGooglePlayPage(driver);
	}
}
