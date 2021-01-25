package am.itu.zalando.logo.displays.main.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.accessories.page.ZalandoWomenAccessoriesPage;
import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoLogoDisplaysMainPage extends ZalandoDeBaseTest {

	@Test
	public void navigateToAccessories() {
		// 1. Goes from main page to "Accessories" (click on the button "Accessories")
		// and asserts that it is the required page
		ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
		ZalandoWomenAccessoriesPage accessoriesPage = homePage.navigateToAccessories();
		Assert.assertTrue(accessoriesPage.isSortElementPresent());

	}

	public void navigateToMainPage() {
		// 2. Clicks on Zalando Logo
		// 3. Goes back to main page
		// 4. Asserts that is on main page
		ZalandoWomenAccessoriesPage accessoriesPage = new ZalandoWomenAccessoriesPage(driver);
		ZalandoWomenHomePage homePage = accessoriesPage.clickOnZalandoLogo();
		Assert.assertTrue(homePage.isDiscoverNowElementPresent());

	}

}
