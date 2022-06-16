package MVN_Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Maven_loginTest {
	@Test(dataProvider = "Login")
	public static void TestCase(String Email, String Password) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
			System.out.println("Pass;User is logged in");
		}else {
			System.out.println("Pass;User is not logged in");
		}
		
		driver.close();

		
		
	}
		@DataProvider(name="Login",parallel=true)
		public static Object[][] login() throws EncryptedDocumentException, IOException{
		return Maven_datadriven.readData("Login");
		     
		}

}
