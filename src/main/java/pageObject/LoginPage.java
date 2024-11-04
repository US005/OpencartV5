package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	//Locators
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	//Locators
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='userPassword']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement Logged;
	
	//Actions
	
	public void usernames(String un)
	{
		Username.sendKeys(un);
	}
	
	public void passwords(String pw)
	{
		Password.sendKeys(pw);
	}
	
	public void submit()
	{
		Logged.click();
	}
}


