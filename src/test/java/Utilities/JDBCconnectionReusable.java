package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class JDBCconnectionReusable {
	
	 
	
	public boolean getData(String DBURL ,String DBUsername ,String DBPassword, String myQuery , String ColumnName, ArrayList<String> ElementList  ) throws Exception{
		
		 Connection connection = DriverManager.getConnection(GlobalVariableReader.getData(DBURL) , GlobalVariableReader.getData(DBUsername),GlobalVariableReader.getData(DBPassword) );
		 Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		 ResultSet resultSet = statement.executeQuery(myQuery);
		  
		 resultSet.last();
		 
		 int rowCount = resultSet.getRow();
			
		 resultSet.first();
		 	
		 boolean b1 = false;
		 
		 System.out.println("total count of the table --> " +rowCount);
		 
		 int i =0;
		 
		 do{
			 
			 System.out.println("result set --> "+resultSet.getString(1));
			 
			 String e1 = ElementList.get(i).toString();
			 
			 String e2= resultSet.getString(1);
			 
			 System.out.println("e1 is here --> "+e1);
			 
			 System.out.println("e2 is here --> "+e2);
			 
			 if(e1.equals(e2)) {
				 
				 b1 = true;
				  
			 }else {
				 
				b1 = false; 
				
				 break;
			 }
			 
			 i++;
			 
		 } while(resultSet.next());
		 
		 
		 
		 connection.close();
		 statement.close();
		 resultSet.close();
		 
		 
	
 
	 	 return b1;
	}
}
 
