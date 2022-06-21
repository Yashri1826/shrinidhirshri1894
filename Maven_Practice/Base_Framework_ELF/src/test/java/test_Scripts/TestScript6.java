package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.BooksPage;
import pom_scripts.JewelryPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TestScript6 extends Base_Test{
	
	@Test(dataProvider = "Testdata")
	public void testScript6(String email, String pwd) throws IOException, InterruptedException {
		
		  WelcomePage Wp=new WelcomePage(driver); //pending Testsript
		  Wp.clickLogin();
		  LoginPage lp=new LoginPage(driver); 
		  lp.enterValueInEmail(email); 
		  lp.enterValueInPwd(pwd);
		  lp.clickLoginButton();
		  
		  BooksPage bp=new BooksPage(driver);
		  bp.clickonBooksTab();
		  bp.SortByDropDown();
		  bp.DisplayPerPageDropdown();
		  bp.ViewAsDropdown();
		  bp.clickonFilterByPriceMenu();
		  bp.clickonRemoveFilter();
		  bp.clickonFictionexProductlink();
		  bp.clickonAddToCompareListButton();
		  Thread.sleep(5000);
		  bp.clickonTwitterIcon();
	}
	
	@DataProvider(name = "Testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet8");
		return testdata;
	}

}
