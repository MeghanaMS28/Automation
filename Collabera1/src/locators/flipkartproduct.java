package locators;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartproduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Meghana M S\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement texts = driver.findElement(By.name("q"));
		texts.click();
		texts.sendKeys("Smart watch");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//div[@data-id])[4]")).click();
		
		
		String value = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		String price = value.toString();
		String  price1= price.replaceAll("[^\\d.]", "");
		int val = Integer.parseInt(price1);
		System.out.println(val);
		
		if(val<=6000) {
			String parentWin = driver.getWindowHandle();
			Set<String> allWin = driver.getWindowHandles();
			allWin.remove(parentWin);
			String expectedtitle = "Noise ColorFit Qube SpO2 Charcoal Grey Smartwatch Price in India - Buy Noise ColorFit Qube SpO2 Charcoal Grey Smartwatch online at Flipkart.com";
		
		    for (String s : allWin) {
			driver.switchTo().window(s);
			String actualtitle = driver.getTitle();
			if (expectedtitle.equals(actualtitle)) {
				System.out.println("Driver switched control to a parent page");
			}
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();

	}
		else
		{
			System.out.println("The price is Greater than 6000");
		}

}
}

