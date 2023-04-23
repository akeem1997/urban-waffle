package module5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class github3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\edge driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://github.com/");
		//driver.findElement(By.xpath("//h1[contains(text(), \"Let\")]//preceding::a[1]")).click();
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
		driver.quit(); 
		//new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Welcome\")]//following::button[1]"))).click();
		//Actions action = new Actions(driver);
		//WebElement element = driver.findElement(By.xpath("//span[contains(text(), \\\"Welcome\\\")]//following::button[1]"));
		//action.moveToElement(element).click(element).click();
		//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Korede070");
		//driver.findElement(By.xpath("//input[@id=\"login\"]")).sendKeys("Akeem1997");
		//driver.findElement(By.xpath("//input[@name=\"opt_in\"]")).sendKeys("n");
		//driver.findElement(By.xpath("//div[contains(text(), \"Welcome\")]//following::button[6]")).submit();
		
		
		
		
		
		
		
		
		
	    

	

	
		
	}

}

