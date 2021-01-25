package am.itu.qa.zalando.language.selection;

import static am.itu.qa.zalando.language.selection.ZalandoLanguageSelectionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.base.ZalandoBasePage;

public class ZalandoMainGermanPage extends ZalandoBasePage {

	public ZalandoMainGermanPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = KINDER_SUBMENU)
	WebElement kinderSubMenu;

	public boolean verifyGermanText() {
		return kinderSubMenu.isDisplayed();

	}
}
