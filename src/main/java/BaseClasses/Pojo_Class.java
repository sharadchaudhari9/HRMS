package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo_Class
{
	public static WebDriver openBrowser()
	{
	System.setProperty("WebDriver.chrome.driver", "C:\\Downloaded  Files and Apps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	 driver.manage().window().maximize();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	return driver;

	}
}
