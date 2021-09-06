package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ValidateAddedcategory extends BasePage {

	
	WebDriver driver;

	// calling on the constructor to pass the webdriver
	public ValidateAddedcategory (WebDriver driver) {
		this.driver = driver;
	}
	// the addeed category hyperlink
	@FindBy(how=How.XPATH, using = "//a[@title = 'Remove this category'][169]") WebElement ADDED_CATEGORY_ELEMENT; 
	
	
	
	
	
	
	// validate the presence of the added category
	
	public void categoryIsAdded()  {
		 String actualText = ADDED_CATEGORY_ELEMENT.getText();
		 String expectedText ="LowHeat";
		Assert.assertEquals(actualText, expectedText);
}}
