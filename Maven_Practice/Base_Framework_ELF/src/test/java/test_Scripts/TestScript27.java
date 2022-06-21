package test_Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_scripts.JewelryPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TestScript27 extends Base_Test{

	@Test
	public void testScript3() {
		JewelryPage jp=new JewelryPage(driver);
		jp.clickonjewelLink();
		jp.ClickOnCreateYourOwnJewelry();
		jp.ClickOnEmailFriendButton();
		jp.entervaluein_EmailFriendTF("game18061999@gmail.com");
		jp.ClickOnEmailFriendButtonin();

	}
}

