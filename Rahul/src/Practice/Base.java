package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open google 
		driver.get("https://www.google.com/");

		// Maximize browser
		driver.manage().window().maximize();
		
		//Delete all the cookies
		//driver.manage().deleteAllCookies();
		
		// Validate if your page title is correct 
		System.out.println(driver.getTitle());
		
		//Validate if you are landed on correct URL
		//System.out.println(driver.getPageSource());
		
		// Navigate to another URL
		driver.navigate().to("http://yahoo.com");
		Thread.sleep(2000);
		
		// Navigate Back to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		// Navigate Forward to previous page
		driver.navigate().forward();
		
		//Refresh the page
		//driver.navigate().refresh();
		
		// Close Current Browser
		Thread.sleep(3000);
		driver.close();
		
		// Colses all the browser opened by selenium script
		// driver.quit();

	}

}
