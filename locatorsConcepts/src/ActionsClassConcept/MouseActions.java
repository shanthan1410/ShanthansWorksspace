package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Actions a= new Actions(driver);
		// After moving to element we need to build entire element using build() method
		// build() means ready to execute then we need to execute using perform()
		
		WebElement move = driver.findElement(By.cssSelector("a#nav-link-accountList"));
		a.moveToElement(move).contextClick().build().perform();
		//contextclick() will right click on element
		
		// performing Multiple actions in single step is called composite action
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();		
		
		

	}

}
