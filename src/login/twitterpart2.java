package login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class twitterpart2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/signup");
		
		WebElement e = driver.findElement(By.xpath("//span[contains(text(), \\\\'Next\\\\')]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(e));

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(text(), \"By\")]//preceding::span[2]")).click();
		driver.findElement(By.name("name")).sendKeys("Adeleke");
		driver.findElement(By.xpath("//span[contains(text(), \"Date\")]//preceding::span[1]")).click();
		driver.findElement(By.name("email")).sendKeys("lekeshapanshi@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(), \"Date\")]//following::select[1]/option[11]")).click();
		driver.findElement(By.xpath("//span[contains(text(), \"Date\")]//following::select[2]/option[20]")).click();
		driver.findElement(By.xpath("//span[contains(text(), \\\"Date\\\")]//following::select[3]/option[27]")).click();
		
		
		
		

	}

}
