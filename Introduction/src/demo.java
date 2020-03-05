import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.Create Driver Object for chrome browser 
		 * 2. we will strictly implement Methods of webdriver which is an interface which give all methods to automate. 
		 * 3. we need to give that webdriver knowledge to the object so that it will automate each and every ui in browser 
		 * ChromeDriver driver =new ChromeDriver(); 
		 * so we need to have return type for driver should be
		 * webDriver driver = new ChromeDriver();
		 * Since chrome firefox all are third party browsers they have restrictions for selenium to directly use API
		 * So we need to invoke .exe file first which was provided by there respective browsers
		C:\Users\peesa\chromedriver.exe
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	

		
	}

}
