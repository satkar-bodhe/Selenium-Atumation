import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSix 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		
		String checkbox = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select dropdown = new Select(staticDropdown);
		
		Thread.sleep(2000);
		
		
		dropdown.selectByVisibleText(checkbox);
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("name")).sendKeys(checkbox);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		
		if (alertText.contains(checkbox))
		{
			System.out.println("You have successfully checked the checkbox " +checkbox);
		}
		else
		{
			System.out.println("Something went wrong");
		}
	}

}
