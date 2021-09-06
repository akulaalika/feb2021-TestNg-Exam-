package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
WebDriver driver;

AddCategoryPage addCategoryPageObj;

@BeforeMethod
public void beforeRun() {
	BrowserFactory.init();
	addCategoryPageObj = PageFactory.initElements(driver, AddCategoryPage.class);
}

	
	@Test(priority =1)
	public void validUserShouldBeAbleToSeeNewCategory() {
		
		
		addCategoryPageObj.clickAddCategory();
		
		
		BrowserFactory.tearDown();
	
	}
	
	@Test(priority=2)
	public void validateNoDuplicateCategory() {
		addCategoryPageObj.duplicateValueAdded();
	
	BrowserFactory.tearDown();
	
	}
	
}
