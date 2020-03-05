package locatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Parent-child relationship xpath - Define xpath fROM parent/tagnames to current elemnet*/
		System.setProperty("webdriver.chrome.driver", "C://Users//peesa//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String s=driver.findElement(By.xpath("//div[@class='_8esl']/div[1]/span")).getText();
		System.out.println(s);
		
	}

}
