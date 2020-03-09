package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Safwan\\Desktop\\Testing\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// open Cleartrip Browser
		driver.get("https://www.cleartrip.com/");

		// Maximize browser
		driver.manage().window().maximize();

		// Clock on one way radiobutton
		//driver.findElement(By.id("OneWay")).click();

		// select Destination from
		driver.findElement(By.id("FromTag")).sendKeys("New York, US - All airports (NYC)");
		driver.findElement(By.id("FromTag")).sendKeys(Keys.RETURN);

		Thread.sleep(1000);

		// select Destination To
		driver.findElement(By.id("ToTag")).sendKeys("London, GB - All airports (LON)");
		driver.findElement(By.id("ToTag")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);

		// Click on Calendar //input[@type='text' and @id='DepartDate']
		driver.findElement(By.xpath("//input[@type='text' and @id='DepartDate']")).click();

		Thread.sleep(1000);
		// Click on Current date from the calendar
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();

		Thread.sleep(1000);
		// choose how many Adults
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");

		Thread.sleep(1000);
		// choose how many Children
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByValue("2");

		Thread.sleep(1000);
		// choose how many Infants
		Select s2 = new Select(driver.findElement(By.id("Infants")));
		s2.selectByValue("1");

		// Click on More Options
		driver.findElement(By.cssSelector("#MoreOptionsLink")).click();

		Thread.sleep(1000);

		// select Class of travel
		Select c = new Select(driver.findElement(By.id("Class")));
		c.selectByValue("Business");

		// Enter Preferred Airline
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("American");

		Thread.sleep(1000);
		// Click on search Button
		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.getTitle());

		Thread.sleep(2000);

		// Close the Browser
		driver.close();
	}

}
