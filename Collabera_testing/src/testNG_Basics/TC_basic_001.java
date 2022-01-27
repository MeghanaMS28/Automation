package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_basic_001 {
	@Test
	public void dell() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/");

	}

	@Test
	public void lenovo() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenovo.com/");

	}

	@Test
	public void lenskart() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenskart.com/");
	}
}
