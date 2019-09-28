package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCconnectionReusable {
	
	 
	
	public String getData(String myQuery , String ColumnName ,String myExpectedID ,String ExpectedColumnName) throws Exception{
		
		 Connection connection = DriverManager.getConnection(GlobalVariableReader.getData("DBURL") , GlobalVariableReader.getData("usernameDB"),GlobalVariableReader.getData("passwordDB") );
		 Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		 ResultSet resultSet = statement.executeQuery(myQuery);
		
		 resultSet.last();
		 
		 int rowCount = resultSet.getRow();
			
		 resultSet.first();
		 	
		  
		 
		 String myReturn = null;
		 
		 for (int i = 0; i < rowCount-1; i++) {
			
			 resultSet.next();
			 
			 String id= resultSet.getString(ColumnName);
			 
			 if(id.equals(myExpectedID)) {
				 
				 myReturn= resultSet.getString(ExpectedColumnName);
				 
			 }
			 
		}
		 
		 
		 connection.close();
		 statement.close();
		 resultSet.close();
		  
		 return myReturn;
	}
	 
}
