package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshots;

public class Listeners extends BaseTest implements ITestListener{
public void onTestStart (ITestResult result) {
		
		System.out.println("Starting of the test "+result.getName());
	}
	
	public void onTestFailure (ITestResult result) {
		
		try {
			Screenshots.takingScreenshot(driver, result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Failure of the test "+result.getName());
	}
	
	public void onTestSkipped (ITestResult result) {
		System.out.println("Skipped of the test "+result.getName());
	}
	
	public void onTestSuccess (ITestResult result) {
		System.out.println("Passing of the test "+result.getName());
	}


}
