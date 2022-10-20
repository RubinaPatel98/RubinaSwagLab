package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pojo.browser;
import pom.SwagLabPage;

@Listeners(utility.Listeners.class)



public class SwagLabLoginTest {

	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		driver=browser.openBrowser("https://www.saucedemo.com/");
	}
	
	@Test
	public void validateSwagLoginPage()
	{
		SwagLabPage swagLabPage= new SwagLabPage(driver);
		swagLabPage.enterUsername("User_name");
		swagLabPage.enterPassword("gdhhjj");
		swagLabPage.clickOnLogin();
		
	}
	/*@AfterMethod()
	public void captureResults(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, result.getName());
		}
	}*/
	
	
}
