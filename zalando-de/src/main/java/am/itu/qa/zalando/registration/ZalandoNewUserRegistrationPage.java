package am.itu.qa.zalando.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.zalando.registration.ZalandoRegistrationPageConstants.*;
import am.itu.qa.zalando.click.on.login.ZalandoClickOnLoginButton;
import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;

public class ZalandoNewUserRegistrationPage extends ZalandoClickOnLoginButton {

	public ZalandoNewUserRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = FIRST_NAME_INPUT_XPATH)
	WebElement firstName;

	@FindBy(xpath = LAST_NAME_INPUT_XPATH)
	WebElement lastName;

	@FindBy(xpath = EMAIL_INPUT_XPATH)
	WebElement email;

	@FindBy(xpath = PSWD_INPUT_XPATH)
	WebElement pswd;

	@FindBy(xpath = WOMEN_FASHION_SELECTION_XPATH)
	WebElement wFashion;

	@FindBy(xpath = CHECKBOX_TO_RECEIVE_EMAILS_XPATH)
	WebElement recEmails;

	@FindBy(xpath = TERMS_AND_CONDITIONS_CHECKBOX_XPATH)
	WebElement termsConditions;

	@FindBy(xpath = REGISTER_XPATH)
	WebElement register;

	public void typeFirstName(String firstNames) {
		firstName.sendKeys(firstNames);
	}

	public void typeLastName(String lastNames) {
		lastName.sendKeys(lastNames);
	}

	public void typeEmail(String emailAddress) {
		email.sendKeys(emailAddress);
	}

	public void typePassword(String password) {
		pswd.sendKeys(password);
	}

	public void chooseWomenFashion() {
		wFashion.click();
	}

	public void clickOnReceiveEmailsCheckbox() {
		recEmails.click();
	}

	public void clickOnTermsConditions() {
		termsConditions.click();
	}

	public ZalandoWomenHomePage clickOnRegister() {
		register.click();
		return new ZalandoWomenHomePage(driver);
	}

}
