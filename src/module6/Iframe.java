package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		driver.switchTo().frame("ID_Frame1");
		driver.findElement(By.name("ts_first_name")).sendKeys("Akeem");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id=\"id_form\" and @name=\"name\"]")).sendKeys("korede");
		
		//only ID and Name are the only attributes allowed in Iframe//
		

	}

}
