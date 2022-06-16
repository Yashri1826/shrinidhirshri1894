package MVN_Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Maven_resgister {
	@Test(dataProvider = "Register")
	public static void TestCase(String FirstName, String LastName, String Email, String Password, String ConfirmPasswords) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(FirstName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(LastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(ConfirmPasswords);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		if(driver.findElement(By.xpath("//h1[contains(text(),'Register')]")).isDisplayed()) {
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			System.out.println("User successfully Registered");
		}else {
			System.out.println("Fail:User already registered");
		}
		
		driver.close();

		
		
	}
		@DataProvider(name="Register",parallel=true)
		public static Object[][] Register() throws EncryptedDocumentException, IOException{
		return Maven_datadriven.readData("Register");
		     
		}  

}
