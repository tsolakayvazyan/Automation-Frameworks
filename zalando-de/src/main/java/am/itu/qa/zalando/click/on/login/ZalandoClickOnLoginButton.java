package am.itu.qa.zalando.click.on.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.zalando.click.on.login.ZalandoLoginButtonConstants.*;

import am.itu.qa.zalando.page.base.ZalandoBasePage;

public class ZalandoClickOnLoginButton extends ZalandoBasePage {

	public ZalandoClickOnLoginButton(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = LOGIN_BTN_XPATH)
	WebElement loginBtn;

	public ZalandoLoginPopupWindow clickOnLoginBtn() {
		loginBtn.click();

		return new ZalandoLoginPopupWindow(driver);
	}

}
