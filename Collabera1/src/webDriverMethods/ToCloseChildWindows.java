package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseChildWindows {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/");


 String parentWindowId=driver.getWindowHandle();
 Set<String> allWindowIds=driver.getWindowHandles();
 allWindowIds.remove(parentWindowId);
 
 for(String windowId:allWindowIds) {
	 driver.switchTo().window(windowId);
	 driver.close();
       }
   }

}
