package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.LoginPage;
import pom_scripts.RegisterPage;
import pom_scripts.WelcomePage;

public class TestScript2 extends Base_Test{
	
	@Test(dataProvider = "testdata")
	public void testScript2(String male,String Firstname,String LastName,String Email, String Password,String ConfirmPassword) throws IOException {
		  WelcomePage Wp=new WelcomePage(driver); 
		  Wp.clickRegister();
		  RegisterPage lp=new RegisterPage(driver); 
		  lp.gender(male);
		  lp.FN_value(Firstname); 
		  lp.LastName_value(LastName);
		  lp.Email_value(Email);
		  lp.Password_value(Password);
		  lp.ConfirmPassword_value(ConfirmPassword);
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Register");
		return testdata;
	}
}
