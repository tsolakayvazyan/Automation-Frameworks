package am.itu.qa.zalando.sign.up.page;

import static am.itu.qa.zalando.sign.up.page.ZalandoSignUpPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.base.ZalandoBasePage;

public class ZalandoSignUpPage extends ZalandoBasePage {

	public ZalandoSignUpPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = EMAIL_INPUT_XPATH)
	WebElement emailInput;

	@FindBy(xpath = WOMEN_FASHION_PREFERENCES_BTN_XPATH)
	WebElement fashionPrefernces;

	@FindBy(xpath = SIGN_ME_UP_BTN_XPATH)
	WebElement signUpBtn;

	@FindBy(xpath = CONFIRM_YOUR_SIGN_UP_MESSAGE_XPATH)
	WebElement confirmMessage;

	public void typeEmailAddress(String textToType) {
		emailInput.sendKeys(textToType);
		emailInput.submit();
	}

	public void choosePrefernces() {
		fashionPrefernces.click();
	}

	public void clickOnSignUpBtn() {
		signUpBtn.click();
	}

	public boolean IsConfirmationMessagePresent() {
		return confirmMessage.isDisplayed();
	}

}
