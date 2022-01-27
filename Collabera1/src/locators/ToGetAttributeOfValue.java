package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAttributeOfValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Meghana M S\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String username="Meghana";
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement usernameTF=driver.findElement(By.name("username"));
		usernameTF.clear();
		usernameTF.sendKeys(username);
		String actualDataEntered=usernameTF.getAttribute("value");
		System.out.println(actualDataEntered);
		
		if(actualDataEntered.equals(username)) {
			System.out.println("Username is Entered Properly");
		}else {
			System.out.println("Username is not proper");
		}
		}

}
