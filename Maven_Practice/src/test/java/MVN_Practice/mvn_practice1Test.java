package MVN_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mvn_practice1Test {
	

	/*public class DropdowntwithoutSelectxlass {*/
@Test
		public void DropdowmTest(){
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demowebshop.tricentis.com/");
			//driver.findElement(By.className("ico-login")).click();
			/*
			 * driver.findElement(By.id("Email")).sendKeys("shrinidhi@gmail.com");
			 * driver.findElement(By.id("Password")).sendKeys("shri1894");
			 */
			//driver.findElement(By.xpath("//input[@value='Log in']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
			WebElement ele=driver.findElement(By.id("products-orderby"));   
			ele.sendKeys(Keys.CONTROL.ARROW_DOWN);
			
			

		}

	}



