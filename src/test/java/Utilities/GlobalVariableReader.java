package Utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class GlobalVariableReader {

	
	public static String getData(String whichData) {
		
		String path ="GlobalVariable.properties";
		
		String myResult = null;
		
		try(InputStream input = new FileInputStream(path)){
			
			Properties prop = new Properties();
			
			prop.load(input);
			
			myResult = prop.getProperty(whichData);
			
		}catch(Exception e) {
			 
		}
		
		
		return myResult;
		
	}
	
	
	
}
