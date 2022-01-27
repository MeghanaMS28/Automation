package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.net.Urls;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//URL url=new Urls("https://www.zomato.com/");
		//driver.navigate().to(arg0);
		
	}

}
