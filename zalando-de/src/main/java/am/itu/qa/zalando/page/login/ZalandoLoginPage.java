package am.itu.qa.zalando.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.yourbag.button.ZalandoRegistrationPage;

import static am.itu.qa.zalando.page.login.ZalandoLoginPageConstants.*;

public class ZalandoLoginPage extends ZalandoRegistrationPage {

	public ZalandoLoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = REGISTER_BTN_XPATH)
	WebElement registerBtn;

	@FindBy(xpath = EMAIL_AREA_XPATH)
	WebElement email;

	@FindBy(xpath = PSWD_AREA_XPATH)
	WebElement pswd;

	@FindBy(xpath = LOGIN_AFTER_INITIALIZING_XPATH)
	WebElement loginBtn;

	@FindBy(xpath = WARNING_MESSAGE_XPATH)
	WebElement warning;

	public boolean isRegisterBtnPresent() {
		return registerBtn.isDisplayed();
	}

	public void typeEmailAddress(String emailAddress) {
		email.sendKeys(emailAddress);
		email.submit();
	}

	public void typePswd(String password) {
		pswd.sendKeys(password);
		pswd.submit();
	}

	public void clickOnLogin() {
		loginBtn.click();
	}

	public boolean isWarningMessagePresent() {
		return warning.isDisplayed();
	}
}
