package module6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		WebElement e = driver.findElement(By.xpath("//select[@name=\"selenium_commands\"]"));
		Select s = new Select(e);
		
		//Part1
		//select and then deselect one option
		s.selectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		
		s.deselectByIndex(1);
		
		
		//part2
		//to run all the option in a loop one by one and also print them into the console output to get all the options select all and the option deselect them in one go
		
		
		List<WebElement> oList = s.getOptions();
		int itotal = oList.size(); // count of values stored in this container cal also be skipped
		for(int i=0; i<itotal; i++) {  // itotal can also be 4 depending on the number of options available
			
			//print the values
			String svalues = oList.get(i).getText();
			
			System.out.println(svalues);
			//selecting the option based on the index position given by the for loop
			s.selectByIndex(i);
			
		}
		
		//deselect all the options in one go
		s.deselectAll();
			
		
		

	}

}
