package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testCases.BaseClass;

public class AccountRegistrationPage extends BasePage {
	
	//Constructor
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	@FindBy (xpath=" //input[@type='firstName']")
	WebElement Firstname;
	
	@FindBy (xpath=" //input[@type='lastName']")
	WebElement Lastname;
	
	@FindBy (xpath=" //input[@id='userEmail']")
	WebElement Email;
	
	@FindBy (xpath="//input[@id='userPassword']")
	WebElement Password;
	
	@FindBy (xpath="//input[@id='confirmPassword']")
	WebElement ConfirmPassword;
	
	@FindBy (xpath="//input[@id='userMobile'] ")
	WebElement Number;
	
	@FindBy (xpath="//input[@type='checkbox']")
	WebElement Checkbox;
	
	
	@FindBy (xpath="//input[@type='submit'] ")
	WebElement Submit;
	
	@FindBy (xpath="//h1[@class='headcolor']")
	WebElement Message;
	
	@FindBy (xpath="//select[@formcontrolname='occupation']")
	WebElement drops;
	
	
	
//==============================================================================================================
//==============================================================================================================
	
	//Actions
	public void  firstname(String fn)
	{
		Firstname.sendKeys(fn);
	}
	
	public void  lastname(String ln)
	{
		Lastname.sendKeys(ln);
	}
	
	public void  email(String mail)
	{
		Email.sendKeys(mail);
	}
	
	public void  passwrod(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void  confirmpassword(String Cpwd)
	{
		ConfirmPassword.sendKeys(Cpwd);
	}
	
	public void  number(String num)
	{
		Number.sendKeys(num);
	}
	
	public void  submit()
	{
		Submit.click();
	}
	
	public void checkbox()
	{
		Checkbox.click();
	}
	
	public String confirmmessage()
	{
	try
	  {
		return(Message.getText());
	   }catch(Exception e) {
		return(e.getMessage());
	     }
	}
	
	public void dropdowns()
	{
		drops.click();
		Select dropdown = new Select(drops);
		dropdown.selectByVisibleText("Engineer");
	}
	
}
