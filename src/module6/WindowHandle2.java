package module6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		
		
		//part 2
		//Generate a new window
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		//collect all the list of window handles in one container
		Set<String> awn = driver.getWindowHandles();
		
		
		//part 3
		// using the array concept the two windows will get the identity as window 1 and 2 respectively
		String Window1 = (String) awn.toArray()[0];
		String Window2 = (String) awn.toArray()[1];
		
		
		//part 4
		//Switch between the windows using the defined user window names
		driver.switchTo().window(Window2);
		driver.findElement(By.name("q")).sendKeys("cars");
		driver.findElement(By.name("q")).submit();
		
		Thread.sleep(4000);
		driver.switchTo().window(Window1);
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
