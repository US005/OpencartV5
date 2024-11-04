package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.BasePage;
import pageObject.HomePage;

public class TC001_Register extends BaseClass  {

	@Test (groups={"Regression"})
	public void Verify_Registration()
	{
		
	  //  logger.info("***Starting Test Cases***");
	   
	    HomePage HP = new HomePage(driver);
        HP.clkRegister();
        
      //  logger.info("***Registration Started****");
        AccountRegistrationPage AR = new AccountRegistrationPage(driver);
        AR.firstname(Randomstring());
        AR.lastname(Randomstring().toUpperCase());
        AR.email(Randomstring() + "@gmail.com");
        AR.number(Randomnumber());
        AR.dropdowns();
        String Passwords=Randompassword();
        AR.passwrod( Passwords + "A@1");
        AR.confirmpassword(Passwords + "A@1");
        AR.checkbox(); 
        AR.submit();
        
      Assert.assertEquals(AR.confirmmessage(), "Account Created Successfully"); 
        
     //   logger.info("***Sucessfully Registered***");
	}
	
	
}
