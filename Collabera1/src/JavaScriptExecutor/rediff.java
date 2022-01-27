package JavaScriptExecutor;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("meghanams1999@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Gayathri@77");
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com", Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Meghana M S");

		WebElement frameElements = driver
				.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(frameElements);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("HEY SUP?");
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Send")).click();

		for (;;) {
			try {
				driver.findElement(By.xpath("//span[text() ='Rediff . com']")).click();
				driver.findElement(By.xpath("//a[@class='ng_mid_delete']")).click();
				// driver.findElement(By.)
				break;
			} catch (NoSuchElementException e) {
				driver.navigate().refresh();
			}
		}
		//driver.close();

	}

}
