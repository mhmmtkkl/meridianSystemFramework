package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCconnectionGetData {
	
	public static void main(String[] args) throws Exception {
		 
	 Connection connection = DriverManager.getConnection(GlobalVariableReader.getData("DBURL") , GlobalVariableReader.getData("usernameDB"),GlobalVariableReader.getData("passwordDB") );
	 Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	 ResultSet resultSet = statement.executeQuery("  select * from products;");
	
	 resultSet.last();
	 
	 int rowCount = resultSet.getRow();
		
	 resultSet.first();
	 	
	 System.out.println(rowCount);
	 
	 for (int i = 0; i < rowCount-1; i++) {
		
		 resultSet.next();
		 
		 
	}
	 
	 connection.close();
	 statement.close();
	 resultSet.close();
	 
	}
	
}
