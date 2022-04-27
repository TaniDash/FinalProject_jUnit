package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public int randomNum(int boundaryNum) {
		Random rn= new Random();
		int num= rn.nextInt(boundaryNum);
		return num;
		}
	
	
	public int randomNum1(int innerbound, int upperbound) {
		return (new Random().nextInt(upperbound-innerbound)+innerbound);
		}
	
	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}
	
}
