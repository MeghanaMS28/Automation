package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Meghana M S\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(100,50));

	}

}
