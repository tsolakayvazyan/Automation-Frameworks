package am.itu.zalando.tweeter.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.qa.zalando.tweeter.page.ZalandoTweeterPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoTweeterPageTest extends ZalandoDeBaseTest {

	@Test
	public void navigateToTweeterPage() {
		ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
		ZalandoTweeterPage tweeterPage = homePage.clickOnTweeterIcon();
		Assert.assertTrue(tweeterPage.isTweetsIconPresent());

	}
}
