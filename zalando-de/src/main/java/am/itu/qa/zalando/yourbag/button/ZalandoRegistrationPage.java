package am.itu.qa.zalando.yourbag.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.login.ZalandoLoginPage;

import static am.itu.qa.zalando.yourbag.button.ZalandoYourBagPageConstants.*;

public class ZalandoRegistrationPage extends ZalandoYourBagButtonPage {

	public ZalandoRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = LOGIN_BTN_SUGGESTTION_XPATH)
	WebElement loginBtn;

	@FindBy(xpath = CONTINUE_SHOPPING_BTN_XPATH)
	WebElement contShopping;

	public boolean isLoginAreaPresent() {
		return loginBtn.isDisplayed();

	}

	public boolean isContinueShoppingBtnPresent() {
		return contShopping.isDisplayed();
	}

	public ZalandoLoginPage clickOnLoginOfBagWindow() {
		loginBtn.click();
		return new ZalandoLoginPage(driver);
	}

}
