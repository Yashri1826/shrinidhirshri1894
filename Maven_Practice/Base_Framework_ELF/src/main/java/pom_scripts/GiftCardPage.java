package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardPage extends BasePage{

	public GiftCardPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	WebElement clickongiftcardTab;

	public void ClickOnGiftCardTab(){
		clickAction(clickongiftcardTab);
	}

	@FindBy(xpath="//div[@class='details']//a[.='$5 Virtual Gift Card']")
	WebElement clickongiftcardproduct;

	public void ClickOnGiftCardProduct(){
		clickAction(clickongiftcardproduct);
	}
	@FindBy(xpath="//div[@class='details']//a[.='$25 Virtual Gift Card']")
	WebElement clickongiftcardproduct1;

	public void ClickOnGiftCardProduct1(){
		clickAction(clickongiftcardproduct1);
	}
	
	@FindBy(xpath="//div[@class='details']//a[contains(text(),'$50 Physical Gift Card')]")
	WebElement clickongiftcardproduct2;

	public void ClickOnGiftCardProduct2(){
		clickAction(clickongiftcardproduct2);
	}
	
	
	
	@FindBy(xpath=" //input[@id='add-to-cart-button-1']")
	WebElement clickongiftcardAddcart;

	public void ClickOnGiftCardAddcart(){
		clickAction(clickongiftcardAddcart);
	}
	@FindBy(xpath="//input[@id='addtocart_1_EnteredQuantity']")
	WebElement Qty;
	
	public void enterQtyValue(String name){
		enter_value(Qty, name);
	}
	
	@FindBy(xpath="//input[@id='giftcard_1_RecipientName']")
	WebElement Recipt_Name;
	
	public void enterValueReceipName(String name){
		enter_value(Recipt_Name, name);
	}
	@FindBy(xpath="//input[@id='giftcard_1_RecipientEmail']")
	WebElement Recipt_Email;
	
	public void enterValueReceipEmail(String Email){
		enter_value(Recipt_Email, Email);
		
	}
	@FindBy(xpath="//select[@class='country-input valid']")
	 WebElement countrydropdown;
	
	public void CountryDropdown(){
		select_classObject(countrydropdown).selectByValue("India");
	}
	@FindBy(xpath="//select[@class='state-input valid']")
	 WebElement statedropdown;
	
	public void StateDropdown(){
		select_classObject(statedropdown).selectByIndex(0);
		
	}
	@FindBy(xpath="//input[@value='Estimate shipping']")
	WebElement EstimatshoppingCard;

	public void ClickonEstimateCard(){
		clickAction(EstimatshoppingCard);
	}
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	WebElement clickOncheck;

	public void ClickOnCheckBox(){
		clickAction(clickOncheck);
	}
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement clickOncheck1;

	public void ClickOnCheckBox1(){
		clickAction(clickOncheck1);
	}
	@FindBy(xpath="//button[@id='checkout']")
	WebElement clickOnCheckbutton;

	public void ClickOnCheckButton(){
		clickAction(clickOnCheckbutton);
	
}
}
