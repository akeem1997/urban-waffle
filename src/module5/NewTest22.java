package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest22 {
	
	public WebDriver driver;

	@Test(priority = 1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test(priority = 2)
	public void openURL() {
		driver.get("https://www.facebook.com/reg/");
	}
	
	@Parameters({"FirstNameValue", "LastNameValue"})
	@Test(priority = 3)
	public void registerSignup(String fName, String lName) {
		driver.findElement(By.name("firstname")).sendKeys(fName);
		driver.findElement(By.name("lastname")).sendKeys(lName);
		driver.findElement(By.name("reg_email__")).sendKeys("akeemolalere91@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("akeemolalere91@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Atinuke1234");
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::option[16]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::option[33]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::option[69]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::input[4]")).click();
	}
	@Test(priority = 4)
	public void signup() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(), 'Date of birth')]//following::button[1]")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 5)
	public void closeSignup() {
		driver.close();
		
	}

}
