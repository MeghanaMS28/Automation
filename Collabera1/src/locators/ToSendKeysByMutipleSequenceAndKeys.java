package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSendKeysByMutipleSequenceAndKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/signup");
		Thread.sleep(3000);
		driver.findElement(By.id("email-or-phone")).sendKeys("Me","gha","na",Keys.CONTROL+"a");
		Thread.sleep(3000);
		driver.findElement(By.id("email-or-phone")).sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
	}

}
