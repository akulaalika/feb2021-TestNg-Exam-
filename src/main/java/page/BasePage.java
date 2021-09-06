package page;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public int randomGenerator(int boundaryNumber) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(boundaryNumber);
		return randomNumber;
	}

	public void selectDropdown(WebElement element, String visibleTest) throws Throwable {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleTest);
		Thread.sleep(2000);
	}

	public void waitForElement(WebDriver driver, int timeInSecond, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void enteyKeyAction(WebDriver driver) {

		// SUBMIT_ELEMENT.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
}
