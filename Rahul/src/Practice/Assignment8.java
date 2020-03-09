package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Chrome driver property 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// open rahul Sheety academy browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Maximize browser
		driver.manage().window().maximize();
		
		//Main title of the page "Practice Page"
		System.out.println(driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText());
		
		// Enter country name three word on Suggestion Class Example 
		driver.findElement(By.id("autocomplete")).sendKeys("Uni");
		
		Thread.sleep(1000);
		//To find out United Kingdom send arrow key four times 
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		// To print Country name on Console
				System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		// Enter Country name if you find 
				driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
	}

}
