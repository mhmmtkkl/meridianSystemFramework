package StepDefinition;

import Utilities.JDBCconnectionReusable;
import cucumber.api.java.en.Given;

public class GetDataFromDB {

	JDBCconnectionReusable j1 = new JDBCconnectionReusable();
	
	@Given("Get the connection and get the data {string} , {string} , {string} ,  {string}")
	public void GetDataFromDB2(String myQuery, String ColumnName, String myExpectedID, String ExpectedColumnName) throws Exception {
	  
		String s1 = j1.getData(myQuery, ColumnName, myExpectedID, ExpectedColumnName);
		
		System.out.println(s1);
		
	};
}
