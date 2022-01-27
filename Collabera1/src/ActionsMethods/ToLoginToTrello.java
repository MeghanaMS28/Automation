package ActionsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLoginToTrello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		driver.get("https://trello.com/");

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).clear();
		driver.findElement(By.id("user")).sendKeys("meghanamsleo@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Meghana@1999");
		driver.findElement(By.id("login-submit")).click();

		driver.findElement(By.xpath("//div[text()='Meghana M S']")).click();
		Thread.sleep(3000);

		Actions actions = new Actions(driver);
		WebElement srcElement = driver.findElement(By.xpath("//span[text()='WBT']"));
		WebElement dstElement = driver.findElement(By.xpath("//h2[text()='JAVA']"));
		actions.dragAndDrop(srcElement, dstElement).perform();

	}

}
