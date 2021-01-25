package am.itu.qa.zalando.click.on.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.registration.ZalandoNewUserRegistrationPage;

import static am.itu.qa.zalando.click.on.login.ZalandoLoginButtonConstants.*;

public class ZalandoLoginPopupWindow extends ZalandoClickOnLoginButton {

	public ZalandoLoginPopupWindow(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = INPUT_ON_POPUP_WINDOW_XPATH)
	WebElement PopupWindowInput;

	@FindBy(xpath = REGISTER_HERE_BTN_XPATH)
	WebElement registerHereBtn;

	public boolean isPopUpWindowPresent() {
		return PopupWindowInput.isDisplayed();
	}

	public ZalandoNewUserRegistrationPage pressOnRegisterHereBtn() {
		registerHereBtn.click();
		return new ZalandoNewUserRegistrationPage(driver);
	}

}
