package POMrepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver){
		driver.manage().timeouts();
		PageFactory.initElements(driver, this);
	}
	@FindBy(className  = "ico-logout")
	private WebElement logout;
	
	public void logoutClick(){
		logout.click();
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	 }