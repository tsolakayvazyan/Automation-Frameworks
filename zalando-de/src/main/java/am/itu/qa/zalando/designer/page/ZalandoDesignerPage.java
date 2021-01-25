package am.itu.qa.zalando.designer.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import static am.itu.qa.zalando.designer.page.ZalandoDesignerPageConstants.*;

public class ZalandoDesignerPage extends ZalandoWomenHomePage {

	public ZalandoDesignerPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = DESIGNER_STYLES_TEXT_XPATH)
	WebElement wardrobe;

	public boolean isWardrobeElementPresent() {
		return wardrobe.isDisplayed();
	}
}
