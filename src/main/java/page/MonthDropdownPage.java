package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class MonthDropdownPage extends BasePage {
	WebDriver driver;

// calling on the constructor to pass the webdriver
	public MonthDropdownPage(WebDriver driver) {
		this.driver = driver;
	}

	// webelement for due date dropdown
	@FindBy(how = How.XPATH, using = "//select[@name = 'due_month']")
	WebElement DUE_DATE_ELEMENT;

	public void validateTheMonthDropdownHasAllTheMonths() {
		Select sel = new Select(DUE_DATE_ELEMENT);		
		
		List actualList = new ArrayList(); // create actual list variable
		 
		for(WebElement ele : sel.getOptions())  { // using ele to iterate the Array List
			
			actualList.add(ele.getText()); // storing the text in List
		}
		// creating expected list variable
		List expectedList = new ArrayList();
		 expectedList.add("None");
		 expectedList.add("Jan");
		 expectedList.add("Feb");
		 expectedList.add("Mar");
		 expectedList.add("Apr");
		 expectedList.add("May");
		 expectedList.add("Jun");
		 expectedList.add("Jul");
		 expectedList.add("Aug");
		 expectedList.add("Sep");
		 expectedList.add("Oct");
		 expectedList.add("Nov");
         expectedList.add("Dec");
         // doing Assertion 
         for (int i =0;i< actualList.size(); i++) {
        	 System.out.println("actual list is " + actualList.get(i) + "& Expected list is  " + expectedList.get(i));
        	 Assert.assertTrue(actualList.get(i).equals(expectedList.get(i)));
         }		
	
	}
}
