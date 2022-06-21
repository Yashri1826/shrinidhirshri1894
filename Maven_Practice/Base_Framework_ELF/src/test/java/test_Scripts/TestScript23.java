package test_Scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.ApparelNShoesPage;
import pom_scripts.ShoppingCartPage;
import pom_scripts.WelcomePage;

public class TestScript23 extends Base_Test{
	@Test
	public void tc_23(){
		WelcomePage wel=new WelcomePage(driver);
		//wel.clickApparelnShoesLink();
		
		
		
		
		ApparelNShoesPage apparel=new ApparelNShoesPage(driver);
		apparel.clickonApparelAndShoesLink();
		apparel.clickaddtocartGolfBelt();
		apparel.clickClose();
		wel.clickonshoppingcartlink();
		ShoppingCartPage shop=new ShoppingCartPage(driver);
		shop.sendvalueProductoneQty("2");
		shop.clickUpdateshopBtn();
		shop.clicktermschkbox();
		shop.clickcheckoutbtn();
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		test.log(LogStatus.INFO, "User Checkout successfully");
	}

}
