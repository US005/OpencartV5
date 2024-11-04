package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases.BaseClass;

public class HomePage extends BasePage {
	
	//Constructor
 public  HomePage (WebDriver driver)
     {
    	 super(driver); 
     }
     
     //Locators
     @FindBy (xpath="//a[@class='btn1']")
     WebElement lnkRegister;
     
     
     public void clkRegister()
     {
    	 lnkRegister.click();
     }
     
    
}
