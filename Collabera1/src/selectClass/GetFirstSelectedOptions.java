package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Meghana%20M%20S/Downloads/dropDown.html");
		
		WebElement mutliselectdropdown = driver.findElement(By.id("m1"));
		Select select =  new Select(mutliselectdropdown);
		select.selectByValue("5");
		select.selectByValue("3");
		select.selectByValue("2");
		
		
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());//It will print top of the element which is selected
		}

}
