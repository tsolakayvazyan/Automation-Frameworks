package am.itu.zalando.sizechart.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;
import am.itu.qa.zalando.sizechart.page.ZalandoSizeChartPage;
import am.itu.zalando.base.ZalandoDeBaseTest;

public class ZalandoSizeChartPageTest extends ZalandoDeBaseTest{

	@Test
	public void navigateToSIzeChartPage() {
	ZalandoWomenHomePage homePage = new ZalandoWomenHomePage(driver);
	ZalandoSizeChartPage sizeChart = homePage.clickOnRightSizeIcon();
	Assert.assertTrue(sizeChart.isSizeChartHeaderPresent());
	}
	
}
