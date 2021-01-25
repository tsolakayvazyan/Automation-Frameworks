package am.itu.qa.zalando.wishlist.icon;

import static am.itu.qa.zalando.wishlist.icon.ZalandoWishListConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;

public class ZalandoWishListIconPopup extends ZalandoWomenHomePage {

	public ZalandoWishListIconPopup(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = TEXT_ON_POPUP_XPATH)
	WebElement textPopup;

	public boolean isRegisterHereBtnPresent() {
		return textPopup.isDisplayed();
	}

}
