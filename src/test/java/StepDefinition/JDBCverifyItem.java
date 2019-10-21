package StepDefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Item_Category;
import Utilities.GlobalVariableReader;
import Utilities.JDBCconnectionReusable;
import Utilities.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class JDBCverifyItem {

	JDBCconnectionReusable jd = new JDBCconnectionReusable();
	
	Item_Category i1 = new Item_Category();
	
	
WebDriverWait wait = new WebDriverWait(MyDriver.getDriver(), 10);
	
	@Then("verify the Name in the website and in the database is same")
	public void verify_the_Name() throws Exception{
	    
	  ArrayList<String> e1 = i1.getName();
		
	  for(int i = 0 ;i<e1.size() ;i++) {
		  
		  System.out.println(e1.get(i).toString());
	  }
	  
	  boolean b1 = jd.getData("DBURL","usernameDB", "passwordDB", i1.quesryForCity, "city", e1);
		 
      System.out.println(b1);
      
	};
	
}
