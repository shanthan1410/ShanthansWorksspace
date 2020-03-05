package Test;

import org.testng.annotations.Test;

public class day1 {

	/*
	 * public static void main is a java compiler , But when we run using TestNG no need
	 * of main
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 *
	 * }
	 */
	
	/* Download jar: In individual project we can add jar in build path 
	 * But for entire ecliipse we need to do from 
	 * 1 testng.org 2 click on ecllipse 3 installation .4.click install the plugin in 1.
	 * Select Help / Install New Software in eclipse...
     * Enter the update site URL in "Work with: http://dl.bintray.com/testng-team/testng-eclipse-release/. and continue
	 */
	
	
	/* XML is used to run testng suite, all the testcase are added in xml and will run suite
	 * we have TestSuite /TestFolder or module 
	 * Above two are common for any xml file, and in between we write test cacses which need to executed
	 * we can add our test csases which we need to run
	 * 
	 * Instaed of classes we can give entire package name which will all tcs in package
	 * 
	 * we exclude or include the testcases
	 * 
	 * If ask not  to run only 40 tcs in 100, we can write exclude 40times
	 * for that we have naming convention were we write method name of same category will starts 
	 * with common name 
	 * then we can write Mobile.*  which takes all methods which starts with Mobile and anything after mobile
	 * example name=mobile
	 * Above one is called using regular expression
	 * 
	 * @Before Suite
	 * @After suite
	 * 
	 * @Before test
	 * @After test
	 * 
	 * Above two are related to xml
	 * before and after suite will run before and after executing the suite
	 * 
	 * before and after test will run before and after executing the test of TestFolder or module
	 * These depends on number of testfolders present in XML
	 * 
	 * 
	 * @Before method
	 * @After method
	 * 
	 * This is not related to xml, it is specific to class file 
	 * before all and after methods in a class will execute before and after each method in a class
	 * 
	 * 
	 * @Before class
	 * @After class
	 * 
	 * before executing any methods in the class
	 * after executing all methods in the class
	 * 
	 * 
	 * @Test(groups={"smoke"})
	 * If we create a group in for method 
	 * In XML we can Execute all the testcases which have tagname having msoke
	 * Gnerally these is used for smoke tests
	 * 
	 * @Test(dependOnmethods={"method name"})
	 * 
	 * it means code written is tottly depends on method written in brcket
	 * 1st method written in bracket will be executed
	 * later present method will be executed
	 * 
	 * 
	 * @Test(enabled=flase)
	 * it will skip this method
	 * if we had a bug already reported, in that case we can use this annotation
	 * 
	 * @Test(timeOut=4000)
	 * Will wait untill given time before thrwing error
	 * If the test case is taking long time to execute and due to which script is failing
	 * we can increase implicit wait but performance will go down
	 * 
	 * */ 
	
	
	
	@Test
	public void demo() {
		System.out.println("HELLO");
	}
	
	@Test
	public void demo1() {
		System.out.println("Bi");
	}


}
