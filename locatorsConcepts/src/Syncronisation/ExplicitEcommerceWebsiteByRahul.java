package Syncronisation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitEcommerceWebsiteByRahul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] wishList = { "Brocolli", "Cucumber", "Beetroot" };
		addProducts(driver, wishList);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		String promeCodeText = driver.findElement(By.cssSelector(".promoInfo")).getText();
		Assert.assertEquals(promeCodeText, "Code applied ..!");
		System.out.println(promeCodeText);

	}

	/*
	 * Method to add given products to cart driver initialize the webdriver wishList
	 * array of products need o be added
	 * 
	 */
	public static void addProducts(WebDriver driver, String[] wishList) {
		int j = 0;

		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < productName.size(); i++) {
			String[] name = productName.get(i).getText().split("-");
			String formatedName = name[0].trim();

			System.out.println(formatedName);

			List listNeeded = Arrays.asList(wishList);

			if (listNeeded.contains(formatedName)) {
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == wishList.length) {
					break;
				}
			}

		}

	}

}
