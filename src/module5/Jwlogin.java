package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jwlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jw.org/en/");
		driver.findElement(By.xpath("//button[contains(text(), 'Accept')]")).click();
		driver.findElement(By.xpath("//h2[contains(text(), \"Jehovah\")]//following::span[12]")).click();
		//driver.findElement(By.xpath("//h2[contains(text(), \"Jehovah\")]//following::span[22]")).click();
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(), \"J\")]//following::span[14]"));
		element.click();
		driver.findElement(By.xpath("//h1[@data-pid=\"1\"]//following::a[13]")).click();
		driver.quit();
		
		
		
		
	}

}
