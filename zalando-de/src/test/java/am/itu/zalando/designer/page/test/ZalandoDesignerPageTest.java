package am.itu.zalando.designer.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.designer.page.ZalandoDesignerPage;
import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoDesignerPageTest extends ZalandoDeBaseTest {

	@Test
	public void navigateToDesignerPage() {

		// click on Designer button
		ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
		ZalandoDesignerPage designerPage = homePage.clickOnDesignerSubMenu();

		Assert.assertTrue(designerPage.isWardrobeElementPresent());
	}

}
