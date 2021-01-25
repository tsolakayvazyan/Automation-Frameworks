package am.itu.qa.zalando.language.selection;

import static am.itu.qa.zalando.language.selection.ZalandoLanguageSelectionConstants.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.base.ZalandoBasePage;

public class ZalandoMainEnglishPage extends ZalandoBasePage {

	public ZalandoMainEnglishPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = CHOOSE_LANGUAGE)
	WebElement chooseLanguage;

	public ZalandoLanguagePopUpWindow clickOnChooseLanguage() {
		chooseLanguage.click();
		return new ZalandoLanguagePopUpWindow(driver);

	}

}
