package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.qaclickacademy.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='NO THANKS']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[text()='Practice']")).click();

		System.out.println(driver.getTitle());
		
	}

}
