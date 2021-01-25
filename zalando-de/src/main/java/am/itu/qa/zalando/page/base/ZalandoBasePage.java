package am.itu.qa.zalando.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ZalandoBasePage {
	
	protected WebDriver driver;
	
	public ZalandoBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}
	
}
