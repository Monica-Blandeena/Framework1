package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver){
		super(driver);
//		this.driver=driver;
//		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement login;
	
	
	//action methods
	public void clickAccount() {
		myAccount.click();
	}
	public void clickRegister() {
		register.click();
	}
	
	public void clickLogin() {
		login.click();
	}
	

}
