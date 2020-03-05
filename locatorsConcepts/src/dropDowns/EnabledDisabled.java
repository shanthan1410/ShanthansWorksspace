package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledDisabled {
	/* isEnable and isDisabled are the mthods we use to check whether
	 * element isdisbled or enable
	 * With the new websites and html, these methods are not working because even though 
	 * ui looks like its disabled when u click on it it gets enabled, so the selenium gets confused
	 * whether its enabled or not
	 * In these case we need to check the attribute in the html which makes the element to disable mode
	 * we can put that attribute as checkpoint and validate whther the element is enabled or disabled
	 * 
	 * */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//peesa//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
	
		
		Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
	
		System.out.println("its disabled");
		driver.findElement(By.cssSelector("input[id*=Trip_1]")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		
		// or we can write in following way
		
		  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
		  System.out.println("Its enabled"); Assert.assertTrue(true);
		  
		  } else { System.out.println("Its disabled"); Assert.assertTrue(false); }
		 
		 
	
		
		
		
	}

}
