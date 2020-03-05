package locatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class salesforcePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//peesa//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("shanthan1410@gmail.com");
		driver.findElement(By.cssSelector("[name='pw']"));
		driver.findElement(By.name("Login")).click();
		String error =driver.findElement(By.className("loginError")).getText();
		System.out.println(error);
	
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.cssSelector(".secondary")).click();
		String s =driver.findElement(By.id("mydomainLink")).getText();
		System.out.println(s);
		driver.close();
		

	}

}
