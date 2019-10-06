package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.MyDriver;

public class DashBoardPage {

	private WebDriver driver = MyDriver.getDriver();
	
	public DashBoardPage() {
		
		this.driver = MyDriver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(xpath="//span[text()='Exams']")
	public WebElement dropdown_exams;
	
	@FindBy(xpath="//span[text()='Entrance Exams']")
	public WebElement btn_EntranceExams;
	
	@FindBy(xpath="//fuse-nav-vertical-collapsable[contains(@class,'inserted open')]//span[text()='Setup']")
	public WebElement btn_Setup;
	 
	public void Clickbtn_Setup() {
		
		btn_Setup.click();
		
	}
	
	@FindBy(xpath="//span[text()='Item']")
	public WebElement Item_Dropdown;
	
	public void ClickItem_Dropdown() {
		
		Item_Dropdown.click();
		
	}
	
	@FindBy(xpath="//span[text()='Inventory Categories']")
	public WebElement btn_inventory;
	
	public void Clickbtn_inventory() {
		
		btn_inventory.click();
		
	}
	
	
	
	
	
	
	
	
	
}
