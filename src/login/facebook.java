package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		
		//log in button color validation
		//String colour = "#1877f2";
		WebElement e = driver.findElement(By.name("login"));
		String backcolor = e.getCssValue("background-color");
		System.out.println(backcolor);
		String hexBackColor = Color.fromString(backcolor).asHex();
		System.out.println(hexBackColor);
		
		
		
		

	}

}
