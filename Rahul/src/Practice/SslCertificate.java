package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertificate {

	public static void main(String[] args) throws InterruptedException {

		//SSL Certificates 
		
		//Designed capabilities
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		
		// ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS , true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Belows to your local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver(c);

		// Open google 
		driver.get("https://www.google.com/");

		// Maximize browser
		driver.manage().window().maximize();

		// Close Browser
		Thread.sleep(5000);
		driver.close();

	}

}
