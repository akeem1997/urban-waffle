package module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationalert {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
	driver.findElement(By.id("confirm")).click();
	Alert ca = driver.switchTo().alert();
	System.out.println(ca.getText()); 
	ca.dismiss();


	}

}
