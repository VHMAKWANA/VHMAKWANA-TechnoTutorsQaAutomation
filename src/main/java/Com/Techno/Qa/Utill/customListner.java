package Com.Techno.Qa.Utill;


import org.testng.ITestListener;
import org.testng.ITestResult;

import Com.Techno.Qa.Base.TechnoBase;

public class customListner extends TechnoBase implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		System.out.println("failed test");
		 failed(result.getMethod().getMethodName());
		
		
	}
	

}
