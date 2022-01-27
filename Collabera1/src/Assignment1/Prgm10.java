package Assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
        Thread.sleep(2000);
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedTitle="ICICI";
		Thread.sleep(2000);
	
		for(String childsWindowIds : allWindowIds) {
			driver.switchTo().window(childsWindowIds);
			String a = driver.getTitle();
			Thread.sleep(2000);
		    if(expectedTitle.equals(a)) {
		    driver.close();
		    }
		}
	}
}

