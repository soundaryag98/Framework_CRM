package com.comcat.crm.OrgTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcat.crm.generic.ObjectRepositoryUtility.HomePage;
import com.comcat.crm.generic.WebdriverUtility.UtilityClassObject;

public class CreateOrganization__Test extends BaseClass {
	

	@Test(groups = {"smoke"})
	public void createOrg() throws Exception {
		UtilityClassObject.getTest().log(Status.INFO, "generate randomNumber");
		  
		int randomInt = java.getRandomNumber();
		 UtilityClassObject.getTest().log(Status.INFO, "Fetch data from excel(orgName)");
		String orgname = excel.getDataFromExcel("org", 1, 2) + randomInt;
		 UtilityClassObject.getTest().log(Status.INFO, "click on OrgModule");
		homePage.getOrganizations_().click();
		UtilityClassObject.getTest().log(Status.INFO, "click on CreateNewOrg icon");
		orgPage.getCreatenew_org().click();
		UtilityClassObject.getTest().log(Status.INFO, "Create new orgnization ");
		createOrgPage.createOrg(orgname);
		UtilityClassObject.getTest().log(Status.INFO, "Org created,fetch orgname from Header");
		String OrgInfo = orgInfoPage.getHeaderMsg().getText();
		UtilityClassObject.getTest().log(Status.INFO, "Verify created oeg name in header info");
		SoftAssert soft= new SoftAssert();
		UtilityClassObject.getTest().log(Status.INFO, "createSoftAssert Objcet, verify the org info in Header ");
		soft.assertEquals(OrgInfo, orgname);
		UtilityClassObject.getTest().log(Status.INFO, "in  created Org,fetch orgname from Orgname textfield");
		String createdorg = orgInfoPage.getCreateOrgname().getText();
		UtilityClassObject.getTest().log(Status.INFO, "");
		soft.assertEquals(createdorg, orgname);

	}

	@Test(groups = {"regression"})
	public void createOrgWithPhoneNumber() throws Exception {

		int randomInt = java.getRandomNumber();
		String orgname = excel.getDataFromExcel("org", 7, 2) + randomInt;
		String PhoneNumber = excel.getDataFromExcel("org", 7, 3);
		homePage.getOrganizations_().click();
		orgPage.getCreatenew_org().click();
		createOrgPage.createOrg(orgname, PhoneNumber);
		String createdorg = orgInfoPage.getHeaderMsg().getText();
		web.verification(createdorg, orgname);
		String actPhoneNo = orgInfoPage.getCreatedPhoneno().getText();
		web.verification(actPhoneNo, PhoneNumber);
	}

	@Test(groups = {"regression"})
	public void createOrgWithIndus_Type() throws Exception {

		int randomInt = java.getRandomNumber();
		String orgname = excel.getDataFromExcel("org", 4, 2) + randomInt;
		String Industry = excel.getDataFromExcel("org", 4, 3);
		String Type = excel.getDataFromExcel("org", 4, 4);
		homePage = new HomePage(driver);
		homePage.getOrganizations_().click();
		 orgPage.getCreatenew_org().click();
		createOrgPage.createOrg(orgname, Industry, Type);
		String createdorg = orgInfoPage.getCreateOrgname().getText();
		web.verification(createdorg, orgname);
		String actInd = orgInfoPage.getCreateOrgIndustry().getText();
		web.verification(actInd, Industry);
		String actType = orgInfoPage.getCreateOrgType().getText();
		web.verification(actType, Type);

	}
}
