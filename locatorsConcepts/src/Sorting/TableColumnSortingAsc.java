package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableColumnSortingAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
	    List<WebElement> firstcolList=driver.findElements(By.cssSelector("tbody tr td:nth-child(2)"));
	    
	    ArrayList<String> orginalList= new ArrayList<String>();
	    for(int i=0; i<firstcolList.size();i++) {
	    	orginalList.add(firstcolList.get(i).getText());
	    	//add is the method in arraylist which adds string value in list 
	    }
	
	    ArrayList<String> copiedList =new ArrayList<String>();
	    
	    for(int i=0;i<orginalList.size();i++) {
	    	copiedList.add(orginalList.get(i));
	    }
	    
	    Collections.sort(copiedList);
	    
	    
	System.out.println(copiedList);
	System.out.println(orginalList);
	
	System.out.println("*********copiedList**********");
	//can be written as i=0;i<copiedList;i++ this is called enanced for loop
	for(String s:copiedList)
		{
		System.out.println(s);
	}
	System.out.println("*********orginalList**********");
	for(String s:orginalList)
	{
	System.out.println(s);
}
	
	Assert.assertTrue(orginalList.equals(copiedList));
	
	}

}
