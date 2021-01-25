package am.itu.zalando.plus.icon.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.qa.zalandoplus.icon.ZalandoPlusPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoPlusIconTest extends ZalandoDeBaseTest {

	@Test
	public void navigateToZalandoPlusPage() {
		// 1. click on Discover Zalando Plus icon
		ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
		ZalandoPlusPage zalandoPlus = homePage.clickOnZalandoPlusIcon();
		// 2. Verify Zalando Plus text is displayed
		Assert.assertTrue(zalandoPlus.isZalandoPlusTextPresent());
	}

}
