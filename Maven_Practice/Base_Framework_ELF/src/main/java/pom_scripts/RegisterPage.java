package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {		
		super(driver);
	}

	/*@FindBy(className  ="email")
	WebElement emailTF;
	public void enterValueInEmail(String email) {

		enter_value(emailTF, email);
	}*/ 
	@FindBy(xpath="//input[@value='M']")
	WebElement Male_radio_button;

	public void gender(String male){//String mradio_button
		enter_value(Male_radio_button, male);	
	}

	@FindBy(xpath="//input[@id='FirstName']")
	WebElement First_nameTF;

	public void FN_value(String Firstname){
		enter_value(First_nameTF, Firstname);
	}

	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastNameTF;

	public void LastName_value(String LastName){
		enter_value(LastNameTF, LastName);
	}

	@FindBy(xpath="//input[@id='Email']")
	WebElement EmailTF;

	public void Email_value(String Email){
		enter_value(EmailTF, Email);
	}

	@FindBy(xpath="//input[@id='Password']")
	WebElement PasswordTF;

	public void Password_value(String Password){
		enter_value(PasswordTF, Password);	
	}

	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement ConfirmPasswordTF;

	public void ConfirmPassword_value(String ConfirmPassword){
		enter_value(ConfirmPasswordTF, ConfirmPassword);
	}

	@FindBy(xpath="//input[@id='register-button']")
	WebElement rebutton;

	public void registerbutton(String registerbutton){
		clickAction(rebutton);
	}

}
