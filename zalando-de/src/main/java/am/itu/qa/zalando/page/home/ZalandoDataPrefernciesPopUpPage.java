package am.itu.qa.zalando.page.home;

import static am.itu.qa.zalando.page.home.ZalandoHomePageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZalandoDataPrefernciesPopUpPage extends ZalandoKidsHomePage {

	public ZalandoDataPrefernciesPopUpPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = SAVE_SETTINGS_BTN_XPATH)
	WebElement saveSettings;

	@FindBy(xpath = DB_POPUP_WINDOW_CLOSE_BTN_XPATH)
	WebElement popUpWindow;

	public boolean isPopUpWindowPresent() {
		return popUpWindow.isDisplayed();
	}

	public ZalandoKidsHomePage clickOnSaveSettingsBtn() {
		saveSettings.click();
		return new ZalandoKidsHomePage(driver);
	}

}
