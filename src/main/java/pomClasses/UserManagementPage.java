package pomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserManagementPage 
{
	static WebDriver driver;
    WebDriverWait wait;
    
	@FindBy (xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;
	
	
//	@FindBy (xpath="(//div[text()='-- Select --'])[1]")
//	private WebElement userRole;
	
	private By userRoleDropdown = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	public UserManagementPage(WebDriver driver)
	{
		 wait = new  WebDriverWait(driver, Duration.ofSeconds(20));
		 this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsernameInAdmin() 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
	      username.sendKeys("Sharad");
	     
	}	
	
//	public void selectUserRole()
//	{
//		
//	      
//	      Select dropDown= new Select(userRole);
//	      
//	    
//	      dropDown.selectByVisibleText("Admin");
//	      
//	      
//	}
	



}
