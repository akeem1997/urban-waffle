package login;

import java.awt.Button;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class github {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\mozilla\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://github.com/");
		driver.findElement(By.xpath("//h1[contains(text(), \"Let\")]//preceding::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(), \"Welcome\")]//following::input[2]")).sendKeys("akeemolalere97@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e = driver.findElement(By.xpath("//span[contains(text(), \"Welcome\")]//following::button[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(e));
		driver.findElement(By.name("user[password]")).sendKeys("Akeem12345");
		
		
		
		
		
		
		
		
		
		
	    

	}

}
