package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesConcept {
	
	/*
	 *  Frames are components which are hosted on the webPage, they are build top
	 * over the application
	 * Selenium can't handle frames directly
	 * 
	 * to check its a frame: go to html and tag name will be iframe
	 * if we have frame id we can pass in frame() method, its simple
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//to check frames in an application 
		// tag name can be frameSet ot iframe
		System.out.println(driver.findElements(By.tagName("iframe")).size());		
		
		//to check links in an application
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		/*
		 * We can switch by using webelement or index if we have more frames in a page
		 * But index method is not suggestable beacuse we dont know developer might had one more frame in future it fails
		 */
		 driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.findElement(By.cssSelector("div#draggable")).click();
		
		
		// how to handle drag and drop 
		Actions a =new Actions(driver);
		WebElement source= driver.findElement(By.cssSelector("div#draggable"));
	   WebElement target= driver.findElement(By.cssSelector("div#droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		
		/* to switch back from frame and perform action*/
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	}
	

}
