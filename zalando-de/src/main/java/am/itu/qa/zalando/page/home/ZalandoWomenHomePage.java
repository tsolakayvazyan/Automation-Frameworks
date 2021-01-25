package am.itu.qa.zalando.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.zalando.page.home.ZalandoHomePageConstants.*;

import am.itu.qa.zalando.accessories.page.ZalandoWomenAccessoriesPage;
import am.itu.qa.zalando.designer.page.ZalandoDesignerPage;
import am.itu.qa.zalando.mastercard.page.ZalandoMasterCardPage;
import am.itu.qa.zalando.page.base.ZalandoBasePage;
import am.itu.qa.zalando.page.search.ZalandoSearchResultsPage;
import am.itu.qa.zalando.sizechart.page.ZalandoSizeChartPage;
import am.itu.qa.zalando.tweeter.page.ZalandoTweeterPage;
import am.itu.qa.zalando.wishlist.icon.ZalandoWishListIconPopup;
import am.itu.qa.zalandoplus.icon.ZalandoPlusPage;

public class ZalandoWomenHomePage extends ZalandoBasePage {

	public ZalandoWomenHomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = SEARCH_INPUT_XPATH)
	WebElement searchInput;

	@FindBy(xpath = ZALANDO_LOGO_XPATH)
	WebElement logo;

	@FindBy(xpath = ACCESSORIES_SUBMENU_XPATH)
	WebElement accessories;

	@FindBy(xpath = DISCOVER_NOW_XPATH)
	WebElement discoverNow;

	@FindBy(xpath = FOOTER_MAIN_PAGE_XPATH)
	WebElement footerArea;

	@FindBy(xpath = DHL_BTN_ON_MAIN_PAGE_XPATH)
	WebElement dhlBtn;

	@FindBy(xpath = DESIGNER_HEADER_SUBMENU_XPATH)
	WebElement designerSubmenu;

	@FindBy(xpath = WISH_LIST_ICON_XPATH)
	WebElement wishList;

	@FindBy(xpath = DISCOVER_ZALANDO_PLUS_ICON_XPATH)
	WebElement discoverZalandoPlus;

	@FindBy(xpath = MASTER_CARD_ICON_XPATH)
	WebElement masterCard;

	@FindBy(xpath = ZALANDO_PLUS_LOGO_XPATH)
	WebElement zalandoPlusLogo;

	@FindBy(xpath = RIGHT_SIZE_ICON_XPATH)
	WebElement rightSizeIcon;

	@FindBy(xpath = TWEETER_ICON_XPATH)
	WebElement tweeterIcon;

	public ZalandoWomenAccessoriesPage navigateToAccessories() {
		accessories.click();
		return new ZalandoWomenAccessoriesPage(driver);
	}

	public boolean isDiscoverNowElementPresent() {

		return discoverNow.isDisplayed();
	}

	public ZalandoDHLPartnerPage clickOnDHLBtn() {
		dhlBtn.click();
		return new ZalandoDHLPartnerPage(driver);
	}

	public ZalandoDesignerPage clickOnDesignerSubMenu() {
		designerSubmenu.click();
		return new ZalandoDesignerPage(driver);

	}

	public ZalandoWishListIconPopup clickOnWishListIcon() {
		wishList.click();
		return new ZalandoWishListIconPopup(driver);
	}

	public ZalandoPlusPage clickOnZalandoPlusIcon() {
		discoverZalandoPlus.click();
		return new ZalandoPlusPage(driver);

	}

	public ZalandoMasterCardPage clickOnMasterCardIcon() {
		masterCard.click();
		return new ZalandoMasterCardPage(driver);
	}

	public ZalandoPlusPage clickOnZalandoPlusLogo() {
		zalandoPlusLogo.click();
		return new ZalandoPlusPage(driver);
	}

	public ZalandoSizeChartPage clickOnRightSizeIcon() {
		rightSizeIcon.click();
		return new ZalandoSizeChartPage(driver);
	}

	public ZalandoTweeterPage clickOnTweeterIcon() {
		tweeterIcon.click();
		return new ZalandoTweeterPage(driver);
	}

	public boolean isZalandoLogoDisplayed() {
		return logo.isDisplayed();
	}

	public ZalandoSearchResultsPage searchForShoes(String textToSearch) {
		searchInput.sendKeys(textToSearch);
		searchInput.submit();
		return new ZalandoSearchResultsPage(driver);
	}
	
}
