package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jwlogin2 {
	
	public WebDriver driver;
	
	@Test(priority = 1)
	public void openBroswer() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	}
	
	@Test(priority = 2)
	public void openURL() {
		driver.get("https://www.jw.org/en/");
	}
	
	@Test(priority = 3)
	public void engageURL() {
		driver.findElement(By.xpath("//button[contains(text(), 'Accept')]")).click();
		driver.findElement(By.xpath("//h2[contains(text(), \"Jehovah\")]//following::span[12]")).click();
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(), \"J\")]//following::span[14]"));
		element.click();
		driver.findElement(By.xpath("//h1[@data-pid=\"1\"]//following::a[13]")).click();
	}
	
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}

	
		
		
		
	}


