package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.HomePage;
import pomClasses.LoginPage;

public class TestClass
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("WebDriver.chrome.driver", "C:\\Downloaded  Files and Apps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Verify login functionality
//		
//		LoginPage login = new LoginPage(driver);
//		login.sendUserName();
//		login.sendPassword();
//		login.clickOnLoginButton();
		
		//verify homePage fuctionality
		
//		HomePage home = new HomePage(driver);
//		home.verifyAdminTab();
//		home.verifyPTMTab();
//		home.verifyLeaveTab();
		
		
	}


}
