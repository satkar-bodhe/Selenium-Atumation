import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Select the radio button round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//Select the origin station city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		
		//Select the destination station city
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DED']")).click();
		
		//Enter the Departure date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		
		//Verify Return date picker calendar is enabled or not
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Return date picker calendar is disabled");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		
		//Select the passengers 
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("5");
		
		//Verify correct passengers are reflected or not
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		driver.close();
		driver.quit();
		
	}
	

}
