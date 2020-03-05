package LinksConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCountInaClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Links count in entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		/*
		 * Links count in footer section
		 * Above the global driver scope is on entire page so we can get links of page
		 * So, For footer section links we need to minimize it to footer section
		 * this is called limiting webDriverScope
		 */	
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
	
		/* To further minimize the scope */
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		// click on each link in the column and check if page are opening 
		for (int i=1; i<columnDriver.findElements(By.tagName("a")).size();i++) {
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
			Thread.sleep(10000L);
		}	
		
		// get the window ids using iterator and while loop switch to windows and get title of page
			Set<String> abc=driver.getWindowHandles();
		    Iterator<String> it=abc.iterator();
		    
		    /*We are asking if any window presents, if presents we say it.hasNext(),
		    so iterator control base goes to 0index*/
		    /* abc.iterator have 0 index i.e first page
		     * in while loop we are checking condition if next index is present then go in while loop
		     * its start from 0, if zero index is present then goes inside
		     * otherwise comes out
		     * 
		     * it.next()---moves into next index/window
		     * it.hasNext----checks if next index/window is present
		     * condition: if index is present go inside and move to tht index
		     * */

             while(it.hasNext()){
		    	driver.switchTo().window(it.next());
		    	System.out.println(driver.getTitle());
		    }
	}

}
