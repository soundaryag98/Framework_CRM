package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage {
WebDriver driver;

public CreateNewProductPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(name="productname")
private WebElement product_name;
@FindBy(xpath = "//input[@class='crmbutton small save']")
private WebElement save_btn;
 /**
 * @return the product_name
 */
public WebElement getProduct_name() {
	return product_name;
}
/**
 * @return the save_btn
 */
public WebElement getSave_btn() {
	return save_btn;
}

/**
 * createProduct
 * @param Product
 */
public void createProduct(String Product)
 {
	 product_name.sendKeys(Product);
	 save_btn.click();
 }
	

}
