package am.itu.zalando.login.button.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.click.on.login.ZalandoClickOnLoginButton;
import am.itu.qa.zalando.click.on.login.ZalandoLoginPopupWindow;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoLoginButtonClickTest extends ZalandoDeBaseTest {

	@Test
	public void clickOnLoginBtn() {
		// 1. click on login button
		ZalandoClickOnLoginButton loginBtn = new ZalandoClickOnLoginButton(driver);
		ZalandoLoginPopupWindow popupWindow = loginBtn.clickOnLoginBtn();
		// 2.verify the popup window is thrown
		Assert.assertTrue(popupWindow.isPopUpWindowPresent());

	}

}
