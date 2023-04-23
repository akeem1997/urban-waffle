package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumscript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.name("firstname")).sendKeys("korede");
		driver.findElement(By.name("lastname")).sendKeys("olalere");
		driver.findElement(By.name("reg_email__")).sendKeys("akeemolalere91@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("akeemolalere91@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Atinuke1234");
		WebElement e = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select s = new Select(e);
		s.selectByIndex(1);
		WebElement d = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select g = new Select(d);
		g.selectByVisibleText("Jun");
		WebElement y = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select r = new Select(y);
		r.selectByIndex(12);
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click(); //female
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		//driver.findElement(By.xpath("//input[@value=\"-1\"]")); custom
		//driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		
		
		//driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(5000);
		
		
	
		
		
		
	

	}

}
