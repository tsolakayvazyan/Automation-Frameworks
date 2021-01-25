package am.itu.zalando.google.play.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.zalando.google.play.page.ZalandoGooglePlayButton;
import am.itu.qa.zalando.google.play.page.ZalandoGooglePlayPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoGooglePlayPageTest extends ZalandoDeBaseTest {

	@Test
	public void clickOnGooglePlayBtn() {
		// 1. Click on the google play button on Zalando home page

		ZalandoGooglePlayButton googlePlayBtn = new ZalandoGooglePlayButton(driver);
		ZalandoGooglePlayPage googlePlayHP = googlePlayBtn.clickOnGooglePlayBtn();
		Assert.assertTrue(googlePlayHP.isGooglePlayLogoPresent());
	}
}
