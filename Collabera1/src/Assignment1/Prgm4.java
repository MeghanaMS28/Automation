package Assignment1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(100,50));
		}
}
