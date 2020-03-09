package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open google 
		driver.get("https://www.google.com/");

		// Take ScreenShot 
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Safwan\\Desktop\\Testing\\Selenium19\\screenshot.png"));
		
		// Maximize browser
		driver.manage().window().maximize();
	}

}
