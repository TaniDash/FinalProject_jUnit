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

public class CheckboxValidationTest {

	WebDriver driver;
	CheckboxValidationPage checkboxValidation;
	String inputName = "Test";

	@Test
	public void userShouldBeAbleToValidateToggleAllAndAllItemList() throws InterruptedException {
		driver = BrowserFactory.init();
		checkboxValidation = PageFactory.initElements(driver, CheckboxValidationPage.class);

		checkboxValidation.addSingleItem(inputName);
		checkboxValidation.clickToggleAllCheckbox();

		List<WebElement> myList = driver.findElements(By.xpath("//div[@id='todos-content']/child::*/ul//li//descendant::input"));
		System.out.println(myList.size());
		
		boolean valid= true;
		valid= checkboxValidation.validateAllListItemsSelected(myList.size(), myList);		
		Assert.assertEquals(true, valid);
		
		
		

//		boolean b= true;
//		for (int i = 0; i < myList.size(); i++) {
//
//			if (myList.isEmpty()) {
//				System.out.println("No list items are available!");
//			} else if (myList.get(i).isSelected()) {
//				b = myList.get(i).isSelected();
//			}
//			Assert.assertEquals("Items are not checked!", true, b);
//		}

		
	}
	

}