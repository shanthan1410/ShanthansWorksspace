package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {
	
	//auto suggestive dropdowns are when write in checkbox 
	//it will suggest the names related to that in below dropdown,, example airport to and from destination dropdown
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//peesa//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[role] [type]")).sendKeys("hyd");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[role] [type]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("[role] [type]")).sendKeys(Keys.ENTER);
		
		// above code can be optimised by taking as webelemnt
		
		WebElement destination=driver.findElement(By.cssSelector("[role] [type]"));
		destination.sendKeys("mum");
		Thread.sleep(2000);
		for(int i=0;i<2;i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(2000);
		destination.sendKeys(Keys.ENTER);
		
		//

	}

}
