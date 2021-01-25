package am.itu.qa.zalando.accessories.page;

import static am.itu.qa.zalando.accessories.page.ZalandoWomenAccessoriesConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;

public class ZalandoWomenAccessoriesPage extends ZalandoWomenHomePage {

	public ZalandoWomenAccessoriesPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = ACCESSORIES_SORT_LABEL_XPATH)
	WebElement accessoriesSort;

	@FindBy(xpath = LOGO_IMG_XPATH)
	WebElement zalandoLogo;

	public boolean isSortElementPresent() {
		return accessoriesSort.isDisplayed();
	}

	public ZalandoWomenHomePage clickOnZalandoLogo() {
		zalandoLogo.click();
		return new ZalandoWomenHomePage(driver);
	}

}
