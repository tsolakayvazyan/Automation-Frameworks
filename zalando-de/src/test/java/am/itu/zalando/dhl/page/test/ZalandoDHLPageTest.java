package am.itu.zalando.dhl.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.home.ZalandoDHLPartnerPage;
import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoDHLPageTest extends ZalandoDeBaseTest {

	@Test
	public void navigateToDHLPage() {
		ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
		ZalandoDHLPartnerPage dhlPage = homePage.clickOnDHLBtn();

		Assert.assertTrue(dhlPage.isLoginAreaPresent());
	}

}
