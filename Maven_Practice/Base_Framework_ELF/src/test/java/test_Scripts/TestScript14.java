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
import pom_scripts.WishlistPage;

public class TestScript14  extends Base_Test{
	@Test(dataProvider = "testdata")
	public void testScript1(String email, String password) throws IOException {

		WelcomePage Wp=new WelcomePage(driver); 
		Wp.clickLogin();
		LoginPage lp=new LoginPage(driver); 
		lp.enterValueInEmail(email); 
		lp.enterValueInPwd(password);

		lp.clickLoginButton();
		test.log(LogStatus.INFO, "User is logged in");


		ElectronicsPage EP = new ElectronicsPage( driver);
		EP.clickElectronicsMenuTab();
		EP.clickphonestab();
		EP.clickAddToCart2();
		// test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		EP.clickwishlistButton();

		WishlistPage WP = new WishlistPage(driver);
		WP.clickclose();

		WP.clickWishlistLInk(); 
		if(WP.isDisPalyedWishlistText()) {
			WP.clickAddtoCartCheBox();
			WP.clickUpdateWishlistBtton();

			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
			test.log(LogStatus.INFO, "User is able to upDate The WishList");
			}
	}

	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet3");
		return testdata;
	}



}
