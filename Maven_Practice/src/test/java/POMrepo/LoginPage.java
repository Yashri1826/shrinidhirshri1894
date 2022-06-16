package POMrepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	

		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="Email")
		private WebElement emailTF;
		
		public void email_value(String email){
			emailTF.sendKeys(email);
		}
		
		@FindBy(id="Password")
		private WebElement passwordTF;
		
		public void Password_value(String password){
			passwordTF.sendKeys(password);
		}
		
		@FindBy(xpath="//input[@value='Log in']")
		private	WebElement loginButton;
		
		public void loginClick(){
			loginButton.click();
			
		}

		public WebElement getEmailTF() {
			return emailTF;
		}

		public WebElement getPasswordTF() {
			return passwordTF;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public void setEmailTF(WebElement emailTF) {
			this.emailTF = emailTF;
		}

		public void setPasswordTF(WebElement passwordTF) {
			this.passwordTF = passwordTF;
		}

		public void setLoginButton(WebElement loginButton) {
			this.loginButton = loginButton;
		}
	}


