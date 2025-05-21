package com.comcat.crm.OtherTest;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.comcast.crm.basetest.BaseClass;

public class CreateProjectTask extends BaseClass {
	@Test
	public void createProjectTask_WithProject() throws IOException {

		int randomInt = java.getRandomNumber();
		String projectname = excel.getDataFromExcel("QuickCreate", 1, 2) + randomInt;
		String P_startdate = java.getSystemCurrentDateddMMyyyy();
		String taskname = excel.getDataFromExcel("QuickCreate", 1, 5) + randomInt;
		String createProjectbyvalue = excel.getDataFromExcel("QuickCreate", 13, 6);
		String createProjectTaskbyvalue = excel.getDataFromExcel("QuickCreate", 15, 6);
		String P_enddate = java.getRequiredDateddMMyyyy(280);
		homePage.getProducts_link().click();
		homePage.selectInquickcreatedd(createProjectbyvalue);
		createProjectPage.createProject(projectname, P_startdate, P_enddate);
		String act_projectheader = projectInfoPage.getAct_projectheader().getText();
		web.verification(act_projectheader, projectname);
		String act_projectname = projectInfoPage.getAct_projectname().getText();
		web.verification(act_projectname, projectname);
		homePage.selectInquickcreatedd(createProjectTaskbyvalue);
		createProjectTaskPage.createProjectTask(taskname, P_startdate);
		web.switchToBrowserBasedOnUrl(driver, "module=Project&action");
		searchInpopPage.search(projectname);
		driver.findElement(By.xpath("//a[.='" + projectname + "']")).click();
		web.switchToBrowserBasedOnUrl(driver, "parenttab");
		createProjectTaskPage.getSave_btn().click();
		String act_taskheaderinfo = projectTaskInfoPage.getP_taskHeaderinfo().getText();
		web.verification(act_taskheaderinfo, taskname);
		String related_project = driver.findElement(By.xpath("//a[.='" + projectname.trim() + "']")).getText();
		web.verification(related_project, projectname);
		String act_TaskInfo = projectTaskInfoPage.getAct_taskname().getText();
		web.verification(act_TaskInfo, taskname);

	}
}