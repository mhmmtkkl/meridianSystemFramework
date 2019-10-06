package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.MyDriver;

public class Item_Category {

	private WebDriver driver = MyDriver.getDriver();
	
	public Item_Category() {
		this.driver = MyDriver.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//item-category-dialog//ms-text-field//input")
	public WebElement input_name;
	
	public void SendKeysInputName(String anyThing) {
		
		input_name.sendKeys(anyThing);
		
	}
	

	@FindBy(xpath="//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
	public WebElement input_userType;
	
	public void Clickinput_userType() {
		
		input_userType.click();
		
	}
	
	
	@FindAll({
			@FindBy(xpath="//span[@class='mat-option-text']")
	})
	public List<WebElement> listOfuserType;
	
	
	
	
	
	
	
	
	
}
