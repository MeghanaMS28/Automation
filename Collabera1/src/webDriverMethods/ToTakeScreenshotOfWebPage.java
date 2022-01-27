package webDriverMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenshotOfWebPage {

	public static void main(String[] args) throws InterruptedException,IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");
		
		File tempfile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempfile);
		
		File destFile = new File("./Errorshot/screenshot1.png");
		tempfile.renameTo(destFile);
		
		File screenshotOFWebElement = driver.findElement(By.xpath("//a[.='FIND FOOD']")).getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./Errorshot/screenshot2.png");
		screenshotOFWebElement.renameTo(destFile1);
		
		}

}
