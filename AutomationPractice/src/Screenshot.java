import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/satkarbodhe/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eposanytime.co.uk/");

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot)driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File("/Users/satkarbodhe/Downloads/screenshot.png");

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);
		
	}

}
