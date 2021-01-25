package am.itu.zalando.facebook.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.facebook.page.ZalandoFacebookButton;
import am.itu.qa.zalando.facebook.page.ZalandoFacebookPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoFacebookPageTest extends ZalandoDeBaseTest {

	@Test
	public void clickOnFacebookBtn() {

		// 1. Click on Facebook button
		ZalandoFacebookButton facebookBtn = new ZalandoFacebookButton(driver);
		ZalandoFacebookPage fbHomePage = facebookBtn.clickOnFBBtn();
	}

	public void verifyFBHomePage() {
		// 2. Verify that Facebook page is thrown
		ZalandoFacebookPage fbHomePage = new ZalandoFacebookPage(driver);
		Assert.assertTrue(fbHomePage.isOnFacebookPage());

	}
}
