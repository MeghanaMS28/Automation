package testNG_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc_DataProvider2D_001 {
	@DataProvider
	public String[][] credentials() {
		String[][] sarr = { {"admin","manager"},
	                           	  {"trainee","trainee"}
		                       };
		return sarr;
	}

	@Test(dataProvider = "credentials")
	public void readMultipleDataFromExcel(String[] data) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(data[0]);
		driver.findElement(By.name("pwd")).sendKeys(data[1]);
		driver.findElement(By.id("loginButton")).click();
	}

}



