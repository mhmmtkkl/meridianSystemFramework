package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.LoginToPage;
import Utilities.GlobalVariableReader;
import Utilities.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class SignInToMEridianWEbSite {

	private WebDriver driver = MyDriver.getDriver();
	
	LoginToPage LT = new LoginToPage();

	@Given("Nagigate to Meridian Website")
	public void NavigateToWebSite(){
	    
		 
		
		driver.get(GlobalVariableReader.getData("URL"));
		
		driver.findElement(By.xpath("//a[text()='Got it!']")).click();
		
	};

	
	@And("Fill the username and password input after this  click on the sign in button")
	public void TypeTheUserNameAndPasswordClickOnInput() throws InterruptedException{
	    
		LT.input_Username.sendKeys(GlobalVariableReader.getData("username"));
		
		LT.input_Password.sendKeys(GlobalVariableReader.getData("password"));
		
		LT.btn_Login.click();
		
		Thread.sleep(5000);
		 
	};
	 
	
	
	
}
