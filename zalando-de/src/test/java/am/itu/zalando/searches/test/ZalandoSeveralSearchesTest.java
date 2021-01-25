package am.itu.zalando.searches.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.qa.zalando.page.search.ZalandoSearchResultsPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoSeveralSearchesTest extends ZalandoDeBaseTest {

	@Test
	public void ZalandoSearchForSeveralProducts() throws InterruptedException {
		// 1. Search for "shoes sneakers"
		ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
		ZalandoSearchResultsPage searchResult = homePage.searchForShoes("shoes sneakers");
		Thread.sleep(2000);
		//2. Clear the previous search input and type the new search text
		searchResult.searchForCoats("classic coats");
		Assert.assertTrue(searchResult.isSearchResultTextPresent());
	}

}
