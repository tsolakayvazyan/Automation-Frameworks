package am.itu.zalando.wrong.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.login.ZalandoLoginPage;
import am.itu.qa.zalando.yourbag.button.ZalandoRegistrationPage;
import am.itu.qa.zalando.yourbag.button.ZalandoYourBagButtonPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoWrongLoginTest extends ZalandoDeBaseTest {

	@Test
	public void clickOnYourBagButton() {
		// 1. click on "Your Bag" button
		ZalandoYourBagButtonPage yourBag = new ZalandoYourBagButtonPage(driver);
		ZalandoRegistrationPage reg = yourBag.pressOnYourBagBtn();
		ZalandoLoginPage loginPage = reg.clickOnLoginOfBagWindow();
		loginPage.typeEmailAddress("gyurjyan@yahoo.com");
		loginPage.typePswd("jhgjhgjgjhgj");
		loginPage.clickOnLogin();
		Assert.assertTrue(loginPage.isWarningMessagePresent());
		// Assert.assertTrue(loginPage.isLoginAreaPresent());
	}

}