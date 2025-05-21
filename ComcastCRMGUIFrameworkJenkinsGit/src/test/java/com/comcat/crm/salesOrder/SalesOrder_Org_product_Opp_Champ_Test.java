package com.comcat.crm.salesOrder;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;

public class SalesOrder_Org_product_Opp_Champ_Test extends BaseClass {
	@Test
	public void end() throws IOException, InterruptedException {

		// generate random number
		int randomInt = java.getRandomNumber();
		String orgname = excel.getDataFromExcel("org", 1, 2) + randomInt;
		String Product = excel.getDataFromExcel("Campaigns", 1, 3) + randomInt;
		String salesStage = excel.getDataFromExcel("Opportunitytc", 3, 3);
		String Champ_name = excel.getDataFromExcel("Campaigns", 1, 2) + randomInt;
		String closedate = java.getRequiredDateddMMyyyy(15);
		String subject = excel.getDataFromExcel("SalesOrderTc", 1, 2) + randomInt;
		String Subject_status = excel.getDataFromExcel("SalesOrderTc", 2, 3);
		String billingaddress = excel.getDataFromExcel("SalesOrderTc", 1, 4);
		String Shipingaddress = excel.getDataFromExcel("SalesOrderTc", 1, 5);
		String quantity = excel.getDataFromExcel("SalesOrderTc", 1, 6) + randomInt;
		String oportunity_name = excel.getDataFromExcel("Opportunitytc", 1, 2) + randomInt;
		homePage.getOrganizations_().click();
		createOrgPage.createOrg(orgname);
		String OrgInfo = orgInfoPage.getHeaderMsg().getText();
		web.verification(OrgInfo, orgname);
		String createdorg = orgInfoPage.getCreateOrgname().getText();
		web.verification(createdorg, orgname);
		/**
		 * createProduct
		 */
		homePage.getProducts_link().click();
		productsPage.getCreateproducticon().click();
		createProductPage.createProduct(Product);
		String actProduct = productInfoPage.getActProduct().getText();
		web.verification(actProduct, Product);
		String headerproinfo = productInfoPage.getProductheaderproinfo().getText();
		web.verification(headerproinfo, Product);
		homePage.navigateToCampaginPage(driver);
		campaignsPage.getCreateChampIcon().click();
		String closedate1 = java.getRequiredDateddMMyyyy(12);
		createCampaignsPage.createChampWDates(Champ_name, closedate1);
		String act_headerinfo = campaignInfoPage.getAct_headerinfo().getText();
		web.verification(act_headerinfo, Champ_name);
		String act_champname = campaignInfoPage.getAct_champname().getText();
		web.verification(act_champname, Champ_name);
		String act_closedate = campaignInfoPage.getAct_closedate().getText();
		web.verification(act_closedate, closedate);
		homePage.getOpportunities_link().click();
		opportunitiesPage.getCreatenew_opp().click();
		createOpportunityPage.getOpp_name().sendKeys(oportunity_name);
		createOpportunityPage.getAdd_org_icon().click();
		web.switchToBrowserBasedOnUrl(driver, "srcmodule=Potentials&forrecord=");
		searchInpopPage.getSearchTf().sendKeys(orgname);
		searchInpopPage.getSearch_button().click();
		driver.findElement(By.xpath("//a[.='" + orgname + "']")).click();
		web.switchToBrowserBasedOnUrl(driver, "action=DetailView&parenttab=Sales");
		createOpportunityPage.getAdd_cam_icon().click();
		web.switchToBrowserBasedOnUrl(driver, "Campaigns&action");
		searchInpopPage.getSearchTf().sendKeys(Champ_name);
		searchInpopPage.getSearch_button().click();
		driver.findElement(By.xpath("//a[.='" + Champ_name.trim() + "']")).click();
		web.switchToBrowserBasedOnUrl(driver, "Potentials&action");
		createOpportunityPage.getExpected_closingdate().clear();
		createOpportunityPage.getExpected_closingdate().sendKeys(closedate);
		web.selectByValue(createOpportunityPage.getSalesStage(), salesStage);
		createOpportunityPage.getSave_btn().click();
		homePage.navigateToSalesOrder(driver);
		salesOrderPage.getcreatenew_so().click();
		createSalesOrderPage.getSubjecr_tf().sendKeys(subject);
		web.selectByValue(createSalesOrderPage.getStatus_dd(), Subject_status);
		createSalesOrderPage.getAdd_oppicon().click();
		web.switchToBrowserBasedOnUrl(driver, "Potentials&action");
		searchInpopPage.getSearchTf().sendKeys(oportunity_name);
		searchInpopPage.getSearch_button().click();
		driver.findElement(By.xpath("//a[.='" + oportunity_name.trim() + "']")).click();
		web.switchToBrowserBasedOnUrl(driver, "SalesOrder&action");
		createSalesOrderPage.getAdd_orgicon().click();
		web.switchToBrowserBasedOnUrl(driver, "TasksEditView");
		searchInpopPage.getSearchTf().sendKeys(orgname);
		searchInpopPage.getSearch_button().click();
		driver.findElement(By.xpath("//a[.='" + orgname + "']")).click();
		web.switchToAlertAccept(driver);
		web.switchToBrowserBasedOnUrl(driver, "SalesOrder&action");
		createSalesOrderPage.getBilling_address().sendKeys(billingaddress);
		createSalesOrderPage.getShipping_address().sendKeys(Shipingaddress);
		web.scrollTOEle(createSalesOrderPage.getAdd_prooductIcon(), driver);
		createSalesOrderPage.getAdd_prooductIcon().click();
		web.switchToBrowserBasedOnUrl(driver, "Products&action");
		searchInpopPage.getSearchTf().sendKeys(Product);
		searchInpopPage.getSearch_button().click();
		driver.findElement(By.xpath("//a[.='" + Product + "']")).click();
		web.switchToBrowserBasedOnUrl(driver, "SalesOrder&action");
		createSalesOrderPage.getQty_tf().sendKeys(quantity);
		createSalesOrderPage.getSave_btn().click();

	}

}
