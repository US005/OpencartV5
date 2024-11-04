package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
public	WebDriver driver;
public Logger logger;
public Properties p;

	@BeforeClass (groups= {"sanity", "Regression"})
	@Parameters({"browser"})
	public void setup(String br) throws IOException
	{
		
		FileReader file = new FileReader("./src//main//resources//config.properties");
		p =new Properties();
		p.load(file);
		
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver =new ChromeDriver(); break;
		case "edge" : driver =new EdgeDriver(); break;
		}
		
		
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("appurl"));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	/*	@AfterClass
	public void teardown()
	{    logger =LogManager.getLogger(this.getClass());
		driver.quit();
	} */

	
	public String Randomstring()
	{
		String GeneratedString=RandomStringUtils.randomAlphabetic(6);
		return GeneratedString;
	}
	
	public String Randompassword()
	{
		String GeneratedString1=RandomStringUtils.randomAlphabetic(6);
		return GeneratedString1;
	}
	
	public String Randomnumber()
	{
		String GeneratedString1=RandomStringUtils.randomNumeric(10);
		return GeneratedString1;
	}
	
	
	public void SwitchWindows()
	{
		Set<String> handles= driver.getWindowHandles();
		for(String windows:handles)
		{
			driver.switchTo().window(windows);
		}
	}


}
