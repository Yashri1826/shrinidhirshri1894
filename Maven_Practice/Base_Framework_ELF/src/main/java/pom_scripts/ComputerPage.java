package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends BasePage {

	public ComputerPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[contains(text(),' Desktops')]")
	WebElement DesktopLink;
	
	public void clickonDesktopLink(){
		clickAction(DesktopLink);
	}

	@FindBy(xpath="//a[contains(text(),'Simple Computer')]")
	WebElement SimpleComputerLink;
	
	public void clickonSimpleComputerLink(){
		clickAction(SimpleComputerLink);
	}
	
	@FindBy(xpath="//input[@id='add-to-cart-button-75']")
	WebElement AddtoCartButton;
	
	public void clickonAddtoCartButton(){
		clickAction(AddtoCartButton);
	}
	
	@FindBy(xpath="//a[contains(text(),'Build your own computer')]")
	WebElement BuildYourOwnComputer;
	
	public void clickonBuildYourOwnComputer(){
		clickAction(BuildYourOwnComputer);
	}
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement AddtocartButton_BuildYourOwnComputer;
	
	public void clickonAddtocartButton_insideproduct(){
		clickAction(AddtocartButton_BuildYourOwnComputer);
	}
	
	@FindBy(xpath="//a[contains(text(),'Desktop PC with CDRW')]")
	WebElement DesktopPCwithCDRW;
	
	public void clickonDesktopPCwithCDRW(){
		clickAction(DesktopPCwithCDRW);
	}
	
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[2]/h2[1]/a[1]")
	WebElement BuildyourOwnExpensiveComputer;
	
	public void clickonBuildyourOwnExpensiveComputer(){
		clickAction(BuildyourOwnExpensiveComputer);
	}
	
	@FindBy(xpath="//a[contains(text(),'Elite Desktop PC')]")
	WebElement EliteDesktopPC;
	
	public void clickonEliteDesktopPC(){
		clickAction(EliteDesktopPC);
	}
}
