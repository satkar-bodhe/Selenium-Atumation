import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CheckBoxSelecttCount 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());	
		
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.close();
		driver.quit();
		
		
	}

}
