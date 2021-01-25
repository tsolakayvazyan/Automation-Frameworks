package am.itu.zalando.mastercard.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.mastercard.page.ZalandoMasterCardPage;
import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoMasterCardIconTest extends ZalandoDeBaseTest {

	@Test
	public void navigateToMasterCardPage() {
		ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
		ZalandoMasterCardPage masterCardPage = homePage.clickOnMasterCardIcon();
		Assert.assertTrue(masterCardPage.isTextOnMasterCardPagePresent());

	}
}
