package module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		driver.findElement(By.id("alert")).click();
		Alert sa = driver.switchTo().alert();
		sa.accept();
	
		
		
		
	}

}
