package am.itu.zalando.wishlist.icon.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.qa.zalando.wishlist.icon.ZalandoWishListIconPopup;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoWishListIconTest extends ZalandoDeBaseTest{

	@Test
	public void openWishLIst() {
	ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
	ZalandoWishListIconPopup wishListPopUp = homePage.clickOnWishListIcon();
	Assert.assertTrue(wishListPopUp.isRegisterHereBtnPresent());
		
	}
	
}
