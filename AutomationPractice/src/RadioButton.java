import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Is enabled");
			Assert.assertTrue(true);
			
		}
		
		else 
		{
			Assert.assertTrue(false);
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
