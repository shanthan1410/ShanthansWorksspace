
public class PageObjectModel {

	
	/* POM 
	 * Easy to Maintain, Easy Redability of scripts, reduce diplicacy
	 * Re usability of code
	 * 
	 * We need to create classes where we write objects and other where we write scripts
	 * to call objects in the script class we need to create object of that class and need to assign driver object
	 * 
	 * we need to create constructor in the obj class and write this.driver=driver
	 * this key word gives global driver which is equal to local driver
	 * i.e we are saying local driver(chrome) is equal to global driver
	 * beacuse in script we mentions its chrome driver , but in obj class driver doesnot know which driver it is
	 * so we are lettinh it know its a chromedriver
	 * 
	 * PageFactorty
	 * @FindBy(how = How.CSS, css = ".modal--full .modal__header__title")
   private WebElement headerTitle;


     public WebElement getHeaderTitleEle(){
      return headerTitle;
      
      
      Both follows same pattern but the way of writing web elemnts differ
      
      pom
      
      By headerTitle = By.css(".modal--full .modal__header__title")
      
      public WebElement getHeaderTitleEle(){
      return driver.findElement(headerTitle);
   }


	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
