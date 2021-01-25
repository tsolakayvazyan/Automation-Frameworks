package am.itu.qa.zalando.language.selection;

import static am.itu.qa.zalando.language.selection.ZalandoLanguageSelectionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZalandoLanguagePopUpWindow extends ZalandoMainEnglishPage {

	public ZalandoLanguagePopUpWindow(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = LANGUAGE_DEUTSCH_POPUP_WINDOW_XPATH)
	WebElement popUpWindow;

	@FindBy(xpath = SELECT_DEUTSCH)
	WebElement selectDeutsch;

	@FindBy(xpath = SAVE_CHANGES)
	WebElement saveChanges;

	public boolean isPopUpWindowPresent() {
		return popUpWindow.isDisplayed();

	}

	public void chooseDeutsch() {
		selectDeutsch.click();
	}

	public ZalandoMainGermanPage saveChanges() {
		saveChanges.click();
		return new ZalandoMainGermanPage(driver);
	}

}
