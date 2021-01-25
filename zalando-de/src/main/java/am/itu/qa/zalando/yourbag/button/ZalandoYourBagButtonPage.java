package am.itu.qa.zalando.yourbag.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.base.ZalandoBasePage;
import static am.itu.qa.zalando.yourbag.button.ZalandoYourBagPageConstants.*;

public class ZalandoYourBagButtonPage extends ZalandoBasePage {

	public ZalandoYourBagButtonPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = YOUR_BAG_BUTTON_XPATH)
	WebElement yourBagBtn;

	public ZalandoRegistrationPage pressOnYourBagBtn() {
		yourBagBtn.click();
		return new ZalandoRegistrationPage(driver);

	}

}
