package page;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class AddCategoryPage extends BasePage {
	
	WebDriver driver;

	// calling on the constructor to pass the webdriver
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.XPATH, using = "//input[@name ='categorydata']") WebElement ADD_TEXT; 
	@FindBy(how=How.XPATH, using = "//input[@value  = 'Add category']") WebElement CLICK_BUTTON_ELEMENT; 
	@FindBy(how=How.XPATH, using = "//body") WebElement AlreadyExistingValue; 
	
	
	
	//WebElement BODY_TEXT_ELEMENT = driver.findElement(By.cssSelector("//body"));
	//@FindBy ( how = How.XPATH, using ="//input[@name ='submit'][2]")
	
	
	
	
	public void addCategoryText() {
		ADD_TEXT.sendKeys();
		
	}
		
	

	public void clickAddCategory()  {
		CLICK_BUTTON_ELEMENT.click();
		
	
	}
	
	public void duplicateValueAdded() {
		List alreadyAddedCat = new ArrayList();
		
		//alReadyAddedCat = AlreadyExistingValue.getText();
		 //alreadyAddedCat =
			 AlreadyExistingValue.getText();
			 
			 System.out.println(AlreadyExistingValue.getText());

//		for(String ele : AlreadyExistingValue.getText()){
//
//		String added	= alreadyAddedCat1.get(i).getText();
//			

		}
		
//		
//		if(status){
//			System.out.println("Allows multiple selection");
//		} else {
//			System.out.println("Does not allow multiple selection");
//		}
//		
		
//		WebElement l=driver.findElement(By.tagName("body"));
//		String t = l.getText();
//	}
	
	}

	


	