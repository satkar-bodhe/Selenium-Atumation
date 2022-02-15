import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemInCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(2000);
		//Array to store the new items which needs to be added in the cart.
		String addItems[] = { "Cucumber", "Tomato", "Beans" };

		// Saved all the products in the list
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));

		int j = 0;

		// Iterating all the products
		for (int i = 0; i < products.size(); i++) {
			// Splitting item name
			String[] name = products.get(i).getText().split("-");
			// Trimmed the spaces
			String itemName = name[0].trim();

			// Convert array into array list.
			List addItemsList = Arrays.asList(addItems);

			// Check in the products contain item name is exits or not.
			if (addItemsList.contains(itemName)) {
				j++;

				// Click on the items
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// Break the iteration after finding the items and add in to the cart
				if (j == addItems.length) {
					break;
				}
			}
		}

	}

}
