package am.itu.zalando.job.search.test;

import org.testng.annotations.Test;

import am.itu.qa.zalando.page.home.ZalandoKidsHomePage;
import am.itu.zalando.base.ZalandoDeBaseTest;
import am.itu.zalando.jobs.page.ZalandoJobsPage;
import am.itu.zalando.jobs.page.ZalandoSearchForJobsPage;

public class ZalandoJobSearchTest extends ZalandoDeBaseTest {

	@Test
	public void searchForZalandoJobs() throws InterruptedException {

		// 1. click on Jobs btn
		ZalandoKidsHomePage homePage = new ZalandoKidsHomePage(driver);
		ZalandoJobsPage job = homePage.clickOnJobsBtn();

		// 2. click on "Check out for Jobs" button
		Thread.sleep(3000);
		ZalandoSearchForJobsPage jobSearch = job.checkOutForJobs();

		Thread.sleep(3000);
		jobSearch.typeDesiredJob("IT");
		Thread.sleep(3000);
		jobSearch.clickOnSearchBtn();
		Thread.sleep(3000);
		jobSearch.findJobsFoundText();

	}

}
