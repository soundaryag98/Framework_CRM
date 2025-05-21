package practise;


import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
@Listeners(com.comcast.crm.Listener.List_ImplementationClass.class)
public class InvoiceTest extends BaseClass{
	@Test
	public void createInvoiceTest()
	{
		System.out.println("Step1");
		
		String actTit = driver.getTitle();
		System.out.println("Step2");
		System.out.println("Step3");
		Assert.assertEquals(actTit, "LOgin");
		System.out.println("Step4");
		System.out.println("Step5");
		System.out.println("Step6");
		System.out.println("Step7");
	}
	@Test
	public void createInvoiceTestWithContat()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
		System.out.println("Step4");
		System.out.println("Step5");
		System.out.println("Step6");
		String time= new Date().toString().replace(" ", "_").replace(":", "_");
		System.out.println(time);
		System.out.println("Step7");
	}
	@Test(retryAnalyzer = com.comcast.crm.Listener.retryImplementationClass.class)
	public void activateSim()
	{
		System.out.println("Step1");
		
		String actTit = driver.getTitle();
		System.out.println("Step2");
		System.out.println("Step3");
		Assert.assertEquals(actTit, "LOgin");
		System.out.println("Step4");
		System.out.println("Step5");
		System.out.println("Step6");
		System.out.println("Step7");
	}

}
