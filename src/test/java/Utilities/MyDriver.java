package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyDriver {

	private static WebDriver driver = null;
	
	public static WebDriver getDriver() {
			
		
		if(driver==null){
			
			
				if(GlobalVariableReader.getData("browser").equals("chrome")) {
					
					WebDriverManager.chromedriver().setup();
						
					driver= new ChromeDriver();
		
				}else if(GlobalVariableReader.getData("browser").equals("firefox")) {
					
					WebDriverManager.edgedriver().setup();
					
					driver = new FirefoxDriver();
				 	
				}
			 
		}
		
		
		return driver;
	}
	 
}
