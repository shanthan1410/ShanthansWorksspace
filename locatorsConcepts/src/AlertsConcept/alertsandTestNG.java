package AlertsConcept;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alertsandTestNG {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Alerts are not the pops which comes from html these are javascript alerts
		 *  Selenium cannot handle alerts so we have mechanism where we can switch existing driver to alerts 
		 *  and handle it
		 *  rahulshettyacademy.com/AutomationPractice
		 *  
		 *  two types of alerts alerts and confirm
		 *  on clicking we will get (OK) or (ok and cancel) or (yes and no)  to accept/dismiss allert
		 *  to accept alert we have method accept(), to cancelwe have dismiss() method
		 */
	
	
	//Created @test instead oof main to run test in testng
	
	    @Test
		public void status() {
		System.setProperty("webdriver.chrome.driver", "C://Users//peesa//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		// sysout control+space
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		driver.switchTo().alert().accept();
	}

}
