package com.comcast.crm.Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryImplementationClass   implements IRetryAnalyzer
{
	int count=0;
	int limit=5;
	@Override
	
	public boolean retry(ITestResult result) {
		if(count<limit) {
			count++;
			return true;
		}
		return false;
	}

}
