package login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class twitter {

	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/signup");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(text(), \"By\")]//preceding::span[2]")).click();
		driver.findElement(By.name("name")).sendKeys("Adeleke");
		driver.findElement(By.xpath("//span[contains(text(), \"Date\")]//preceding::span[1]")).click();
		driver.findElement(By.name("email")).sendKeys("akeemolalere98@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(), \"Date\")]//following::select[1]/option[11]")).click();
		driver.findElement(By.xpath("//span[contains(text(), \"Date\")]//following::select[2]/option[20]")).click();
		driver.findElement(By.xpath("//span[contains(text(), \"Date\")]//following::select[3]/option[23]")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[contains(text(), \"Date\\\")]//following::span[5]")).click();
		//Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(), \"Date\")]//following::span[5]"));
		element.click();
		driver.findElement(By.xpath("//span[contains(text(), \"Customize\")]//following::span[21]")).click();
		driver.findElement(By.xpath("//span[contains(text(),\"Create\")]//following::span[27]")).click();
		//driver.quit();
		//action.moveToElement(element).click(element).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//span[contains(text(), \"Next\")]")).submit();
		//WebElement e = driver.findElement(By.xpath("//span[contains(text(), \"Next\")]]"));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		//wait.until(ExpectedConditions.elementToBeClickable(e)).submit();
		//driver.findElement(By.xpath("//span[contains(text(), \"Sign up\")]")).submit();
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
