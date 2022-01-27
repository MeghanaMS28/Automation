package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Meghana M S\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedMsg="Please identify yourself";
	    WebElement togettext=driver.findElement(By.id("headerContainer"));
	    String actualMsg=togettext.getText();
	    System.out.println(actualMsg);
	    
	    if(expectedMsg.equals(actualMsg)) {
	    	System.out.println("Msg is matching");
	    }
	    else {
	    	System.out.println("Invalid Msg");
	    }
		}

}
