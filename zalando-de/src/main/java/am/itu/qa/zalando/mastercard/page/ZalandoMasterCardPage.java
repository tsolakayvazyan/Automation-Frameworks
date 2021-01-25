package am.itu.qa.zalando.mastercard.page;

import static am.itu.qa.zalando.mastercard.page.ZalandoMasterCardPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;

public class ZalandoMasterCardPage extends ZalandoWomenHomePage {

	public ZalandoMasterCardPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = TEXT_ON_MASTERCARD_PAGE_XPATH)
	WebElement textOnMasterCardPage;

	public boolean isTextOnMasterCardPagePresent() {
		return textOnMasterCardPage.isDisplayed();
	}
}
