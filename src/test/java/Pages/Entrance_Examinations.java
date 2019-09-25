package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.CreteNewExamSteps;
 
import Utilities.MyDriver;

public class Entrance_Examinations {

private WebDriver driver = MyDriver.getDriver();
	
	 

	public Entrance_Examinations() {
		this.driver = MyDriver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@class='mat-mini-fab mat-button-base mat-accent']")
	public WebElement icn_Plus;
	
	@FindBy(xpath="(//table//tbody//tr[1]//td[8]//button)[1]")
	public WebElement btn_firstEdit;
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	public WebElement btn_Yes;
	 
	
	
	
}
