package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.analysis.function.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.MyDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfterClass {

	
	
//	ReusableMethods r1 = new ReusableMethods();
	
 
	
	@Before
	public void beforeClass() {
		System.out.println("before is starting");
		WebDriver driver = MyDriver.getDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@After
	public void afterClass(Scenario scenario) {
		   		
		if(scenario.isFailed()) {
		
			TakesScreenshot scrShot =((TakesScreenshot)MyDriver.getDriver());

			System.out.println("after started ----------------------------------------------------------");
		  		//Call getScreenshotAs method to create image file

	             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination
 
	         
	               
	           		String FeatureFileName = scenario.getId();
	                
	           System.out.println("FeatureFileName     " + FeatureFileName);
	           		
//	                removing the / from feature file name
	                String[] arrFeat=FeatureFileName.split("/");
	                
	                int arrFeatLength = arrFeat.length;
	                
	                String FeatureName = arrFeat[arrFeatLength-1];
	               
	           System.out.println("FeatureName     " + FeatureName);
	           
//	                removing the . from feature file name
	                int dotPlace = FeatureName.indexOf(".");
	                
	                FeatureName= FeatureName.substring(0,dotPlace);
	                
	           System.out.println("FeatureName     " + FeatureName);
	                
//	                creating the todays date and hour for now 
	                Date now = new Date();
	                
	           System.out.println("now     " + now);

	                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
	                
	                String dateinFormat = formatter.format(now);
	                
	                dateinFormat = dateinFormat.replace(":", "-");
	                
	                File DestFile=new File("target/screenShots/"+FeatureName+""+dateinFormat+".png");
	                
	                //Copy file at destination
	                
	                try {
	                	FileUtils.copyFile(SrcFile, DestFile);
	                } catch (IOException e) {
 
						e.printStackTrace();
					}
			}
	                
		 
		 	MyDriver.closeDriver();
	               
	
		}
	
}
