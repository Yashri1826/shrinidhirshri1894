package POMrepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;

import com.beust.jcommander.Parameters;

public class BaseTest {
	public class BaseTest {
		   
		WebDriver driver;	
		//@Parameters("browser")
		@BeforeClass

		public void openchrome() {
			
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("http://demowebshop.tricentis.com/");
		}
		/*
		 * else if(browser.equalsIgnoreCase("firefox")){
		 * System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		 * driver=new ChromeDriver(); driver.get("http://demowebshop.tricentis.com/"); }
		 */
		}
	 	
		@AfterClass
		public void closechrome(){
			driver.close();
}
