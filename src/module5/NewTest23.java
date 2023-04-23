 package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest23 {
	
	public static WebDriver driver;
	
    @Parameters("broswerNameValue")
	@Test(priority = 1)
	public void openBrowser(String browserrName) {
		if(browserrName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if(browserrName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\mozilla\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		else if(browserrName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\edge driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		else {
			System.out.println("invalid broswer name input passed");
		}
	}
	
	@Test(priority = 2)
	public void openURL() {
		driver.get("https://www.facebook.com/reg/");
	}
	
	@Parameters({"firstNameValue","lastNameValue"})
	@Test(priority = 3)
	public void registerSignup(String fname, String lname) throws Exception {
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys("olalerewisdom@yahoo.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("olalerewisdom@yahoo.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Atinuke1234");
		Thread.sleep(5000);
	}	
	@Test(priority = 4)
	public void contregis() {
		Select s = new Select(driver.findElement(By.name("birthday_month")));
		s.selectByVisibleText("Dec");
		Select m = new Select(driver.findElement(By.name("birthday_day")));
		m.selectByValue("25");
		Select y = new Select(driver.findElement(By.name("birthday_year")));
		y.selectByValue("1997");
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		
		
		driver.findElement(By.name("websubmit")).click();
	}
	
	
	@Test(priority = 6)
	public void closeSignup() {
		driver.close();
		
	}

}
