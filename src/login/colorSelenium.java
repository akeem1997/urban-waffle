package login;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class colorSelenium {

	public static void main(String[] args) throws Exception {
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
		if(hexBackColor.equals("#1877f2")) {
			System.out.println("background color is present");
		}
		else {
			System.out.println("no background color");
		}
		
		driver.findElement(By.xpath("//a[contains(text(), \"For\")]")).click();
		Thread.sleep(5000);
		String emailTextBoxColor = driver.findElement(By.xpath("//input[@class=\"inputtext _9o1w\"]")).getCssValue("color");
		if(emailTextBoxColor.equals("rgba(255, 255, 255, 1)")) {
			System.out.println("text box color is present");
		}
		else {
			System.out.println("text box color is absent");
		}
		//login button is enabled
		boolean btnEnabled = driver.findElement(By.xpath("//div[contains(text(), \"Please\")]//preceding::span[3]")).isEnabled();
		if(btnEnabled) {
			System.out.println("btn is enabled");
		}
		
		else {
			System.out.println("btn is unable");
		}
		
		//confirm URl
		boolean facebookInUrl = driver.getCurrentUrl().contains("facebook");
		if(facebookInUrl) {
			System.out.println("facebook in URL is present");
		}
		else {
			System.out.println("facebook is absent in url");
		}
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[contains(text(), \"Please\")]//preceding::a[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@placeholder=\"Email address or mobile number\"]")).sendKeys("99999");
		driver.findElement(By.name("did_submit")).click();
		Thread.sleep(4000);
		//verify error message
		WebElement E = driver.findElement(By.xpath("//div[@class=\"pam uiBoxRed\"]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(E));
		String expectedErrorMessage = "No search results\nYour search did not return any results. Please try again with other information.";
				
		String actualErrorMessage = driver.findElement(By.xpath("//div[@class=\"pam uiBoxRed\"]")).getText();
		if(actualErrorMessage.equals(expectedErrorMessage)) {
			System.out.println("Error message verified");
			}
		else {
			System.out.println("error message not verified");
		}
		//verify title
		String expectedTitle = "Forgotten Password | Can't Log in | Facebook";
		String actualTitle = driver.getTitle(); 
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("unmatched title");
		}
		
		//verify find your account on facebook page
		boolean textPresent = driver.findElement(By.xpath("//h2[@class=\"uiHeaderTitle\"]")).isDisplayed();
		if(textPresent) {
			System.out.println("is displayed");
		}
		else {
			System.out.println("not displayed");
		}
		driver.quit();
				
			
		
		
		}
	
			
		
			
			

}
