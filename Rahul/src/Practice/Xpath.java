package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		//Cilck on Selenium Button
		//driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		
		driver.findElement(By.xpath("//li[@id='tablist1-tab2']")).click();
		
		Thread.sleep(2000);
		
		//Cilck on Soup UI Button
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		
		Thread.sleep(2000);
		
		//Cilck on Testing Button
		driver.findElement(By.xpath("//li[@class='responsive-tabs__list__item' and @id='tablist1-tab4']")).click();

		 System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	}

}
