package practise;

import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleTest_ExtentReports {
	public ExtentSparkReporter spark;
	public ExtentReports report;

	@BeforeSuite
	public void BS() {
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");
		spark.config().setDocumentTitle("Crm test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Envi", "Testing_server");
		report.setSystemInfo("Browser", "Chrome");
	}

	@AfterSuite
	public void AS() {
		report.flush();
	}

	@Test
	public void createContact(Method mthd) {

		ExtentTest test = report.createTest(mthd.getName());
		test.log(Status.INFO, "login to application");
		test.log(Status.INFO, "navigate to contacte Page");
		test.log(Status.INFO, "Create contact");
		test.log(Status.INFO, "login to application");
		if ("test".equals("test")) {

			test.log(Status.PASS, "contact created");
		} else {

			test.log(Status.FAIL, "contact  not created");
		}
		
		System.out.println("logged in");

	}
	@Test
	public void createContactWithORg(Method mthd) {
		
		ExtentTest test = report.createTest(mthd.getName());
		test.log(Status.INFO, "login to application");
		test.log(Status.INFO, "navigate to contacte Page");
		test.log(Status.INFO, "Create contact");
		test.log(Status.INFO, "login to application");
		if ("test".equals("test")) {
			
			test.log(Status.PASS, "contact created");
		} else {
			
			test.log(Status.FAIL, "contact  not created");
		}
		
		System.out.println("logged in");
		
	}
	@Test
	public void createContactwithPhoneNUmber(Method mthd) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php");
		TakesScreenshot edriver=(TakesScreenshot)driver;
		String screenshootpath = edriver.getScreenshotAs(OutputType.BASE64);

		ExtentTest test = report.createTest(mthd.getName());
		test.log(Status.INFO, "login to application");
		test.log(Status.INFO, "navigate to contacte Page");
		test.log(Status.INFO, "Create contact");
		test.log(Status.INFO, "login to application");
		if ("".equals("test")) {
			
			test.log(Status.PASS, "contact created");
		} else {
			
			test.addScreenCaptureFromBase64String(screenshootpath,mthd.getName());
		}
		
		System.out.println("logged in");
		
	}
}
