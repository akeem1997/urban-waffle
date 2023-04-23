package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.xpath("//input[contains(@id, 'username')]")).sendKeys("akeem");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("olalere");
		driver.findElement(By.xpath("//span[contains(@role, \"button\")]")).click();
		driver.findElement(By.xpath("//h1[contains(text(), \"Sign\")]//following::button[1]")).click();
		
		
	}

}
