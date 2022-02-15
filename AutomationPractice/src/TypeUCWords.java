import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TypeUCWords 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox")); 
		a.moveToElement(searchbox).doubleClick().build().perform();
		
		WebElement accountname = driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
		a.moveToElement(accountname).contextClick().build().perform();
		
		
	}

}
