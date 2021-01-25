package am.itu.qa.zalando.sizechart.page;

import static am.itu.qa.zalando.sizechart.page.ZalandoSizeChartPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.zalando.page.home.ZalandoWomenHomePage;

public class ZalandoSizeChartPage extends ZalandoWomenHomePage {

	public ZalandoSizeChartPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = TEXT_ON_SIZE_CHART_PAGE_XPATH)
	WebElement sizeChartHeader;

	public boolean isSizeChartHeaderPresent() {
		return sizeChartHeader.isDisplayed();
	}

}
