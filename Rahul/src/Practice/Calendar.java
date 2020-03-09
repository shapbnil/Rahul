package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// Set chrome driver properties
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

// Initialize Browser
		WebDriver driver = new ChromeDriver();
// open URL
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
	}

}
