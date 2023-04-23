package module6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		//part 1 
		// To capture the Main window name and print the same
		String mw = driver.getWindowHandle();
		System.out.println("Main window name is :- " + mw);
		System.out.println("=====================================");
		
		//part 2
		//Generate a new window
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		//collect all the list of window handles in one container
		Set<String> awn = driver.getWindowHandles();
		System.out.println("All window name is :- " + awn);
		System.out.println("=======================================");
		
		//part 3
		// using the array concept the two windows will get the identity as window 1 and 2 respectively
		String Window1 = (String) awn.toArray()[0];
		System.out.println("Window 1 name is :-" + Window1);
		System.out.println("=================================");
		
		String Window2 = (String) awn.toArray()[1];
		System.out.println("Window 2 name is :-" + Window2);
		System.out.println("========================");
		
		//part 4
		//Switch between the windows using the defined user window names
		driver.switchTo().window(Window2);
		driver.findElement(By.name("q")).sendKeys("cars");
		driver.findElement(By.name("q")).submit();
		
		Thread.sleep(4000);
		driver.switchTo().window(Window1);
		Thread.sleep(4000);
		driver.switchTo().window(Window2);
		Thread.sleep(4000);
		driver.switchTo().window(Window1);
		Thread.sleep(4000);
		driver.switchTo().window(Window2);
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
