package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSubmit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/signup");
		Thread.sleep(3000);
		//driver.findElement(By.id("join-form-submit")).submit();
		//by using xpath container locator
		driver.findElement(By.xpath("//button[contains(text(),'Agree & Join')]")).submit();

	}

}
