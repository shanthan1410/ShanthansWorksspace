package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//https://logging.apache.org/log4j/2.0/manual/configuration.html

public class demo {

	private static Logger log =LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("Iam debugging");
		log.error("object is not present");
		log.info("Object is present");
		log.fatal("this is fatal");
		
		
	}

}
