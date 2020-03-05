package endToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class endToEndScenario1 {

	/* This script will validate end-to-end scenario of makemytrip.com web-site first page*/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		/* Clicks on round trip and checks whether Round trip have selected */
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
		Thread.sleep(2000);
		//Below isSelcted method is not working, since used getAttribute method to show class has selected
		//System.out.println(driver.findElement(By.cssSelector("[data-cy='roundTrip']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("[data-cy='roundTrip']")).getAttribute("class").contains("selected"));	
		System.out.println("Round trip is selected by default");
		
		// //label[@for='fromCity']
		//  [role] [type]
	
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		WebElement fromCity= driver.findElement(By.cssSelector("[role] [type]"));
		fromCity.sendKeys("hyd");
		Thread.sleep(2000);
		fromCity.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		fromCity.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement toCity= driver.findElement(By.cssSelector("[role] [type]"));
		toCity.sendKeys("clevland");
		
		toCity.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		toCity.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Travellers & CLASS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='guestCounter font12 darkText']/li[@data-cy='adults-3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='guestCounter classSelect font12 darkText']/li[@data-cy='travelClass-3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".widgetSearchBtn")).click();
		Thread.sleep(20000);
		System.out.println(driver.findElement(By.xpath("//p[@class='error-title']")).getText());
		Boolean s=driver.findElement(By.xpath("//p[@class='error-title']")).getText().contains("No flights found");
		Assert.assertTrue(s);
		System.out.println("Error mesg detucted");
		
	}

}
