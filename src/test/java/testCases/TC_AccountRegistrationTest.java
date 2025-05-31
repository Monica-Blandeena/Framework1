package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.registrationPage;
import testBase.BaseClase;

public class TC_AccountRegistrationTest extends BaseClase{
	
	

	@Test(groups="sanity")
	public void accountRegister() {
		logger.debug("*********** logs started ****************");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickAccount();
		hp.clickRegister();
		
		
		registrationPage rp=new registrationPage(driver);
		rp.enterFirstName("Monica");
		rp.enterLastName("p");
		rp.enterEmail(randomstring()+"@gmail.com");
		rp.enterPhoneNumber("9187654323");
		rp.enterPassword("Mony123@");
		rp.enterconfirmassword("Mony123@");
		rp.clickNo();
		rp.clickYes();
		rp.clickContinuebtn();
		String ConfMsg=rp.message();
		Assert.assertEquals(ConfMsg,"Your Account Has Been Created!");
	
	}
	catch(Exception e) {
		logger.error("Test failed");
		logger.debug("Debug failed");
	}
			

	}}
