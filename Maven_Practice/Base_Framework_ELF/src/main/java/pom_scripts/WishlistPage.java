package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage   {

	public WishlistPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//span[text()='Wishlist']")
	WebElement WishlistLInk;
	

	public void clickWishlistLInk() {
		clickAction(WishlistLInk);
	}
	@FindBy(xpath = "//span[@class='close']")
	WebElement close;
	

	public void clickclose() {
		clickAction(close);
	}
	@FindBy(xpath = "//div[@class='page-title']//h1")
	WebElement WishlistText;
	

	public boolean isDisPalyedWishlistText() {
		WishlistText.isDisplayed();
		return true;
	}
	
	@FindBy(xpath = "//input[@name='addtocart']")
	WebElement AddtoCartCheBox;
	

	public void clickAddtoCartCheBox() {
		clickAction(AddtoCartCheBox);
	}

	@FindBy(xpath = "//input[@value='Update wishlist']")
	WebElement UpdateWishlistBtton;
	

	public void clickUpdateWishlistBtton() {
		clickAction(UpdateWishlistBtton);
	}

	

}
