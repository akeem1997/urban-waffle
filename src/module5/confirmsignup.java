package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class confirmsignup {
	public static WebDriver driver;
	
	@Test(priority = 1)
	public void OpenBrowser() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test(priority = 2)
	public void OpenUrl() {
		driver.get("https://www.facebook.com/reg/");
	}
	
	@Test(priority = 3)
	public void SignUpFill() {
		driver.findElement(By.name("firstname")).sendKeys("Akeem");
		driver.findElement(By.name("lastname")).sendKeys("olalere");
		driver.findElement(By.name("reg_email__")).sendKeys("akeem@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("akeem@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("papamama");
		Select s = new Select(driver.findElement(By.name("birthday_month")));
		s.selectByVisibleText("Dec");
		Select m = new Select(driver.findElement(By.name("birthday_day")));
		m.selectByValue("25");
		Select y = new Select(driver.findElement(By.name("birthday_year")));
		y.selectByValue("1997");
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		
		
	}
	
	@Test(priority = 4)
	public void close() {
		driver.quit();
	}


}
