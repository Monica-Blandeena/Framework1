package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationPage extends BasePage {
	
	public registrationPage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[contains(@value,'0')]")
	WebElement noRadioBtn;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement privacyPolicy;
	
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement message;
	
	
	//actions methods
	
	public void enterFirstName(String Fname) {
		firstName.sendKeys(Fname);
	}
	public void enterLastName(String lname) {
		lastName.sendKeys( lname);
	}
	public void enterEmail(String enterEmail) {
		email.sendKeys(enterEmail);
	}
	public void enterPhoneNumber(String number) {
		phoneNumber.sendKeys(number);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void enterconfirmassword(String pwd) {
		confirmPassword.sendKeys(pwd);
		
	}
	public void clickNo() {
		noRadioBtn.click();
	}
	public void clickYes() {
		privacyPolicy.click();
	}
	public void clickContinuebtn() {
		continueButton.click();
	}
	
	public String message() {
		try {
			return(message.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
}
