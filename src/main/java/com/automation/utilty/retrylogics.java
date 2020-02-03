package com.automation.utilty;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retrylogics implements IRetryAnalyzer {

	
	int count=0,retrylimit=3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retrylimit)
		{
			count++;
			return true;
		}
		return false;
	}

}
