package locatorsConcepts;

public class AbsoluteandRelativeandSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Relative is prefered becuase if any developer is working on page refactoring
		 * then div might change then we need to change entire xpath  
		 * Relative- Doesnot depend on parents nodes
		 * Absolute- Parent/child traverse from body to current node
		 *
		 * Traverse to siblings:
		 * 1. We can directly go to sibling element using index but if  parent
		 * value changes dynamically then problem occurs
		 *2.  We can use tagName attribute and value of sibling to traverse
		 *but if the attribute value changes then problem occurs
		 *Getting above 2 scenarios is very case if we get we can use below
		 *Only chance is one of the siblng is constant
		 *Then we can use
		 * locator of sibling which is static then using /following-sibling::tagName[index]
		 * /preceding-sibling::tagName     for preceding
		 * 
		 * Traverse from child to parent
		 * locator of child /parent::tagName
		 * Going back to parent can only happen in xpath, it cannot be happen in css
		 * With xpath we can traverse back, in css we cant
		 * 
		 * 
		 * 
		 * For siblings ask arun bro 
		 * example in facebook page take female text in gender how to write siblings without using class
		 * name only use sibling type=radio and findout female elemnt
		 * but we have 3 type=radio and we are getting 3 siblings how to overcoem this?
		 * 
		 * */
	}

}
