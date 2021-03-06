package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "ico-login")
	WebElement Loginlink;
	
	public void clickLogin() {
		clickAction(Loginlink);
	}
	
	@FindBy(className = "ico-register")
	WebElement RegisterLink;
	
	public void clickRegister() {
		clickAction(RegisterLink);
	}
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement shoppingcartlink;
	public void clickonshoppingcartlink() {
		clickAction(shoppingcartlink);
	}

	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	WebElement ComputerLink;
	public void clickonComputerLink() {
		clickAction(ComputerLink);
	}
}
