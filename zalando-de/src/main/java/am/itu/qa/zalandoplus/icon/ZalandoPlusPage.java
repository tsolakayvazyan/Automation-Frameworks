package am.itu.qa.zalandoplus.icon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import static am.itu.qa.zalandoplus.icon.ZalandoPlusPageConstants.*;

public class ZalandoPlusPage extends ZalandoWomenHomePage {

	public ZalandoPlusPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = ZALANDO_PLUS_TEXT_XPATH)
	WebElement zalandoPlusText;

	public boolean isZalandoPlusTextPresent() {
		return zalandoPlusText.isDisplayed();

	}

}
