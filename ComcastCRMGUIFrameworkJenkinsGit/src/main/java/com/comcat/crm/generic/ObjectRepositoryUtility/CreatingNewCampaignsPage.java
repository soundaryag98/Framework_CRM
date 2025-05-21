package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewCampaignsPage {
	WebDriver driver;
	public CreatingNewCampaignsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(name="campaignname")
private WebElement campaignname_tf;
@FindBy(id="jscal_field_closingdate")
private WebElement c_closingDate;
@FindBy(xpath="//input[@class='crmButton small save']")
private WebElement save_btn;
@FindBy(xpath = "//img[@title='Select']")
private WebElement addproducticon;

/**
 * @return the addproducticon
 */
public WebElement getAddproducticon() {
	return addproducticon;
}

/**
 * @return the campaignname_tf
 */
public WebElement getCampaignname_tf() {
	return campaignname_tf;
}

/**
 * @return the c_closingDate
 */
public WebElement getC_closingDate() {
	return c_closingDate;
}

/**
 * @return the save_btn
 */
public WebElement getSave_btn() {
	return save_btn;
}

public void createChampWDates(String Campname, String closingDate)
{
	campaignname_tf.sendKeys(Campname);
	c_closingDate.clear();
	c_closingDate.sendKeys(closingDate);
	save_btn.click();
	
}
}
