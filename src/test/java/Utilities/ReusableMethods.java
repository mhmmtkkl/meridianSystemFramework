package Utilities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer;

public class ReusableMethods {

	WebDriver driver = MyDriver.getDriver();
	
	public String getFeatureFileNameFromScenarioId(Scenario scenario) {
	    String featureName = "Feature ";
	    String rawFeatureName = scenario.getId().split(";")[0].replace("-"," ");
	    featureName = featureName + rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);

	    return featureName;
	}
	
//	we are clicking on the first1 and get the size of the elementXpath then click on any of the option
	public void ClickAndChooose(WebElement first1 , String elementXpath) {
		
		first1.click();
		
		int sizeofElement = driver.findElements(By.xpath(elementXpath)).size();
		
		int myRandom = randomNum(sizeofElement);
		
		driver.findElement(By.xpath("("+elementXpath+")["+myRandom+"]")).click();
							
	}
	
	
//	Random number creating 
	public int randomNum(int max) {
		
		Random rnd = new Random();
		
		int randomNumber = rnd.nextInt(max-1)+1;
		
		return randomNumber;
	}
	
	
	
	public String Dates(int howManydays) {
		
		Date Mydate = new Date();
		
		System.out.println(Mydate);
		
		Calendar myCal = Calendar.getInstance();
		
		myCal.setTime(Mydate);
		
		myCal.add(Calendar.DAY_OF_MONTH, howManydays);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		String myDateReturn = sdf.format(myCal.getTime()).toString();
		
		return myDateReturn;
	}
	
	 
	
	
	
	
	
	
	
}
