package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.screenshot;

public class TestListner extends  BaseTest implements ITestListener {

	
	public void onTestStart(ITestResult result) {
	
	System.out.println(result.getName()+" Test has started");
	}
	
	public void onTestFailure (ITestResult result) {
		 try {
			screenshot.takeScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(result.getName()+" Test has fail");
		}
	
    public void onTestSkipped (ITestResult result) {
		
		System.out.println(result.getName()+" Test has skipped");
		}	
    
    public void onTestSuccess (ITestResult result) {
		
		System.out.println(result.getName()+" Test success ");
		}
	
}