package pomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	static WebDriver driver;
	  WebDriverWait wait;
	
	@FindBy (xpath="//span[text()='Admin']")
	private WebElement Admin;
	

//	
//	@FindBy (xpath="//span[text()='PIM']")
//	private WebElement PTM;
//
//	@FindBy (xpath="//span[text()='Leave']")
//	private WebElement Leave;
//	
//	@FindBy (xpath="//span[text()='Time']")
//	 private WebElement Time;
//	
//	@FindBy (xpath="//span[text()='Recruitment']")
//	private WebElement Recruitment;
//	
//	@FindBy (xpath="//span[text()='My Info']")
//	private WebElement My_Info;
//	
//	@FindBy (xpath="//span[text()='Performance']")
//	private WebElement Performans;
//	
//	@FindBy (xpath="//span[text()='Dashboard']")
//	private WebElement Dashboard;
//	
//	@FindBy (xpath="//span[text()='Directory']")
//	private WebElement Directory;
//	
//	@FindBy (xpath="//span[text()='Maintenance']")
//	private WebElement Maintenance;
//	
//	@FindBy (xpath="//span[text()='Claim']")
//	private WebElement Claim;
//	
//	@FindBy (xpath="//span[text()='Buzz']")
//	private WebElement Buzz;
	
	
	
	
	
	public HomePage(WebDriver driver)
	{
		 wait = new  WebDriverWait(driver, Duration.ofSeconds(20));
		 this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyAdminTab() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
	Admin.isDisplayed();
	
	   System.out.println("Admin tab displayed");
	   Admin.click();
	   
	return true;
	
	}
	
	
	
	
	

	
	
//	public void verifyPTMTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PIM']")));
//		PTM.isDisplayed();
//		   System.out.println("PTM tab displayed");
//	}
//
//    public void verifyLeaveTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leave']")));
//		Leave.isDisplayed();
//		    System.out.println("Leave tab displayed");
//	}
//	
//	public void verifyTimeTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Time']")));
//		Time.isDisplayed();
//		    System.out.println("Time tab is Displayed");
//	}
//	
//	public void verifyRecruitmentTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Recruitment']")));
//	Recruitment.isDisplayed();
//	System.out.println("Recruitment tab displayed");
//	}
//	
//	public void verifyMy_InfoTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Info']")));
//		My_Info.isDisplayed();
//		System.out.println("My Info tab displayed");
//	}
//	
//	public void verifyPerformansTab()
//	{
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Performance']")));
//		Performans.isDisplayed();
//		System.out.println("Performance tab displayed");
//	}
//	
//	public void verifyDashboardTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
//		Dashboard.isDisplayed();
//		System.out.println("Dashboard tab displayed");
//	}
//	
//	public void verifyDirectoryTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Directory']")));
//		Directory.isDisplayed();
//	System.out.println("Directory tab displayed");
//	}
//	
//	public void verifyMaintanenceTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Maintenance']")));
//		Maintenance.isDisplayed();
//		System.out.println("Maintainance tab displayed");
//	}
//	
//	public void verifyClaimTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Claim']")));
//		Claim.isDisplayed();
//	System.out.println("Claim tab displayed");
//	}
//	
//	public void verifyBuzzTab()
//	{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Buzz']")));
//		Buzz.isDisplayed();
//		System.out.println("Buzz tab displayed");
//	}
//	
	


}
