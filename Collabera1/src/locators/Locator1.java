package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Meghana M S\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("_meghana_suresh_");
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("pythonapplication");
		driver.findElement(By.cssSelector("button[class='sqdOP  L3NKy   y3zKF     ']")).click();
		//driver.findElement(By.cssSelector("div[class='wgVJm']")).click();
		//driver.findElement(By.cssSelector(""))
		}

}
