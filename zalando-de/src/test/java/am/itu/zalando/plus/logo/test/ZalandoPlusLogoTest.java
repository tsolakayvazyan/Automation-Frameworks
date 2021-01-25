package am.itu.zalando.plus.logo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.qa.zalandoplus.icon.ZalandoPlusPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoPlusLogoTest extends ZalandoDeBaseTest {

	@Test
	public void clickOnZalandoPlusLogo() {
		ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
		ZalandoPlusPage zalandoPlus = homePage.clickOnZalandoPlusLogo();
		Assert.assertTrue(zalandoPlus.isZalandoPlusTextPresent());

	}

}
