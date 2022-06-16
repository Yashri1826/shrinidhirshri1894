package MVN_Practice;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMrepo.HomePage;
import POMrepo.LoginPage;
import POMrepo.WelcomePage;

public class TestingLoginPage extends MVN_Practice.BaseTest {
	
	@Test(dataProvider="readData")
	public void  TC_01(String Email, String Password) throws IOException {
		driver.get(ReadPropertyFile.filereader("URL"));
		WelcomePage welcome = new WelcomePage(driver);
		welcome.clickLogin();
		LoginPage login = new LoginPage(driver);
		login.getEmailTF().sendKeys(Email);
		login.getPasswordTF().sendKeys(Password);
		login.loginClick();
		
		  HomePage home =new HomePage(driver);
		  
			  if(home.getLogout().isDisplayed())
		  { 
				  Reporter.log("pass:user is logged in", true);
				  
		  }
		  
		   /*catch (NoSuchElementException e) {
		  Reporter.log("Fail : user is not logged in ", true); }
		  
		  finally { 
			  home.getLogout().click(); }
		 
		*/
}
	@DataProvider(name="readData")
	public Object[][] data() throws IOException{
		return WorkingWithMultipleRead.readData("Login");
	}
	
}

