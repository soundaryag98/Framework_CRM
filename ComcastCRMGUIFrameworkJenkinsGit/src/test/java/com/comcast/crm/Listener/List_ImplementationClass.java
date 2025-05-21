package com.comcast.crm.Listener;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcat.crm.generic.WebdriverUtility.UtilityClassObject;

public class List_ImplementationClass implements ITestListener, ISuiteListener

{
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public   ExtentTest test;
	@Override
	public void onStart(ISuite suite) {
		 
		ISuiteListener.super.onStart(suite);
		System.out.println("Report Configuration");
		String time= new Date().toString().replace(" ", "_").replace(":", "_");
		/** 
		 * spark report Config
		 */
		spark= new ExtentSparkReporter("./AdvanceReports/reoprt"+"_"+suite.getName()+time+".html");
		spark.config().setDocumentTitle("Crm test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		/** 
		 * add env info And create test
		 */
	  report= new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Envi", "Testing_server");
		report.setSystemInfo("Browser", "Chrome");
	}

	@Override
	public void onFinish(ISuite suite) {
		 
		ISuiteListener.super.onFinish(suite);
		System.out.println("Report backup");
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		 
		ITestListener.super.onTestStart(result);
		System.out.println("==========="+result.getMethod().getMethodName()+"====================");
		  test = report.createTest(result.getMethod().getMethodName());
		  UtilityClassObject.setTest(test);
		  test.log(Status.INFO, result.getMethod().getMethodName()+"==>STARTED<==");
		 // test.log(Status.INFO, result.getAttributeNames().getClass().);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("==========="+result.getMethod().getMethodName()+"======END==============");
		test.log(Status.PASS, result.getMethod().getMethodName()+"==>COMPLETED<==");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		String testName = result.getMethod().getMethodName();
		String time= new Date().toString().replace(" ", "_").replace(":", "_");
		TakesScreenshot takesScreenshot = (TakesScreenshot)UtilityClassObject.driver;
		String filePath = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(filePath, testName+"_"+time);
		test.log(Status.FAIL, result.getMethod().getMethodName()+"==>FAILEDE<==");
		}


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		test.log(Status.SKIP, result.getMethod().getMethodName()+"==>SKIPPED<==");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		test.log(Status.INFO,result.getThrowable().getStackTrace()+ "");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		 
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
}
