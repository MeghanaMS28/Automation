package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Meghana M S\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.skillrary.com/");
		String windowId =driver.getWindowHandle();
		System.out.println(windowId);
	}

}
