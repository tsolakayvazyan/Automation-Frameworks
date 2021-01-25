package am.itu.zalando.registration.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.zalando.click.on.login.ZalandoClickOnLoginButton;
import am.itu.qa.zalando.click.on.login.ZalandoLoginPopupWindow;
import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.qa.zalando.registration.ZalandoNewUserRegistrationPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoRegistrationTest extends ZalandoDeBaseTest {

	@Test
	public void navigateToRegistrationPage() throws InterruptedException {
		// 1. click on "Login" button to open the popup window
		ZalandoClickOnLoginButton loginBtn = new ZalandoClickOnLoginButton(driver);
		ZalandoLoginPopupWindow popupWindow = loginBtn.clickOnLoginBtn();
		ZalandoNewUserRegistrationPage registration = popupWindow.pressOnRegisterHereBtn();
		registration.typeFirstName("Anna");
		registration.typeLastName("Margaryan");
		registration.typeEmail("anna.margaryan@gmail.com");
		registration.typePassword("123456");
		registration.wait();
		registration.chooseWomenFashion();
		registration.clickOnReceiveEmailsCheckbox(); 
		registration.clickOnTermsConditions(); 
		registration.clickOnRegister();
		ZalandoWomenHomePage homePage = registration.clickOnRegister();
		Assert.assertTrue(homePage.isDiscoverNowElementPresent());
		Assert.assertTrue(homePage.isZalandoLogoDisplayed());

	}

}
