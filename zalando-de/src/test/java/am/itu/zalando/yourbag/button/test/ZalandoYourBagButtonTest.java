package am.itu.zalando.yourbag.button.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.yourbag.button.ZalandoRegistrationPage;
import am.itu.qa.zalando.yourbag.button.ZalandoYourBagButtonPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoYourBagButtonTest extends ZalandoDeBaseTest {

	@Test
	public void clickOnYourBagButton() {
		// 1. Click on YourBag button on the main page
		ZalandoYourBagButtonPage yourBag = new ZalandoYourBagButtonPage(driver);
		ZalandoRegistrationPage reg = yourBag.pressOnYourBagBtn();
		// 2. If user is not logged in, then throws the registration page
		// 3. verify the login page
		Assert.assertTrue(reg.isLoginAreaPresent());
		Assert.assertTrue(reg.isContinueShoppingBtnPresent());

	}

}
