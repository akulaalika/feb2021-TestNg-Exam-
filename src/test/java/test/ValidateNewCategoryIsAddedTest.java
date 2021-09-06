package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ValidateAddedcategory;
import util.BrowserFactory;

public class ValidateNewCategoryIsAddedTest {
	WebDriver driver;

	@Test
	public void validNewCategoryIsAdd() {

		driver = BrowserFactory.init();

		ValidateAddedcategory validateAddedcategory = PageFactory.initElements(driver, ValidateAddedcategory.class);

		validateAddedcategory.categoryIsAdded();

		BrowserFactory.tearDown();

	}

}
