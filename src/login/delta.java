package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class delta {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.delta.com/");
		WebElement e = driver.findElement(By.xpath("//button[@class=\"btn-danger gdpr-banner-btn gdpr-banner-accept-btn\"]"));
		e.click();
		driver.findElement(By.xpath("//a[@id=\"headPrimary1\"]")).click();
		driver.findElement(By.xpath("//img[@class=\"siteLogo\"]//following::span[7]")).click();
		driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]")).sendKeys("Lagos");
		driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[@class=\"airport-city col-sm-10 col-md-11 col-lg-10 col-xl-10 col-xxl-10 pl-0\"]")).click();
		driver.findElement(By.xpath("//img[@class=\"siteLogo\"]//following::span[10]")).click();
		driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]")).sendKeys("Minnesota");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@class=\"search-results d-none pl-1 d-block\"]//following::li[3]")).click();
		driver.findElement(By.xpath("//img[@class=\"siteLogo\"]//following::span[15]")).click();
		driver.findElement(By.xpath("//img[@class=\"siteLogo\"]//following::li[9]")).click();
		driver.findElement(By.xpath("//span[@class=\"calenderDepartSpan\"]")).click();
		driver.findElement(By.xpath("//a[@aria-label=\"15 February 2023, Wednesday\"]")).click();
		driver.findElement(By.xpath("//a[@aria-label=\"28 February 2023, Tuesday\"]")).click();
		driver.findElement(By.xpath("//button[@aria-label=\"done\"]")).click();
	}

}
