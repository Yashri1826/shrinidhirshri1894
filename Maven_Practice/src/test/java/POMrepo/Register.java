package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	public void registerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value='M']")
	
	public void radiobuttonClick(){
		radiobutton.click();
	}
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstnameTF;
	
	public void firstnameTFClick(String firstname){
		firstnameTF.sendKeys(firstname);
	}
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastnameTF;
	
	public void lastnameTFClick(String lastname){
		lastnameTF.sendKeys(lastname);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailTF;
	
	public void emailTFClick(String email){
		emailTF.sendKeys(email)
;
	}
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordTF;
	
	public void passwordTFClick(String password){
		passwordTF.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement confirnpwdTF;
	
	public void confirnpwdTFClick(String confirnpwd){
		confirnpwdTF.sendKeys(confirnpwd);
	}
	
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement registerbutton;
	
	public void registerbuttonClick(){
		registerbutton.click();
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirnpwdTF() {
		return confirnpwdTF;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}

	public void setFirstnameTF(WebElement firstnameTF) {
		this.firstnameTF = firstnameTF;
	}

	public void setLastnameTF(WebElement lastnameTF) {
		this.lastnameTF = lastnameTF;
	}

	public void setEmailTF(WebElement emailTF) {
		this.emailTF = emailTF;
	}

	public void setPasswordTF(WebElement passwordTF) {
		this.passwordTF = passwordTF;
	}

	public void setConfirnpwdTF(WebElement confirnpwdTF) {
		this.confirnpwdTF = confirnpwdTF;
	}

	public void setRegisterbutton(WebElement registerbutton) {
		this.registerbutton = registerbutton;
	}
		

}
