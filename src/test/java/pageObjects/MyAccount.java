package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{
	
	public MyAccount(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement Myaccount;
	
	@FindBy(xpath="//div[@class='list-group']//a[normalize-space()='Logout']")
	WebElement LogoutLink;
	
	public boolean isMyAccountDisplay() {
		try {
		return(Myaccount.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
			public void  clickLogout() {
				LogoutLink.click();
			}
		}
	


