import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrame 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.cssSelector("a[href='/frames']")).click();
		driver.findElement(By.cssSelector("a[href='/iframe']")).click();
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		
		Actions a = new Actions(driver);
		
		driver.findElement(By.cssSelector("div.tox-edit-area")).sendKeys("Hey How are you?");
		
	}

}
