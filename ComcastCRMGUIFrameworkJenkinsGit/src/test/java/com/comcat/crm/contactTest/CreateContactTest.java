package com.comcat.crm.contactTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.comcast.crm.basetest.BaseClass;


public class CreateContactTest extends BaseClass {
	
	 

	@Test(groups= {"smoke"})
	public void createContact() throws Exception {
		int randomInt = java.getRandomNumber();
		String Lastname = excel.getDataFromExcel("contact", 1, 2) + randomInt;
		homePage.getContacts_link().click();
		contactPage.getcreatenew_contact().click();
		 createContactPage.createContact(Lastname);
		String actLastName = contactInfoPage.getAct_lastname().getText();
		web.verification(actLastName, Lastname);
		String act_headerInfo = contactInfoPage.getAct_headerInfo().getText();
		web.verification(act_headerInfo, Lastname);
	}

	@Test(groups= {"regression"})
	public void createcontactWithOrg() throws Exception {

		// generate random number
		int randomInt = java.getRandomNumber();
		String orgname = excel.getDataFromExcel("contact", 7, 2) + randomInt;
		String contactLastName = excel.getDataFromExcel("contact", 7, 3) + randomInt;
		homePage.getOrganizations_().click();
		orgPage.getCreatenew_org().click();
		createOrgPage.createOrg(orgname);
		String OrgInfo = orgInfoPage.getHeaderMsg().getText();
		web.verification(OrgInfo, orgname);
		String createdorg = orgInfoPage.getCreateOrgname().getText();
		web.verification(createdorg, orgname);
		homePage.getContacts_link().click();
		contactPage.getcreatenew_contact().click();
		createContactPage.getLastname_tf().sendKeys(contactLastName);
		createContactPage.getAddorgicon().click();
		web.switchToBrowserBasedOnUrl(driver, "module=Accounts&action");
		searchInpopPage.getSearchTf().sendKeys(orgname);
		searchInpopPage.getSearch_button().click();
		driver.findElement(By.xpath("//a[.='" + orgname.trim() + "']")).click();
		web.switchToBrowserBasedOnUrl(driver, "module=Contacts&action");
		createContactPage.getSave_btn().click();
		String actLastName = contactInfoPage.getAct_lastname().getText();
		web.verification(actLastName, contactLastName);
		String act_headerInfo = contactInfoPage.getAct_headerInfo().getText();
		web.verification(act_headerInfo, contactLastName);
		String actOrgname = contactInfoPage.getCreatedOrg().getText();
		web.verification(actOrgname, orgname);
	}

	@Test(groups= {"regression"})
	public void createContactWithDate() throws Exception 
	{
		int randomInt = java.getRandomNumber();
		String Lastname = excel.getDataFromExcel("contact", 1, 2) + randomInt;
		homePage.getContacts_link().click();
		contactPage.getcreatenew_contact().click();
		String startdate = java.getSystemCurrentDateddMMyyyy();
		String Enddate = java.getRequiredDateddMMyyyy(30);
		createContactPage.createContactWithDates(Lastname, startdate, Enddate);
		String actLastName = contactInfoPage.getAct_lastname().getText();
		web.verification(actLastName, Lastname);
		String act_headerInfo = contactInfoPage.getAct_headerInfo().getText();
		web.verification(act_headerInfo, Lastname);
		String actStartdate = contactInfoPage.getAct_startedDate().getText();
		web.verification(actStartdate, startdate);
		String actEndDate = contactInfoPage.getAct_endedDate().getText();
		web.verification(actEndDate, Enddate);
	}
}
