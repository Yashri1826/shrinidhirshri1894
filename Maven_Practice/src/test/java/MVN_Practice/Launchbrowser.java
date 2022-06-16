package MVN_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launchbrowser {
	@Test
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}
	@Test
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
	}
}
