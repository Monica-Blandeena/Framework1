package testCases;

import java.net.Socket;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClase;

public class TC_LoginCase extends BaseClase	{
	
	
	@Test(groups="regression")
	
	public void LoginFlow(String br) {
		
		logger.info("*********** login test flow");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.Loginmail(p.getProperty("email"));
		lp.LoginPwd(p.getProperty("password"));
		lp.LoginBtn();
		
		MyAccount myact=new MyAccount(driver);
		boolean displayed=myact.isMyAccountDisplay();
		Assert.assertTrue(displayed);
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("******* ending *************");
		
	
	}
	
	

}
