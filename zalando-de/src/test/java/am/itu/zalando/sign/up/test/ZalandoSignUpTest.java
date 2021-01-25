package am.itu.zalando.sign.up.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.sign.up.page.ZalandoSignUpPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoSignUpTest extends ZalandoDeBaseTest {

	@Test
	public void typeEmailForZalandoNewsLetters() {
		// 1. type email address in email address box to receive newsletters from
		// Zalando
		ZalandoSignUpPage signUpPage = new ZalandoSignUpPage(driver);
		signUpPage.typeEmailAddress("tgyurjyan@yahoo.com");
		// 2. Select preferences "Womes's fashion"
		signUpPage.choosePrefernces();
		// 3. click on "Sign me up"
		signUpPage.clickOnSignUpBtn();
		// 4. verify the message "Confirm your sign up" is thrown
		Assert.assertTrue(signUpPage.IsConfirmationMessagePresent());

	}

}
