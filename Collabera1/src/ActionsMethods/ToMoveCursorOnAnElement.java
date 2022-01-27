package ActionsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveCursorOnAnElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		WebElement womenElement = driver.findElement(By.linkText("WOMEN"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(womenElement).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Heels")).click();

	}

}
