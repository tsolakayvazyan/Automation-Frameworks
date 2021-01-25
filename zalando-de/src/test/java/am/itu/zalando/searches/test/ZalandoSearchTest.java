package am.itu.zalando.searches.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.home.ZalandoKidsHomePage;
import am.itu.qa.zalando.page.search.ZalandoSearchResultsPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoSearchTest extends ZalandoDeBaseTest {

	@Test
 	public void checkTest() {
		System.out.println("MultiBrowsers are working");
		ZalandoKidsHomePage home = new ZalandoKidsHomePage(driver);
		ZalandoSearchResultsPage  result = home.searchText("dresses");
		Assert.assertTrue(result.isAltImgPresent());
		Assert.assertTrue(result.isSaleBtnPresent());
	
}
}
