package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.MyDriver;

public class LoginToPage {
	
	private WebDriver driver = MyDriver.getDriver();
	
	public LoginToPage() {
		this.driver = MyDriver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	 @FindBy(id="mat-input-2")
	 public WebElement input_Username;
	 
	 @FindBy(id="mat-input-3")
	 public WebElement input_Password;
	 
	 @FindBy(xpath="//span[contains(text(),'LOGIN')]")
	 public WebElement btn_Login;
	
	  
	 
}
