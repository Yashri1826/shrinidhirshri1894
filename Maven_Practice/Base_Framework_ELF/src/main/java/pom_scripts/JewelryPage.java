package pom_scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends BasePage {
	
	public JewelryPage(WebDriver driver) {		
		super(driver);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	WebElement jewelrytab;
	public void clickonjewelLink() {
		clickAction(jewelrytab);
	}
	
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/h2[1]/a[1]")
	////body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/h2[1]/a[1]
	//(//a[contains(text(),'Black & White Diamond Heart')])[1]
	WebElement DiamondHeart_product_link;
	public void clickDiaproduct() {
		clickAction(DiamondHeart_product_link);
	}
	
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement QuantityTF;
	public void entervaluein_qty_TF(String value) {
		QuantityTF.clear();
		enter_value(QuantityTF, value);
	}
	
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[2]")
	WebElement Add_to_cart_button;
	public void clickonAddtocartButton() {
		clickAction(Add_to_cart_button);
	}
	
	@FindBy(xpath="(//span[@class='cart-label'])[1]")
	WebElement ShoppingCartLink;
	public void clickonShoppingCartLink() {
		clickAction(ShoppingCartLink);
	}
	
	@FindBy(xpath="//input[@id='add-to-wishlist-button-14']")
	WebElement WishListButton;
	public void AddtoWishListButton() {
		clickAction(WishListButton);
	}
	
	@FindBy(xpath="//a[contains(text(),'Wishlist')]")
	WebElement WishListLink;
	public void AddtoWishListLink() {
		clickAction(WishListLink);
	}
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement AddToCartCheckBox;
	public void ClickOnAddToCartCheckBox() {
		clickAction(AddToCartCheckBox);
	}
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	WebElement InWishListAddtocartButton;
	public void ClickOncartButton_InWishList() {
		clickAction(InWishListAddtocartButton);
	}
	
	@FindBy(xpath="//a[contains(text(),'Create Your Own Jewelry')]")
	WebElement CreateYourOwnJewelry;
	public void ClickOnCreateYourOwnJewelry() {
		clickAction(CreateYourOwnJewelry);
	}
	
	@FindBy(xpath="//input[@value='Email a friend']")
	WebElement EmailFriendButton;
	public void ClickOnEmailFriendButton() {
		clickAction(EmailFriendButton);
	}
	////input[@class='friend-email']
	@FindBy(xpath="//input[@class='friend-email']")
	WebElement EmailFriendTF;
	public void entervaluein_EmailFriendTF(String value) {
		enter_value(EmailFriendTF, value);
	}
	@FindBy(xpath="//input[@name='send-email']")
	WebElement EmailFriendButtonin;
	public void ClickOnEmailFriendButtonin() {
		clickAction(EmailFriendButtonin);
	}
}
