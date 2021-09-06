package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import page.MonthDropdownPage;
import util.BrowserFactory;

public class MonthDropdownTest {
WebDriver driver;
	
	@Test
	public void validUserDueDateDropdownHaveAllMonths() {
		
		driver = BrowserFactory.init();
		
		MonthDropdownPage monthDropdownPage = PageFactory.initElements(driver, MonthDropdownPage.class);
		
		monthDropdownPage.validateTheMonthDropdownHasAllTheMonths();
		
		
		BrowserFactory.tearDown();
	
	}
	
}
