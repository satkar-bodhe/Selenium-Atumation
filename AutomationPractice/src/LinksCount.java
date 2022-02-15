import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//this is the class for counting links and open it into the separate tab and get the title of each tab
	
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Limiting scope of webdriver
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		
		for (int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++ )
		{
			String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.RETURN);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
		
		Set<String> windows = driver.getWindowHandles(); 
		
		Iterator<String> it = windows.iterator();
		
		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
