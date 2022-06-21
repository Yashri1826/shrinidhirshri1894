package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BooksPage extends BasePage {
	
	public BooksPage(WebDriver driver) {		
		super(driver);
	}
	
	@FindBy(xpath="//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement BooksTab;
	public void clickonBooksTab() {
		clickAction(BooksTab);
	}
	
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement SortBy;
	public void SortByDropDown(){		
		select_classObject(SortBy).selectByIndex(5);	
	}
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement DisplayPerPage;
	public void DisplayPerPageDropdown(){		
		select_classObject(DisplayPerPage).selectByIndex(2);	
	}
	
	@FindBy(xpath="//select[@id='products-viewmode']")
	WebElement ViewAs;
	public void ViewAsDropdown(){		
		select_classObject(ViewAs).selectByIndex(0);	
	}
	
	@FindBy(xpath="//ul[@class='price-range-selector']/li[2]/a")
	WebElement FilterByPriceMenu;
	public void clickonFilterByPriceMenu() {
		clickAction(FilterByPriceMenu);
	}
	
	@FindBy(xpath="//a[@class='remove-price-range-filter']")
	WebElement RemoveFilter;
	public void clickonRemoveFilter() {
		clickAction(RemoveFilter);
	}
	//(//input[@value='Add to cart'])[2]
	@FindBy(xpath="(//input[@value='Add to cart'])[2]")
	WebElement AddToCartButton;
	public void clickonAddToCartButton() {
		clickAction(AddToCartButton);
	}
	
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[2]/h2[1]/a[1]")
	WebElement FictionLink;
	public void clickonFictionLink() {
		clickAction(FictionLink);
	}

	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[9]/div[1]/a[1]/span[1]/*[1]")
	WebElement facebooklink;
	public void clickonfacebooklink() {
		clickAction(facebooklink);
	}
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement shoppingcartlink;
	public void clickonshoppingcartlink() {
		clickAction(shoppingcartlink);
	}
	
	@FindBy(xpath="//a[text()='Fiction EX']")
	WebElement FictionexProduct;
	public void clickonFictionexProductlink() {
		clickAction(FictionexProduct);
	}
	
	@FindBy(xpath="//input[@value='Add to compare list']")
	WebElement AddToCompareList;
	public void clickonAddToCompareListButton() {
		clickAction(AddToCompareList);
	}
	
	@FindBy(xpath="//a[@title='Twitter']")
	WebElement TwitterIcon;
	public void clickonTwitterIcon() {
		clickAction(TwitterIcon);
	}
	////a[@title='Twitter']
}
