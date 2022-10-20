package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listeners extends SwagLabPageElement implements ITestListener{


WebDriver driver;
	 public void onTestSuccess(ITestResult result)
	 {
		 System.out.println("Test is Successfull" +result.getName());
	 }
	 
	 public void onTestFailure(ITestResult result)
	 {
		try {
			 Screenshot.TakeScreenshot( driver,result.getName());
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 //System.out.println("Test is Failure" +result.getName());

	 }
	 
	 public void onTestSkipped(ITestResult result)
	 {
		 System.out.println("TestIs Skipped "+result.getName());
	 }
	 
	 public void onTestStart(ITestResult result)
	 {
		System.out.println("TestIs Start "+result.getName()); 
	 }

}
