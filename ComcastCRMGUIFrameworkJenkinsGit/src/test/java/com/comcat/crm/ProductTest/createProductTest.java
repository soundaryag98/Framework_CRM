package com.comcat.crm.ProductTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;

public class createProductTest extends BaseClass {
	@Test
	public void create_Product() throws IOException {
		int randomInt = java.getRandomNumber();
		String Product = excel.getDataFromExcel("Campaigns", 1, 3) + randomInt;
		homePage.getProducts_link().click();
		productsPage.getCreateproducticon().click();
		createProductPage.createProduct(Product);
		String actProduct = productInfoPage.getActProduct().getText();
		web.verification(actProduct, Product);
		// Verification****headerProdInfo
		String headerproinfo = productInfoPage.getProductheaderproinfo().getText();
		web.verification(headerproinfo, Product);
	}
}
