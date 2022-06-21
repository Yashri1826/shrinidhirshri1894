package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.JavaScriptUtil;

public class ApparelNShoesPage extends BasePage {

	public ApparelNShoesPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[contains(.,'Rockabilly')]")
	WebElement RockabillyDotTop;
	
	public void clickRockabillyTop(){
		clickAction(RockabillyDotTop);
	}
	
	@FindBy(xpath="//a[contains(.,'Blue and green')]")
	WebElement BlueGreenSneaker;
	
	public void clickBluegreenSneakers(){
		clickAction(BlueGreenSneaker);
	}
	
	@FindBy(xpath="//a[contains(.,'Blue Jeans')]")
	WebElement BlueJeans;
	
	public void clickBlueJeans(){
		clickAction(BlueJeans);
	}
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	WebElement AddtoCartBtn;
	public void clickAddtocart(WebDriver driver){
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsScrollIntoView(true, AddtoCartBtn);
		clickAction(AddtoCartBtn);
	}
	@FindBy(xpath="//div[contains(text(),'Jeans')]/..//input")
	WebElement addtocartJeansbtn;
	
	public void clickaddtocartJeans(){
		clickAction(addtocartJeansbtn);
	}
	
	@FindBy(xpath="//a[contains(text(),'Casual Golf Belt')] /../..//input")
	WebElement addtocartGolgBeltbtn;
	
	public void clickaddtocartGolfBelt(){
		clickAction(addtocartGolgBeltbtn);
	}
	
	@FindBy(xpath="//span[@class='close']")
	WebElement close;
	
	public void clickClose(){
		clickAction(close);
	}
	
	@FindBy(xpath="(//a[contains(.,'Apparel & Shoes')])[1]")
	WebElement ApparelAndShoesLink;
	
	public void clickonApparelAndShoesLink(){
		clickAction(ApparelAndShoesLink);
	}
	
}
