package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckboxValidationPage extends BasePage {

	WebDriver driver;

	public CheckboxValidationPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "input[type='checkbox'][name='allbox']")
	WebElement toggleAllCheckbox;
	@FindBy(how = How.CSS, using = "input[type='text'][name='data']")
	WebElement addItemBox;
	@FindBy(how = How.CSS, using = "input[type='submit'][value='Add']")
	WebElement addButton;
	@FindBy(how = How.CSS, using = "input[type='submit'][value='Remove']")
	WebElement removeButton;
	@FindBy(how = How.XPATH, using = "//div[@id='todos-content']/child::*/ul//li//descendant::input")
	WebElement dynamicListElement;
	
//	By dynamicListLocator= By.cssSelector("form[action='todo.php']");

	public void clickToggleAllCheckbox() {
		toggleAllCheckbox.click();
	}

	public void addSingleItem(String itemName) {
		String insertedName= itemName+randomNum(99);
		addItemBox.sendKeys(insertedName);
		waitForElement(driver, 5, addButton);
		addButton.click();
	}
	
	public void clickRemoveButton() {
		removeButton.click();
	}
	
	
	public boolean validateAllListItemsSelected(int listItemSize, List<WebElement> listItems) {
		for (int i=0; i<listItemSize; i++) {
			listItems.get(i).isSelected();
//			if(b=false) {
//				break;
//				}
			}
		return true;
	}
	
	public boolean validateSingleListItemRemoved(int listItemSize, List<WebElement> listItems) {
		int n= randomNum1 (0, listItemSize);
		listItems.get(n).click();
		clickRemoveButton();
		boolean removedListItem= listItems.get(n).equals(null);
		Assert.assertEquals(false, removedListItem);
		return true;
	}



	
	
}
