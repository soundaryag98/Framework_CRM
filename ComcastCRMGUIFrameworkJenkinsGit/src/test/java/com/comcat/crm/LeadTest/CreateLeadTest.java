package com.comcat.crm.LeadTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;

public class CreateLeadTest extends BaseClass{
	@Test
	public void createLead() throws IOException {
		int randomInt = java.getRandomNumber();
		String Lastname = excel.getDataFromExcel("Lead", 1, 2) + randomInt;
		String Companyname = excel.getDataFromExcel("Lead", 1, 3) + randomInt;
		homePage.getLeads_link().click();
		leadsPage.getCreatenew_lead().click();
		createLeadPage.createLead(Lastname, Companyname);
		String act_headerlead =   leadInfoPage.getAct_headerlead().getText();
		web.verification(act_headerlead, Lastname);
		String createdlastname =leadInfoPage.getCreatedlastname().getText();
		web.verification(createdlastname, Lastname);
		String createdCompany = leadInfoPage.getCreatedCompany().getText();
		web.verification(createdCompany, Companyname);
		 
	}
}
