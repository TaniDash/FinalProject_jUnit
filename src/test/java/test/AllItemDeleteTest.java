package test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.CheckboxValidationPage;
import util.BrowserFactory;

public class AllItemDeleteTest {

	WebDriver driver;
	CheckboxValidationPage checkboxValidation;
	String insertName= "Test";
	
	@Test
	public void userShouldBeAbleToDeleteAllItem () throws InterruptedException {
		driver= BrowserFactory.init();
		checkboxValidation= PageFactory.initElements(driver, CheckboxValidationPage.class);
	
		List<WebElement> myList3 = driver.findElements(By.xpath("//div[@id='todos-content']/child::*/ul//li//descendant::input"));
		checkboxValidation.addSingleItem(insertName);
		checkboxValidation.addSingleItem(insertName);
		checkboxValidation.clickToggleAllCheckbox();
		checkboxValidation.clickRemoveButton();
		Thread.sleep(5000);
		Assert.assertTrue(myList3.isEmpty());
		

	
		
	}	
}