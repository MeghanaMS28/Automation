package webDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToInstagram {

	public static void main(String[] args) {
		// Test Data
		String testURL = "https://www.instagram.com/";
		String username = "_meghana_suresh_";
		String password = "pythonapplication";
		String expectedLoginpageTitle = "Instagram";
		String expectedHomepageTitle = "Instagram";

		// Step1 : Open the browser Enter the URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(testURL);
		String actualpageLoginTitle = driver.getTitle();
		if (actualpageLoginTitle.equals(expectedLoginpageTitle)) {
			System.out.println("Login page is displayed successfully");
		} else {
			System.out.println("Login page is not displayed successfully");
		}

		// Step2 : Enter username into username textfield
		WebElement usernameTextfield = driver.findElement(By.name("username"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(username);
		String actualusernameEntered = usernameTextfield.getAttribute("value");
		if (actualusernameEntered.equals(username)) {
			System.out.println("username is entered successfully");
		} else {
			System.out.println("username is not entered successfully");
		}

		// Steps3 : Enter password into password textfield
		WebElement passwordTextfield = driver.findElement(By.name("password"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(password);
		String actualpasswordEntered = passwordTextfield.getAttribute("value");
		if (actualpasswordEntered.equals(password)) {
			System.out.println("password is entered successfully");
		} else {
			System.out.println("password is not entered successfully");
		}

		// Steps4 : Click on Login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actualHomepageTitle = driver.getTitle();
		if (actualHomepageTitle.equals(expectedHomepageTitle)) {
			System.out.println("Home page is displayed successfully");
		} else {
			System.out.println("Home page is not displayed successfully");
		}

	}

}
