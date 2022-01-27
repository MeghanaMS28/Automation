package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select dayselect = new Select(dayDropdown);
		System.out.println(dayselect.isMultiple());
		List<WebElement> dayListBoxOptions = dayselect.getOptions();
		for(WebElement ele : dayListBoxOptions)
		{
			System.out.println(ele.getText());
		}
		
		Select monthselect = new Select(monthDropdown);
		System.out.println(monthselect.isMultiple());
		List<WebElement> monthListBoxOptions = monthselect.getOptions();
		for(WebElement ele : monthListBoxOptions)
		{
			System.out.println(ele.getText());
		}
		
		Select yearselect = new Select(yearDropdown);
		System.out.println(yearselect.isMultiple());
		List<WebElement> yearListBoxOptions = yearselect.getOptions();
		for(WebElement ele : yearListBoxOptions)
		{
			System.out.println(ele.getText());
		}

	}

}
