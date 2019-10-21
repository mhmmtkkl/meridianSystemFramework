package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;


public class JDBCconnectionGetData {
	
	public static void main(String[] args) throws Exception {
		 
	 Connection connection = DriverManager.getConnection(GlobalVariableReader.getData("DBURL") , GlobalVariableReader.getData("usernameDB"),GlobalVariableReader.getData("passwordDB") );
	 Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	 ResultSet resultSet = statement.executeQuery("  select city from offices;");
	 
	 resultSet.last();
	 
	 int rowCount = resultSet.getRow();
		
	 resultSet.first();
	 	
	 System.out.println("total count of the table --> " +rowCount);
	 
	 ArrayList<WebElement> a1= new ArrayList<>();
	 
	 
	 
	 
	 do{
		 
		 String fromDB = resultSet.getString("city");
		 
		 if(fromDB.equals("")) {
			 
			 
			 
		 }
		 
	 } while(resultSet.next());
	 
	 
	 
	 connection.close();
	 statement.close();
	 resultSet.close();
	 
	}
	
}
