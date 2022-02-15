import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{

	public static void main(String[] args) 
	{
		// Check login functionality is working or not with valid input.
		
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#flash")).getText());
		
		driver.close();
		driver.quit();
		
		
	}

}
