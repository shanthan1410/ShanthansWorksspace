package SSLandScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		/* We need to cast driver object to TakesScreenshot method 
		 * getScreenshotAs will take the SS of the page
		 * parameter says get the SS in File Format
		 * 
		 * */
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("c://screenshot.png"));
		
		FileHandler.copy(src, new File("C:\\Users\\peesa\\OneDrive\\Desktop\\3rd Project Marketing\\screenshot.png"));
		
	}

}
