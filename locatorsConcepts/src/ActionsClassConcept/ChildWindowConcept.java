package ActionsClassConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//check linksCountInaClass for loop of iteration
public class ChildWindowConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * By defualt selenium will be in first window(parent window) only
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		System.out.println(driver.getTitle());

		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		System.out.println(parentId);
		String childId= it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}

}
