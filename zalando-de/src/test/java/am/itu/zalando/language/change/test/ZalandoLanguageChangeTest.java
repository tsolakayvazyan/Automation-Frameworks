package am.itu.zalando.language.change.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.zalando.base.ZalandoDeBaseTest;
import am.itu.qa.zalando.language.selection.ZalandoLanguagePopUpWindow;
import am.itu.qa.zalando.language.selection.ZalandoMainEnglishPage;
import am.itu.qa.zalando.language.selection.ZalandoMainGermanPage;

public class ZalandoLanguageChangeTest extends ZalandoDeBaseTest {

	@Test
	public void clickOnChangeLanguage() {

		// 1. On the main page click on "Choose Language" button
		ZalandoMainEnglishPage mainEnglishPage = new ZalandoMainEnglishPage(driver);
		ZalandoLanguagePopUpWindow popUpWindow = mainEnglishPage.clickOnChooseLanguage();
		// 2. Select Deutsch
		popUpWindow.chooseDeutsch();
		Assert.assertTrue(popUpWindow.isPopUpWindowPresent());
		popUpWindow.chooseDeutsch();
		popUpWindow.saveChanges();
	}

	public void navigateToGermanMainPage() {
		// 3. click on "Save" button
		ZalandoMainGermanPage germanPage = new ZalandoMainGermanPage(driver);
		// 4. Assert that language is changed from english to german
		Assert.assertTrue(germanPage.verifyGermanText());

	}

}
