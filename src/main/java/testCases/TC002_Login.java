package testCases;

import org.testng.annotations.Test;

import pageObject.LoginPage;

public class TC002_Login extends BaseClass {
	
	@Test (groups={"sanity"})
	public void Verify_login()
	{
		LoginPage LP=new LoginPage(driver);
		
		LP.usernames(p.getProperty("username"));
        LP.passwords(p.getProperty("password"));		
		LP.submit();
		
		
	}

}
