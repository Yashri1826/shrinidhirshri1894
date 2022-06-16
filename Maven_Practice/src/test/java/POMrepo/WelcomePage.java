package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="ico-register")
	WebElement registerLink;
	
	public void registerClick(){
		registerLink.click();
	}
	
	@FindBy(className="ico-login")
	private WebElement loginLink;
	
	public void clickLogin(){
		loginLink.click();
	}
	
	 @FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	 private WebElement booksTab;
	 
	 public void booksTabClick(){
		 booksTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	 private WebElement computerTab;
	 
	 public void computerTabClick(){
		 computerTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	 private WebElement electronicsTab;
	 
	 public void electroTabClick(){
		 electronicsTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
	 private WebElement apparelshoesTab;
	 
	 public void apparelshoesTabClick(){
		 apparelshoesTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	 private WebElement digidownTab;
	 
	 public void digidownTabClick(){
		 digidownTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	 private WebElement jewelryTab;
	 
	 public void jewelryTabClick(){
		 jewelryTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	 WebElement giftcardsTab;
	 
	 public void giftcardsTabClick(){
		 giftcardsTab.click();
	 }

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getBooksTab() {
		return booksTab;
	}

	public WebElement getComputerTab() {
		return computerTab;
	}

	public WebElement getElectronicsTab() {
		return electronicsTab;
	}

	public WebElement getApparelshoesTab() {
		return apparelshoesTab;
	}

	public WebElement getDigidownTab() {
		return digidownTab;
	}

	public WebElement getJewelryTab() {
		return jewelryTab;
	}

	public WebElement getGiftcardsTab() {
		return giftcardsTab;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	public void setBooksTab(WebElement booksTab) {
		this.booksTab = booksTab;
	}

	public void setComputerTab(WebElement computerTab) {
		this.computerTab = computerTab;
	}

	public void setElectronicsTab(WebElement electronicsTab) {
		this.electronicsTab = electronicsTab;
	}

	public void setApparelshoesTab(WebElement apparelshoesTab) {
		this.apparelshoesTab = apparelshoesTab;
	}

	public void setDigidownTab(WebElement digidownTab) {
		this.digidownTab = digidownTab;
	}

	public void setJewelryTab(WebElement jewelryTab) {
		this.jewelryTab = jewelryTab;
	}

	public void setGiftcardsTab(WebElement giftcardsTab) {
		this.giftcardsTab = giftcardsTab;
	}
}
