package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetRightLeftAllignmentOfAnElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Meghana M S\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ToGetHW=driver.findElement(By.id("email"));
		System.out.println(ToGetHW.getSize());
		WebElement ToGetHW1=driver.findElement(By.id("passContainer"));
		System.out.println(ToGetHW1.getSize());
	
		}

}
