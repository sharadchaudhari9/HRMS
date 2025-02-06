package TestClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassB_TestNG
{
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass_TestClassB");
	}

	@BeforeMethod
	  public void beforemethod()
	  {
		System.out.println("BeforeMethod_TestClassB");
	  }

	@Test
	public void testA()
	{
		System.out.println("TestA_TestClassB");
	}

	@Test
	public void testB()
	{
		System.out.println("TestB_TestClassB");
	}



	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod_TestClassB");
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("AfterClass_TestClassB");
	}



}
