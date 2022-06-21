package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage{

	public ElectronicsPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = "//ul[@class='top-menu']  //a[contains(text(),'Electronics')]")
	WebElement Electronics;
	

	public void clickElectronicsMenuTab() {
		clickAction(Electronics);
	}
	@FindBy(xpath = "//input[@value='Add to wishlist']")
	WebElement wishlist;
	

	public void clickwishlistButton() {
		clickAction(wishlist);
	}
	
	@FindBy(xpath = "//div[@class='sub-category-item']  //a[contains(text(),'Camera, photo')]")
	WebElement camera;
	

	public void clickcameratab() {
		clickAction(camera);
	}
	
	@FindBy(xpath = " //h2[@class='title']//a[contains(text(),'Cell phones')]")
	WebElement phones;
	

	public void clickphonestab() {
		clickAction(phones);
	}

	@FindBy(xpath = "//input[@value='Add to compare list']")
	WebElement AddToCampare;
	

	public void clickAddToCampare() {
		clickAction(AddToCampare);
	}

	@FindBy(xpath = "//span[@title='Close']")
	WebElement Close;
	

	public void clickClose() {
		clickAction(Close);
	}
	
	@FindBy(xpath = "( //div[@class='buttons']//input[contains(@value,'Add to cart')])[1]")
	WebElement AddToCart;
	

	public void clickAddToCart2() {
		clickAction(AddToCart2);
	}
	@FindBy(xpath = "( //div[@class='buttons']//input[contains(@value,'Add to cart')])[2]")
	WebElement AddToCart2;
	

	public void clickAddToCart() {
		clickAction(AddToCart);
	}
	
	@FindBy(xpath = "//a[text()='1MP 60GB Hard Drive Handycam Camcorder']")
	WebElement Camara;
	

	public boolean CamaraisDisplayed() {
		Camara.isDisplayed();
		return true;
	}

		
	@FindBy(xpath = "//input[@value='Email a friend']")
	WebElement EmailFriend;
	

	public void clickEmailFriend() {
		clickAction(EmailFriend);
	}

	@FindBy(xpath = "//a[text()='1MP 60GB Hard Drive Handycam Camcorder']")
	WebElement Product;
	

	public void clickProduct() {
		clickAction(Product);
	}
}
