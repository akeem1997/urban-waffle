package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class github4 {

	public WebDriver driver;
		
		
	@Test(priority = 1)
	public void openBrowser() {
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\edge driver\\msedgedriver.exe");
	    driver = new EdgeDriver();
		
		    
	}
	@Test(priority = 2)
	public void openURL() {
		driver.get("https://github.com/");
	}
	
	@SuppressWarnings("deprecation")
	@Test(priority = 3)
	public void registerSignup() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("akeemolalere97@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(), \"Welcome\")]//following::button[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"user[password]\"]")).sendKeys("Fineboy1997");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(), \"Welcome\")]//following::button[4]")).click();
		driver.findElement(By.xpath("//input[@name=\"user[login]\"]")).sendKeys("Akeem1997");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(), \"Welcome\")]//following::button[5]")).click();
		driver.findElement(By.xpath("//input[@name=\"opt_in\"]")).sendKeys("y");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(), \"Welcome\")]//following::button[6]")).click();
	}
	
	@Test(priority = 4)
	public void closeRegistration() {
		driver.quit();
	}
		
	

		
	
	
		
	
		
	}


