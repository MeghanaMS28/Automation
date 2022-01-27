package webDriverMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseWebDriverInsteadOfChromeDriver {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File tempfile = tc.getScreenshotAs(OutputType.FILE);
		System.out.println(tempfile);
		
		File destfile = new File("./Errorshot/screenshot1.png");
		FileUtils.copyFile(tempfile, destfile);
		}

}
