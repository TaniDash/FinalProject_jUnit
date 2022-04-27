package test;

import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.CheckboxValidationPage;
import util.BrowserFactory;

public class SingleItemRemoveTest extends BasePage{

	WebDriver driver;
	CheckboxValidationPage checkboxValidation;
	String insertName= "Test";
	
	@Test
	public void userShouldBeAbleToRemoveSingleListItem() throws InterruptedException {
		driver= BrowserFactory.init();
		checkboxValidation= PageFactory.initElements(driver, CheckboxValidationPage.class);
		checkboxValidation.addSingleItem(insertName);
		checkboxValidation.addSingleItem(insertName);
		
//		String beforCssPath = "input[name='todo[";
//		String afterCssPath = "]']";
		
		List<WebElement>myList2= driver.findElements(By.xpath("//div[@id='todos-content']/child::*/ul//li//descendant::input"));
		System.out.println(myList2.size());
		
		checkboxValidation.validateSingleListItemRemoved(myList2.size(), myList2);
		
}
}