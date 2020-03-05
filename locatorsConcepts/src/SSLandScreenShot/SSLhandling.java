package SSLandScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Desired capabilities class have methods to handle and accept ssl certificates
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		/*
		 *Below is the local browser merge ch intolocal browser
		 */
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		
		WebDriver driver =new ChromeDriver(c);

	}

}
