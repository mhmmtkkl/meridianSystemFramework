package StepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.DashBoardPage;
import Pages.Entrance_Examinations;
import Pages.Item_Category;
import Utilities.GetTheDatafromExcal;
import Utilities.MyDriver;
import Utilities.ReusableMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AddCategorySteps {

	DashBoardPage d1 = new DashBoardPage();
	
	ReusableMethods r1 = new ReusableMethods();
	
	Entrance_Examinations e1 = new Entrance_Examinations();
	
	Item_Category i1 = new Item_Category();
	
	
	WebDriverWait wait = new WebDriverWait(MyDriver.getDriver(), 10);
	
	@And("Click on Item dropdown")
	public void Click_on_Item_dropdown(){
	    
	 d1.ClickItem_Dropdown();
	  
		
	};
	 
	@And("Click on setup dropdown")
	public void Click_on_setup_dropdown(){
	    
	d1.Clickbtn_Setup();
		
	};
 
	@And("Inventory Categories")
	public void Inventory_Categories(){
	    
	 d1.Clickbtn_inventory();
		
	};
	 
	@Then("Verify item caagory page is displayed")
	public void Verify_item_caagory_page_is_displayed(){
	    
	 wait.until(ExpectedConditions.elementToBeClickable(e1.icn_Plus)); 
		
	 
	 boolean urlExpected = r1.verifyURL("item-category");
		
	 Assert.assertTrue(urlExpected == true);
	 
	};
 
 
	 
	@And("Fill the name input")
	public void Fill_the_name_input() throws Exception{
	      	
		i1.SendKeysInputName("Muhammet");
		
		
	};
	 
	@And("Choose the user type")
	public void Choose_the_user_type(){
	    
		i1.Clickinput_userType();
		
		int sizeofUsertpye = i1.listOfuserType.size();
		
		int randomNum = r1.randomNum(sizeofUsertpye);
				
		i1.listOfuserType.get(randomNum).click();
		
	};
	
 
	 
	@Then("Verify the catagory is created")
	public void Verify_th_catagory_is_created(){
	    
	 
		
	};
	 

	
	
}
