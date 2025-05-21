package com.comcat.crm.Champ;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;

public class CreateCampaign extends BaseClass {

	@Test
	public void createCampaignWithClosedateTest() throws IOException {
		int randomInt = java.getRandomNumber();
		String Champ_name = excel.getDataFromExcel("Campaigns", 1, 2) + randomInt;
		homePage.navigateToCampaginPage(driver);
		campaignsPage.getCreateChampIcon().click();
		String closedate = java.getRequiredDateddMMyyyy(12);
		createCampaignsPage.createChampWDates(Champ_name, closedate);
		String act_headerinfo = campaignInfoPage.getAct_headerinfo().getText();
		web.verification(act_headerinfo, Champ_name);
		String act_champname = campaignInfoPage.getAct_champname().getText();
		web.verification(act_champname, Champ_name);
		String act_closedate = campaignInfoPage.getAct_closedate().getText();
		web.verification(act_closedate, closedate);
	}
	@Test
	public void createchampwithProduct() throws EncryptedDocumentException, IOException {
		int randomInt = java.getRandomNumber();
		String Product = excel.getDataFromExcel("Campaigns", 1, 3) + randomInt;
		String Champ_name = excel.getDataFromExcel("Campaigns", 1, 2) + randomInt;
		homePage.getProducts_link().click();
		productsPage.getCreateproducticon().click();
		createProductPage.createProduct(Product);
		String actProduct = productInfoPage.getActProduct().getText();
		web.verification(actProduct, Product);
		String headerproinfo = productInfoPage.getProductheaderproinfo().getText();
		web.verification(headerproinfo, Product);
		homePage.navigateToCampaginPage(driver);
		campaignsPage.getCreateChampIcon().click();
		createCampaignsPage.getCampaignname_tf().sendKeys(Champ_name);
		createCampaignsPage.getAddproducticon().click();
		web.switchToBrowserBasedOnUrl(driver, "module=Products&action");
		searchInpopPage.getSearchTf().sendKeys(Product);
		searchInpopPage.getSearch_button().click();
		driver.findElement(By.xpath("//a[.='" + Product + "']")).click();
		web.switchToBrowserBasedOnUrl(driver, "Campaigns");
		String closedate = java.getRequiredDateddMMyyyy(12);
		createCampaignsPage.getC_closingDate().clear();
		createCampaignsPage.getC_closingDate().sendKeys(closedate);
		createCampaignsPage.getSave_btn().click();
		String act_headerinfo = campaignInfoPage.getAct_headerinfo().getText();
		web.verification(act_headerinfo, Champ_name);
		String act_champname = campaignInfoPage.getAct_champname().getText();
		web.verification(act_champname, Champ_name);
		String act_closedate = campaignInfoPage.getAct_closedate().getText();
		web.verification(act_closedate, closedate);
	}


}
