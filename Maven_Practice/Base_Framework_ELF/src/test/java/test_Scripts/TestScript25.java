package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.GiftCardPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TestScript25 extends Base_Test{
	@Test(dataProvider = "testdata")
	public void testScrips24(String email,String pwd) throws InterruptedException{
		WelcomePage Wp=new WelcomePage(driver);
		Wp.clickLogin();
		LoginPage log=new LoginPage(driver);
		log.enterValueInEmail(email);
		log.enterValueInPwd(pwd);
		log.clickLoginButton();
		GiftCardPage gp=new GiftCardPage(driver);
		gp.ClickOnGiftCardTab();
		gp.ClickOnGiftCardProduct();
		gp.enterValueReceipName("Arun M");
		gp.enterValueReceipEmail("arungowda760@gmail.com");
		gp.enterQtyValue("10");
		gp.ClickOnGiftCardAddcart();
		Thread.sleep(1000);
		Wp.clickonshoppingcartlink();
		gp.ClickOnCheckBox();
		gp.ClickonEstimateCard();
		gp.ClickOnCheckButton();
		//test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		test.log(LogStatus.INFO, "product successfully added");
	}

	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet7");
		return testdata;
	}
}
