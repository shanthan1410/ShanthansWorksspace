package locatorsConcepts;

public class CustomizedXpathCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* In HTML we have tagName, Attributes and values for attibrutes
		 * //tagName[@attribute='value']- syntax of xapth
		 * //*[@attribute ='value'] -syntax for xapth without tagname
		 *  tagName[attribute ='value']- syntax for CSS
		 *  [attribute ='value']- syntax for CSS without tagName
		 *  tagName#id -syntax for css
		 *  tagnName.className  - syntax for CSS.
		 *  classes should not have spaces- we will get error "compound classes cannot be accepted"
		 *  If the class attribute have spaces replace it with .
		 *  
		 *  Most of the cases id attribute will be unique
		 *  
		 *  Regular Expressions
		 *  //tagName[contains(@attribute, 'value')] for xpath
		 *  tagName[attribute*='value'] for css regular expressions
		 *  We use regular expressions when value is too long and when value changes dynamically we take static value from it and use
		 *  
		 *  Using text as an attribute
		 *  //tagName[text()='value']
		 *  //*[text()='value']   without tag name
		 *  We can use text when attributes are not present
		 *  If attributes are not dynamic or which have spaces
		 *  
		 *  
		 *  Every object may not have ID,className or name - XPath and CSS are preferred
		 *  Aplha numeric id may vary on every refresh. Do check before using
		 *  Confirm the link object with anchor "a" tag
		 *  Driver.findElement(By.tagName(“a”).size()); we can get list of links
		 *  classes should not have spaces- we will get error "compound classes cannot be accepted"
		 *  I we have multiple values- Slenium identifies the first one- scans from top left
		 *  Double quotes inside double quotes are not accepted. so we write values in single quotes
		 *  Xpath/CSS can be defined in n number of ways
		 *  Rigtclick copy on the blue highlighted html code to generate xpath
		 *  Firepath is depreciated from firefox, only found on version 55 or below
		 *  from browser tools when u get the xpath starting with html- not reliable- write own xpath
		 *  There is no direct way to get css in chrome. you will find it in tool bar
		 *  In console to check xapth or css
		 *  syntax:$x("") for xpath; $("")for css
		 *  
		 *   
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */

	}

}
