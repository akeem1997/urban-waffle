package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardmousegesture {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement e = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(e).keyDown(e, Keys.SHIFT).sendKeys("jackets").keyUp(e, Keys.SHIFT).build().perform();
		

	}

}
