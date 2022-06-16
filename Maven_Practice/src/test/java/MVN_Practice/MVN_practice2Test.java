package MVN_Practice;

import org.testng.annotations.Test;

public class MVN_practice2Test{
	@Test
	public void flipkart() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String PW=driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='realme C20 (Cool Blue, 32 GB)']")).click(); 
		Set<String>NW= driver.getWindowHandles();
		for (String string : NW) {
			
			if(!PW.equals(string)) {
				driver.switchTo().window(string);
		}
	

}
