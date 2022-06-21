package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.ElectronicsPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TestScript7  extends Base_Test {

	@Test(dataProvider = "testdata")
	public void testScript7(String email, String password) throws IOException {
		
		  WelcomePage Wp=new WelcomePage(driver); 
		  Wp.clickLogin();
		  LoginPage lp=new LoginPage(driver); 
		  lp.enterValueInEmail(email); 
		  lp.enterValueInPwd(password);
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		  lp.clickLoginButton();
		  test.log(LogStatus.INFO, "User is logged in");
		  
		  
		  ElectronicsPage EP = new ElectronicsPage( driver);
		  EP.clickElectronicsMenuTab();
		  EP.clickcameratab();
		  EP.clickProduct();
		  EP.clickAddToCampare();
		  
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet3");
		return testdata;
	}

}
