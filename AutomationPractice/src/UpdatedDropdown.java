import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://beta.spicejet.com/");
		
		driver.findElement(By.cssSelector("div[class='css-1dbjc4n'] div div[class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']")).click();
		
		for (int i=0; i<4; i++)
		{
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();
		}

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'5 Adults')]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'5 Adults')]")).getText(), "5 Adults");
		
		//driver.quit();
		
	}

}
