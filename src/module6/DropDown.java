package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		//WebElement e = driver.findElement(By.xpath("//select[@name=\\\"continents\\\"]"));//
		Select s = new Select(driver.findElement(By.xpath("//select[@name=\"continents\"]")));
		
		//select Africa using index position
		s.selectByIndex(2);
		
		
		
		//Select south America by visible text
		s.selectByValue("South America");
		
		
		
		// Select Antarctica by value
		s.selectByValue("g");
	}

}
