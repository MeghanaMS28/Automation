package webDriverMethods;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOfTheWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Dimension dimension = driver.manage().window().getSize();
		int height=dimension.getHeight();
		int width=dimension.getWidth();
		System.out.println("Height: "+height+"and Width: "+width);
		}

}
