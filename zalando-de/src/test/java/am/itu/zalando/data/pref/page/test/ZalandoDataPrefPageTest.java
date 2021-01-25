package am.itu.zalando.data.pref.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.zalando.page.home.ZalandoDataPrefernciesPopUpPage;
import am.itu.qa.zalando.page.home.ZalandoKidsHomePage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoDataPrefPageTest extends ZalandoDeBaseTest {

	@Test
	public void clickOnDataPrefBtn() {

		ZalandoKidsHomePage kidsHomePage = new ZalandoKidsHomePage(driver);
		ZalandoDataPrefernciesPopUpPage popUpPage = kidsHomePage.cliclOnDataPrefBtn();
		Assert.assertTrue(popUpPage.isPopUpWindowPresent());

	}

	public void clickOnSaveBtn() {
		ZalandoDataPrefernciesPopUpPage popUpPage = new ZalandoDataPrefernciesPopUpPage(driver);
		ZalandoKidsHomePage kidsHomePage = popUpPage.clickOnSaveSettingsBtn();
		Assert.assertTrue(kidsHomePage.verifySaveNowBtnIsPresent());

	}

}
