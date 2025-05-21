package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage
{WebDriver driver;

public ProductInformationPage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="dtlview_Product Name")
private WebElement actProduct;
/**
 * @return the actProduct
 */
public WebElement getActProduct() {
	return actProduct;
}
/**
 * @return the productheaderproinfo
 */
public WebElement getProductheaderproinfo() {
	return Productheaderproinfo;
}
@FindBy(xpath = "//span[@class='lvtHeaderText']")
private WebElement Productheaderproinfo;

}
