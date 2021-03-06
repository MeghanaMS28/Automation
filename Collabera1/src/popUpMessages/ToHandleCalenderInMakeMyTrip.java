package popUpMessages;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleCalenderInMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime LDT = LocalDateTime.now();
		String month = LDT.getMonth().name();
		month = month.substring(0, 1).toUpperCase() + month.substring(1, month.length()).toLowerCase();
		int date = LDT.getDayOfMonth();
		int year = LDT.getYear();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Actions actions = new Actions(driver);
		actions.click().perform();

		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//div[@id='close']")).click();
		driver.findElement(By.xpath("for=\"departure\"")).click();
		Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100);");

		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}


