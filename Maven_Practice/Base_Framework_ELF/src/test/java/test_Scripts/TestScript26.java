package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.ComputerPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TestScript26 extends Base_Test {
	@Test(dataProvider = "TestData")
	public void testscript22(String email, String pwd) throws IOException {
		WelcomePage wp=new WelcomePage(driver);
		wp.clickLogin();
		LoginPage lp=new LoginPage(driver); 
		lp.enterValueInEmail(email); 
		lp.enterValueInPwd(pwd);
		lp.clickLoginButton();
		wp.clickonComputerLink();
		ComputerPage cp=new ComputerPage(driver);
		cp.clickonDesktopLink();
		cp.clickonSimpleComputerLink();
		cp.clickonAddtoCartButton();
	}
	@DataProvider(name = "TestData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet7");
		return testdata;
	}

}
