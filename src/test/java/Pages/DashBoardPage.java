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
	
	@FindBy(xpath="//fuse-nav-vertical-collapsable[contains(@class,'inserted open')]//span[text()='Setup']")
	public WebElement btn_Setup;
	
	@FindBy(xpath="//span[text()='Entrance Exams']")
	public WebElement btn_EntranceExams;
	
	
}
