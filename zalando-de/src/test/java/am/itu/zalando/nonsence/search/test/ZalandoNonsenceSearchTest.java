package am.itu.zalando.nonsence.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.nonsence.search.ZalandoNonSenceSearchInput;
import am.itu.qa.zalando.nonsence.search.ZalandoNonSenceSearchResult;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoNonsenceSearchTest extends ZalandoDeBaseTest {

	@Test
	public void searchNonsenceInput() {
		// 1. Search nonsence string in search input of zalando main page
		ZalandoNonSenceSearchInput nonsenceInput = new ZalandoNonSenceSearchInput(driver);
		ZalandoNonSenceSearchResult searchResult = nonsenceInput.typeNonsence("jhkjhkjhkhkh");
		// 2. verify the appropriate warning message about the search
		Assert.assertTrue(searchResult.isWarningMessagePresent());
	}

}
