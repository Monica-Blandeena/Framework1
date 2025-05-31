package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//locator
	@FindBy(xpath="//input[@id='input-email']")
	WebElement LEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement LPwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement LBtn;
	
	//action methods
	public void Loginmail(String loginmail) {
		LEmail.sendKeys(loginmail);
		
	}
	public void LoginPwd(String Lpwd) {
		LPwd.sendKeys(Lpwd);
	}
	public void LoginBtn() {
		LBtn.click();
}
	

}
