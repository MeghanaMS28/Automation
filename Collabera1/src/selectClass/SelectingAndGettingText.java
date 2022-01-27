package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAndGettingText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Meghana%20M%20S/Downloads/dropDown.html");
		
		WebElement mutliselectdropdown = driver.findElement(By.id("m1"));
		Select select =  new Select(mutliselectdropdown);
		select.selectByVisibleText("Grapes");
		select.selectByVisibleText("Mango");
		select.selectByVisibleText("Guava");
		List<WebElement> optionselected = select.getAllSelectedOptions();
		for(WebElement ele : optionselected) {
			System.out.println(ele.getText());
		}
		

	}

}
