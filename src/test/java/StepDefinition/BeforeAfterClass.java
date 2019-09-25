package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.MyDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfterClass {

	private WebDriver driver = MyDriver.getDriver();
	
//	ReusableMethods r1 = new ReusableMethods();
	
 
	
	@Before
	public void beforeClass() {
		WebDriver driver = MyDriver.getDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@After
	public void afterClass() {
		
		  TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File("target/screenShots/myScrenS.png");

	                //Copy file at destination

	                try {
						FileUtils.copyFile(SrcFile, DestFile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

	                
//		
//	                driver.close();
//	                driver.quit(); 
		
	}
}
