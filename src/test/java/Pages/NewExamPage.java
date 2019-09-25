package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.MyDriver;

public class NewExamPage {


private WebDriver driver = MyDriver.getDriver();
	
	public NewExamPage() {
		this.driver = MyDriver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath="//h3[contains(text(),'New Exam')]")
	public WebElement text_NewExam;
	
	public String NewExamText = "New Exam";
	
	@FindBy(xpath="//input[contains(@id,'ms-text-field')]")
	public WebElement input_name;
	
	@FindBy(xpath="//input[@placeholder='Reg.Start']")
	public WebElement input_RegStart;
	
	@FindBy(xpath="//input[@placeholder='Reg.End']")
	public WebElement input_RegEnd;
	
	@FindBy(xpath="//div/span[text()='Academic Period']")
	public WebElement dropdown_academiPeriod;
	
	@FindBy(xpath="//div/span[text()='Grade Level']")
	public WebElement dropdown_GradeLevel;
	
	public String dropdownOption = "//span[@class='mat-option-text']";
	
	@FindBy(xpath="//span[text()='Save']")
	public WebElement button_Save;
	
	@FindBy(xpath="//button[@class='mr-16 mat-icon-button mat-button-base ng-star-inserted']")
	public WebElement button_Back;
	
	
	
}
