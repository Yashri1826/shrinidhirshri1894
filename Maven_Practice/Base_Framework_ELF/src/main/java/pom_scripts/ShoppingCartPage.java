package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//select[@id='CountryId']")
	WebElement Countrydropdown;
	
	public void selectIndiadropdown(){	
		select_classObject(Countrydropdown).selectByValue("41");
	}
	
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement termscheckbox;
	
	public void clicktermschkbox(){
		clickAction(termscheckbox);
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkoutbtn;
	
	public void clickcheckoutbtn(){
		clickAction(Checkoutbtn);
	}
	
	@FindBy(xpath="//tr[@class='cart-item-row'][1]//input[@class='qty-input']")
	WebElement productoneQty;

	public void sendvalueProductoneQty(String value){
		productoneQty.clear();
		enter_value(productoneQty, value);
	}
	@FindBy(xpath="//tr[@class='cart-item-row'][2]//input[@class='qty-input']")
	WebElement productTwoQty;
	
	public void sendvalueProductTwoQty(String value){
		productTwoQty.clear();
		enter_value(productTwoQty, value);
	}
	
	@FindBy(xpath="//input[@name='updatecart']")
	WebElement UpdatecartBtn;
	
	public void clickUpdateshopBtn(){
		clickAction(UpdatecartBtn);
	}
	
}
