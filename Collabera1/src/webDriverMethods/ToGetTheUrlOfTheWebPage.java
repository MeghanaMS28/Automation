package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheUrlOfTheWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Meghana M S\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		System.out.println(driver.getCurrentUrl());
       }
}
