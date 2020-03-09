package Practice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// open Cleartrip Browser
		driver.get("https://www.spicejet.com/");

		// Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click on one way
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//Click on Round trip
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		// Click on from drop down list
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// select City from the drop down list
		driver.findElement(By.cssSelector("a[text='Delhi (DEL)'][value='DEL']")).click();

		Thread.sleep(3000);
		// select City to
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();

		// Select Depart date from Calendar
			driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active']")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
	
		}
		
		// Click on Family & Friends checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		// Click on  Return date from calendar
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).sendKeys(Keys.ENTER);
		
				// select Return date from calendar
		//driver.findElement(By.cssSelector(".ui-state-default")).click();
		
		//click on Passenger list
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
			
		Select s =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("3");
				
		
	}

}
