package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.DashBoardPage;
import Pages.Entrance_Examinations;
import Pages.NewExamPage;
import Utilities.GetTheDatafromExcal;
import Utilities.GlobalVariableReader;
import Utilities.MyDriver;
import Utilities.ReusableMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class CreteNewExamSteps {

	private WebDriver driver = MyDriver.getDriver();
	
	DashBoardPage DBP = new DashBoardPage();
	
	Entrance_Examinations ee = new Entrance_Examinations();
	
	NewExamPage ne = new NewExamPage();
	
	ReusableMethods reusable = new ReusableMethods();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	public String name=null;
	
	@And("Click on exam dropdown")
	public void ClickonExamDropdown() throws Exception{
	      
		wait.until(ExpectedConditions.elementToBeClickable(DBP.dropdown_exams));
		
		DBP.dropdown_exams.click();
		 
	};
	
	@And("Click on setup")
	public void Click_on_setup(){
	    
		wait.until(ExpectedConditions.elementToBeClickable(DBP.btn_Setup));
		
		DBP.btn_Setup.click();
		
	};
	  
	@And("Click on Entrance Exams")
	public void Click_on_Entrance_Exams(){
	    
		wait.until(ExpectedConditions.elementToBeClickable(DBP.btn_EntranceExams));
		
		DBP.btn_EntranceExams.click();
	};
	
	@And("Click on plus icon")
	public void Click_on_plus_icon(){
	    
		wait.until(ExpectedConditions.elementToBeClickable(ee.icn_Plus));
		
		ee.icn_Plus.click();
		
	};
	
	
	@Then("New Exam Page Should be displayed")
	public void New_Exam_Page_Should_be_displayed(){
	    
		 Assert.assertTrue(ne.text_NewExam.getText().contains(ne.NewExamText));
		 
	};
	 
	@And("Type the exam name reg. start reg.end  choose the document type")
	public void Type_the_exam_name_reg_start_regend_choose_the_document_type() throws Exception{
	    
		name = GetTheDatafromExcal.getData("NewStudent", "Sheet1", "Name"); 
	 
		reusable.ClickAndChooose(ne.dropdown_academiPeriod, ne.dropdownOption);
		
		reusable.ClickAndChooose(ne.dropdown_GradeLevel, ne.dropdownOption);
		
		ne.input_name.sendKeys(name);
		
		ne.input_RegStart.sendKeys(reusable.Dates(5));
		
		ne.input_RegEnd.sendKeys(reusable.Dates(365));
	};
	 
	@And("Click on save")
	public void Click_on_save(){
	    
		ne.button_Save.click();
		
	};
	 
	@Then("Exam should be displayed in the Entrance Examinations page")
	public void Exam_should_be_displayed_in_the_Entrance_Examinations_page(){
	   
		wait.until(ExpectedConditions.elementToBeClickable(ne.button_Back));
		 
		ne.button_Back.click();
	    
		wait.until(ExpectedConditions.elementToBeClickable(ee.btn_firstEdit));
		
		driver.findElement(By.xpath("//td[text()=\""+name+"\"]/following-sibling::td//ms-delete-button/button")).click();
		
		ee.btn_Yes.click();
	};

 
}
