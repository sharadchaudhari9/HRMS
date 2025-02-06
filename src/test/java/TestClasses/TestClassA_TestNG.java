package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClasses.Pojo_Class;
import pomClasses.UserManagementPage;
import pomClasses.HomePage;
import pomClasses.LoginPage;

public class TestClassA_TestNG extends Pojo_Class
	{
		WebDriver driver;

		
		
	@BeforeClass
	public void beforeclass()
	{
	WebDriver driver = openBrowser();
	 this.driver=driver;
	}


	@Test(priority=0)

	public void verifyLoginPage() 

	{
		
		LoginPage login = new LoginPage(driver);
		login.sendUsername();
		login.sendPassword();
		login.clickOnLoginButton();
	
		String ActualURL = driver.getCurrentUrl();
		
		System.out.println(ActualURL);
	
	//	String ExceptedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
	//	Assert.assertEquals(ExceptedURL, ActualURL);
		
		

	}

	@Test(priority=1)

	public void verifyHomePage() throws InterruptedException
	{
		HomePage home = new HomePage(driver);
		
	boolean result = home.verifyAdminTab();
	
	Assert.assertTrue(result);
		
	
		
	//	Assert.assertFalse(result);
	 
//		home.verifyPTMTab();
//	 
//		home.verifyLeaveTab();
//		
//	home.verifyTimeTab();
//		
//	home.verifyRecruitmentTab();
//		
//		home.verifyMy_InfoTab();
//		
//	    home.verifyPerformansTab();
//		
//		home.verifyDashboardTab();
//		
//	    home.verifyDirectoryTab();
//		
//		home.verifyMaintanenceTab();
//		
//		home.verifyClaimTab();
//		
//		home.verifyBuzzTab();
		
		

	}
	
	
	
	@Test(priority=2)
	public void sendUsernameInAdmin() 
	{
		
		UserManagementPage Admin=new UserManagementPage(driver);	
		Admin.sendUsernameInAdmin();
		
		
	}
	
//	@Test(priority=3)
//	public void sendUserRole() 
//	{
//		UserManagementPage Admin1=new UserManagementPage(driver);
//		
//		Admin1.selectUserRole();
//		
//		
//		}
//	
	
	
	



		
		









	//@Test
	//
	//public void screenshot() throws IOException
	//{
//		ScreenShot.captureScreenShot(driver);
	//	
//		System.out.println("Sucessfully captured screenshot");
	//	
	//}







	@AfterClass
	   public void afterclass()
	   {
		
	   }



	


}
