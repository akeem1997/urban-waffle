package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.name("firstname")).sendKeys("korede");
		driver.findElement(By.name("lastname")).sendKeys("olalere");
		driver.findElement(By.name("reg_email__")).sendKeys("akeemolalere91@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("akeemolalere91@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Atinuke1234");
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::option[16]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::option[33]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::option[69]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::input[4]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::button[1]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	
		
		
		
	

	}

}
