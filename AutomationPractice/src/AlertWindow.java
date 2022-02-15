import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Satkar");
		
		driver.findElement(By.id("alertbtn")).click();

		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Satkar");
		
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		
	}

}
