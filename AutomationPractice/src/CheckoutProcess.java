import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutProcess 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String addItem[] = { "Brocolli", "Tomato", "Cashews", "Pista", "Almonds" };

		addItems(driver, addItem);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();

	}

	public static void addItems(WebDriver driver, String[] addItem) 
	{

		
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));

		int j = 0;

	
		for (int i = 0; i < products.size(); i++) 
		{
			
			String[] name = products.get(i).getText().split("-");

			String itemName = name[0].trim();

			List<String> addItemsList = Arrays.asList(addItem);

			if (addItemsList.contains(itemName)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}
			if (j==addItem.length)
			{
				break;
			}

		}
	}

}
