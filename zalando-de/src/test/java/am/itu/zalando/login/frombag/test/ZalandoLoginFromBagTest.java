package am.itu.zalando.login.frombag.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.login.ZalandoLoginPage;
import am.itu.qa.zalando.yourbag.button.ZalandoRegistrationPage;
import am.itu.qa.zalando.yourbag.button.ZalandoYourBagButtonPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoLoginFromBagTest extends ZalandoDeBaseTest{

	@Test
	public void clickOnYourBagBtn() {
		//1. click on Your bag button
		ZalandoYourBagButtonPage yourBag = new ZalandoYourBagButtonPage(driver);
		ZalandoRegistrationPage reg = yourBag.pressOnYourBagBtn();
	}
		
	//2. click on login button from cart window
	    public void clickOnLoginBtn() {
		ZalandoRegistrationPage loginBtn = new ZalandoRegistrationPage(driver);
		ZalandoLoginPage loginPage = loginBtn.clickOnLoginOfBagWindow();
		Assert.assertTrue(loginPage.isRegisterBtnPresent());
		
	}
	
	
}
