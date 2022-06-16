package MVN_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddtoWishlist extends BaseTest {
	@Test
	public void TC() throws InterruptedException {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demowebshop.tricentis.com/");
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shrinidhi@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("shri1894");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[1]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create Your Own Jewelry')]")).click();
			driver.findElement(By.xpath("//select[@id='product_attribute_71_9_15']")).click();
			driver.findElement(By.xpath("//input[@class='textbox']")).sendKeys("5");
			driver.findElement(By.xpath("//label[contains(text(),'Heart ')]")).click();
		
			driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
			driver.findElement(By.className("//span[contains(text(),'Wishlist')]")).click();
			
			
			// driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[@id='checkout']")).click();
			driver.findElement(By.className("ico-logout")).click();
			 
		}

}
