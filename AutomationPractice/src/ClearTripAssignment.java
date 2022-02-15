import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Select the One way radio button. 
		driver.findElement(By.xpath("//div[@class='flex flex-between flex-middle px-4 mt-2 mb-4']//label[1]//div[1]//span[1]")).click(); 
		
		//Open Depart date calendar
		driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
		
		//Select the current date
		driver.findElement(By.xpath("//div[@aria-label='Fri Jun 11 2021']//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top'][normalize-space()='11']")).click();
		
		//Click on the Adult dropdown. 
		driver.findElement(By.xpath("//select[@class='bc-neutral-100 bg-transparent']")).click();
		
		//Select the adult 2
		WebElement adultDropdown = driver.findElement(By.xpath("//select[@class='bc-neutral-100 bg-transparent']"));
		Select adropdown = new Select(adultDropdown);
		adropdown.selectByVisibleText("2");
		
		Thread.sleep(2000);
		
		//Click on the Children dropdown
		driver.findElement(By.xpath("//div[3]//select[1]")).click();
		
		//Select 2 Children from dropdown.
		WebElement childDropdown = driver.findElement(By.xpath("//div[3]//select[1]"));
		Select cdropdown = new Select(childDropdown);
		cdropdown.selectByVisibleText("3");
		
		Thread.sleep(2000);
		
		//Click on the more link.
		driver.findElement(By.xpath("//a[@class='td-none hover:td-underline px-4 mt-1 weak']")).click();
		
		//Enter the Preferred airline name
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("Indigo");
		
		//Click on the search flights
		driver.findElement(By.xpath("//button[normalize-space()='Search flights']")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='w-100p p-4 br-4 flex flex-middle flex-between elevation-3 bg-error-600 row']")).getText());
		
		
		driver.close();
		driver.quit();
		
		
		
		
	}

}
