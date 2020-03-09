package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableA {

	public static void main(String[] args) {
		//Chrome driver property 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// open rahul Sheety academy browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Maximize browser
		driver.manage().window().maximize();
		
		// Taking whole table as a webElement
		WebElement table=driver.findElement(By.id("product"));
		
		//counting all the tagName call "tr"
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		
		//Print 3rd rows data
		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());
		
		System.out.println(secondrow.get(1).getText());
		
		System.out.println(secondrow.get(2).getText());
		
	
	}
	

}
