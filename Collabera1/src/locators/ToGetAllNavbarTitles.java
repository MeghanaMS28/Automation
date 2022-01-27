package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllNavbarTitles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		List<WebElement> navbartitles = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));
		List<WebElement> navbarsize = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));
		System.out.println(navbarsize.size());
		for(WebElement elements : navbartitles) {
			System.out.println(elements.getText());
		}

	}

}
