package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//https://logging.apache.org/log4j/2.0/manual/configuration.html

public class demo1 {

	private static Logger log =LogManager.getLogger(demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I have clicked on button (write actions in debug)");
		log.info("Button is  displayed(after action performed write result in info)");
		log.error("Button is not displayed");
		
		log.fatal("object is not present");
		
		
	}

}
