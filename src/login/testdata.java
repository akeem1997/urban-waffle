package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testdata {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akeem\\eclipse-workspace\\SeleniumDemo1\\src\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
	}

}
