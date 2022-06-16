package MVN_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class launchemptybrowserTest {
	
		WebDriver driver;
		@BeforeClass
		public void openbrowser() {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
			 driver =new ChromeDriver();
			
		}
		@AfterClass
		public void closebrowser() {
			driver.close();
		}
}
