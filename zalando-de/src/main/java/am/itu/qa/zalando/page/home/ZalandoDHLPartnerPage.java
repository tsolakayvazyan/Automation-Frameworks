package am.itu.qa.zalando.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.zalando.page.home.ZalandoHomePageConstants.*;

public class ZalandoDHLPartnerPage extends ZalandoWomenHomePage {

	public ZalandoDHLPartnerPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = DHL_PAGE_ORDERS_BTN_XPATH)
	WebElement dhlOrders;

	public boolean isLoginAreaPresent() {
		return dhlOrders.isDisplayed();
	}

}
