package HandleTableGrid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum= 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22779/nz-vs-ind-2nd-odi-india-tour-of-new-zealand-2020");
		
		List<WebElement> countOfScores=driver.findElements(By.xpath("//div[@id='innings_1']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
		int count=countOfScores.size();
		
		for(int i=0;i<count-2;i++) {
			String value=countOfScores.get(i).getText();
			int valueinInteger=Integer.parseInt(value);
			sum=sum+valueinInteger;
			}
		System.out.println(sum);
		
		String extras=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[text()='Extras']/following-sibling::div[1]")).getText();
		int extrasinInteger=Integer.parseInt(extras);
	
		int expectedTotal=sum+extrasinInteger;

		String total=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[text()='Total']/following-sibling::div[1]")).getText();
		int actualTotal=Integer.parseInt(total);
		
		System.out.println(expectedTotal);
		System.out.println(actualTotal);
		Assert.assertEquals(expectedTotal, actualTotal);
		
	}

}
