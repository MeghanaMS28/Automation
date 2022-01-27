package popUpMessages;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalender {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime LDT = LocalDateTime.now().plusYears(2);
		String month = LDT.getMonth().name();
		month = month.substring(0, 1).toUpperCase() + month.substring(1,3).toLowerCase();
		int date = LDT.getDayOfMonth();
		int year = LDT.getYear();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		Thread.sleep(3000);

		for (;;) {
			try {
				driver.findElement(By.xpath("//td[text()='"+month+" " + year + "']/../..//td[text()='" + date + "']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//button[text()='>']")).click();
			}
		}

	}
}
