package am.itu.qa.zalando.facebook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.zalando.facebook.page.ZalandoFacebookPageConstants.*;
import am.itu.qa.zalando.page.base.ZalandoBasePage;

public class ZalandoFacebookButton extends ZalandoBasePage {

	public ZalandoFacebookButton(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = FACEBOOK_BTN_XPATH)
	WebElement facebookBTN;

	public ZalandoFacebookPage clickOnFBBtn() {
		facebookBTN.click();
		return new ZalandoFacebookPage(driver);
	}

}
