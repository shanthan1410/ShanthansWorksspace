package FormatingCode;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addingitemsintocartforecomercesite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peesa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		/*
		 * We can find the locator of add cart of particular prduct using sibling and
		 * click on it //h4[text()='Cucumber - 1 Kg'] /following-sibling::div[2] But we
		 * can also take list of products name and click on add to cart using for loop
		 * and inside loop writing if condition if product name equals to string we
		 * provided then click on add to cart
		 * 
		 * we can mimize the code by using for loop instead of writing same code for
		 * clicking multiple add carts button
		 *
		 *
		 * for clicking on another product cart instead of wrting another if condition
		 * we can declare array and covert it to array list and compare it with name
		 */

		// String[] wishList= {"Brocolli - 1 Kg", "Cucumber - 1 Kg", "Orange - 1 Kg", "Mango - 1 Kg"};
		String[] wishList = { "Brocolli", "Cucumber", "Beetroot" };
		/*
		 * we can get comment saying value should be written simple in that case trim
		 * name variable value to match with with array list value
		 */

		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < productName.size(); i++) {
			String[] name = productName.get(i).getText().split("-");
			String formatedName = name[0].trim();// trim() method will remove left and right spaces of text
			// we can trim name , since it has 1 kg also
			System.out.println(formatedName);
			/*
			 * Usually array list takes more memory so in run time if we convert array to
			 * array list we can save memory
			 */
			List listNeeded = Arrays.asList(wishList);
			
			if (listNeeded.contains(formatedName)) {
				j++;
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				/*
				 * When we use text we need to check the text is static, in above case the is
				 * dynamic
				 */
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//if(j==3)
				//In above case j=3 when we add another product in array it fails so we are passing lenghth of array
				if(j==wishList.length){
					break;
				}
				/*
				 * We can't use break here when we use array list since we click on first element
				 * it will break and comes out of loop and doesnot click on second
				 */
			}

		}

	}

}
