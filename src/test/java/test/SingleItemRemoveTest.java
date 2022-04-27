package test;

import java.util.List;
import java.util.Random;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.BasePage;
import pages.CheckboxValidationPage;
import util.BrowserFactory;

public class SingleItemRemoveTest extends BasePage {

	WebDriver driver;
	CheckboxValidationPage checkboxValidation;
	String insertName= "Test";
	
	@Test
	public void userShouldBeAbleToRemoveSingleListItem() throws InterruptedException {
		driver= BrowserFactory.init();
		checkboxValidation= PageFactory.initElements(driver, CheckboxValidationPage.class);
		checkboxValidation.addSingleItem(insertName);
		
		

		
	}

	
	
		
}
