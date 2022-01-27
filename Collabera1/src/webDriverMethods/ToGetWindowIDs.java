package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowIDs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Meghana M S\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Set<String>  allWindowsIds=driver.getWindowHandles();
		String expectedWindowTitle = "ICICI";
		for(String windowId :allWindowsIds )
		{
			driver.switchTo().window(windowId);
			String actualWindowTitle = driver.getTitle();
			if(!(expectedWindowTitle.equals(actualWindowTitle))) {
				driver.manage().window().maximize();
				break;
			}
		}

	}

}
