package Syncronisation;

public class Waitsconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Syncronisation: When we click on something and for the next page to load
		 * its takes times, so click on the elemnt on that page we need to wait for sometime
		 * To achive syncronisation we have Implicit, Explicit, FluentWait, THread.Sleep
		 * 
		 * Implicit wait: We declare this wait globally at the starting of script after driver intialisation
		 * and we define n numbers of seconds , so it waits for n number of seconds, before throwing an exception 
		 * If the element is found before n number of seconds, it will come out of the implicit wait and continue with execution
		 * It will not wait untill n number of seconds,
		 * Disadvantage: we declare n seconds
		 * But in a scenario we search for holtels in atlanta and clevland
		 * Atlanta has 50 which takes 10 sec to load
		 * clevland have 100 which takes 30 sec to load
		 * i we declare wait of 10sec then scripts fails for clevland
		 * 
		 * Always we need to declare implicit wait as minimal
		 * beacuse in above case we declare wait as 30 sec the script will pass
		 * but in other case for LA city, after clicking on search and there is a error in loading page
		 * we will get to know that page not laoding after 30 sec which is not preffred to do
		 * 
		 * 
		 * Explicit wait: In this wait we will targetspecific scenario or specific element
		 * and wait n seconds for that condition  to be found,
		 * 
		 * Its better to use both implicit and explicit wait in a project
		 * 
		 * Thread.sleep is not part of selenium webdriver
		 * its part of java, it will  pause execution and doesnot listen to dom
		 * 
		 * where as impicit wait keep on listening to dom if element found before it resumes and
		 * continue execution
		 * 
		 * 
		 * Fluent wait: 
		 * There is another explicit wait mechanism type called FLUENT wait
		 * Explicit wait can be achived in 2 ways
		 * 
		 * 1. WebDriverWait =10sec
		 * 2. FluentWait =10sec, polling 4
		 * WebDriverWait MONITORS WEBELENT COTINUOLSY ON DOM untill 10 sec
		 * FluentWait CHECKS REGULAR INTERVAL OF TIME until the timeout
		 * It will check every 4 sec,
		 * con if it finds at 2 sec ,
		 * 
		 * Example:
		 * before confirmation is displayed below two are displayed
		 * Your card is accepted(3sec),     your order is being proceesed( 7th sec)
		 * Above two have all atributes same in that case we can use fluent wait 
		 * where in polling(4) it checks at 0sec and then it will check after 4 sec(it will skip first element) so it will
		 * directly checks for second elemnt. so that we can verify both at same time
		 * then confirmation is displayed
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Pros and cons of implicit and explicit
		 * Pros: Readable code and looks optimized, since we declare globally no need to declare again
		 *  cons:
		 *  If we have a requiremnt which says on clicking an element next elemnt should be displayed
		 *  immediately, but when we use implicit wait the bug will be hidden
		 *  Performance issues are not caught
		 * 
		 * Explicit:
		 * Wait is applied only at targeted elements, So performance issues
		 * cons
		 * More code, This is not actuall disadvantage,
		 * 
		 * Fluent 
		 * cons have messy code
		 * So if application is slow we can use implicit wait, because we cant add wiat for each and evry step
		 * 
		 * If application server is so fast the we can use explcit wait, beacuse there is no need to wait for evry step
		 * 
		 * 
		 * 
		 * */
		
		

	}

}
