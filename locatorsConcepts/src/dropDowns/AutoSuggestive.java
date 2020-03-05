package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*Enter the letter BENG and verify if Airport option is displayed in the suggestive box*/
public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//peesa//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		//Using javascript html dom we can exctract all the hidden elemnts in the HTML(Ajax implementation)
		//Beacuase selenium cannot indentify hidden elements
		//Investigate the properties of the object if it has hidden text
		
		//Using javascriptExecutor we can write javascript dom elements also
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		String script ="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		int i=0;
		  String expected="BENGALURU INTERNATION AIRPORT";
		  while(!text.equalsIgnoreCase(expected)){
			 i++; 
		  driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN); 
		   text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
			}
		  } 
		  
		  if(i>10) {
			  System.out.println("Element not found");
		  }
		  
		//  If we cant find text it will loop infinite times 
	}
}


