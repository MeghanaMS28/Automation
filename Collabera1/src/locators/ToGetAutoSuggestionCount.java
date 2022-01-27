package locators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAutoSuggestionCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//li[@role='presentation']"));
		List<WebElement> listOfTexts = driver.findElements(By.xpath("//li[@role='presentation']"));
		System.out.println(listOfSuggestions.size());
		
		for(WebElement texts : listOfTexts) {
			System.out.println(texts.getText());
		}
		 }
		
	}



