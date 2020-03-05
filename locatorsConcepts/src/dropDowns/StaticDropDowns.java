package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDowns {
	/* Static dropdowns, whenever u spy the drop down if comes under select
	 * its a static dropdown 
	 * We have methods like SlectByvalue, SelectByvisibleText, SelectByIndex in select class
	 * 
	 * When the value of the elemnts in dropdown is dynamic 
	 * Dynamic drop downs: the drop down doestnot have value intially 
	 * but values are loaded based on user actions
	 * For expample the city(akron will be in both) in FROM and DEAPRTURE can have same xpath
	 * akron might be in from and departure, so in departure if we try to find elemnt of diffrent city but the 
	 * xpath shows as two (one is in FROM and other in departure)then we need to use index
	 * Since selenium try to find xpath of index one which is in FROM and which is closed since we are in departure scripts fails 
	 * we need to select node 2 since we need to use index 2
	 * (//tagName[@attribute='value'])[2]
	 * 
	 * or some people dont like to use index
	 * in that case we write //parentloctaor //childlocator so that it will search only in that parent
	 * this is called as parent child realtionship
	 * //parentlocator/childlocator is called parent child traverse mechanism
	 * 
	 * Select class will work only if tag name is select and inside tagname should be option
	 * */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//peesa//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		/*
		 * Can we use xpath and css in Select class???????????????
		 * below case class = valid, when trying to use this attribute in xpath its not working
		 */
		WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		System.out.println(currency.getText());
		Select s =new Select(currency);
		// Or we can use id and name for finding drop down elemnt
		//Select s =new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//Select s =new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		s.selectByValue("INR");
		
		
		s.selectByIndex(2);
		s.selectByVisibleText("USD");
		/*
		 * Select class will work only if tag name is select and inside tagname should
		 * be option
		 */
		
	}

}
