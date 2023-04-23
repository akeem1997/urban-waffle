package module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptalert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(5000);
		Alert pa = driver.switchTo().alert();
		String actualText = pa.getText();
		String expectedText = "Please enter your name";
		boolean result = actualText.equals(expectedText);
		System.out.println(result);
		pa.sendKeys("Akeem Olalere");
		pa.accept();
		

	}

}
