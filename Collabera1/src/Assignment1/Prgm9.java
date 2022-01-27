package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getWindowHandle());

	}

}
