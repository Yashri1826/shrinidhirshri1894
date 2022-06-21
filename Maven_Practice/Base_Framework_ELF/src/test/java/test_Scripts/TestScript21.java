package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.ApparelNShoesPage;
import pom_scripts.LoginPage;
import pom_scripts.ShoppingCartPage;
import pom_scripts.WelcomePage;

public class TestScript21 extends Base_Test{
	@Test(dataProvider = "TestData")
	public void tc_21(String email, String pwd) throws IOException {
		WelcomePage wp=new WelcomePage(driver);
		wp.clickLogin();
		LoginPage lp=new LoginPage(driver); 
		lp.enterValueInEmail(email); 
		lp.enterValueInPwd(pwd);
		lp.clickLoginButton();
		//wel.clickApparelnShoesLink();
		ApparelNShoesPage apparel=new ApparelNShoesPage(driver);
		apparel.clickonApparelAndShoesLink();
		apparel.clickBlueJeans();
		apparel.clickAddtocart(driver);
		wp.clickonshoppingcartlink();
		ShoppingCartPage shop=new ShoppingCartPage(driver);
		shop.selectIndiadropdown();
		shop.clicktermschkbox();
		shop.clickcheckoutbtn();
		//test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		test.log(LogStatus.INFO, "User Checkout successfully");
	}

	@DataProvider(name = "TestData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet7");
		return testdata;
	}


}
