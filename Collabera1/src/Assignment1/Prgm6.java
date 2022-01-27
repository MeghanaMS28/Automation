package Assignment1;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		TreeSet<String> titles = new TreeSet<String>()
		Set<String> allWindowIds = driver.getWindowHandles();
	    for(String InAlphabeticalOrder: allWindowIds) {
	    driver.switchTo().window(InAlphabeticalOrder);
	    System.out.println(driver.getTitle());
	    }
    }
}
