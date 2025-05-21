package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage
{
WebDriver driver;
public OpportunitiesPage(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath  = "//img[@title='Create Opportunity...']")
private WebElement createnew_opp;
@FindBy(name  = "search_text")
private WebElement searchtf;
@FindBy(name  = "submit")
private WebElement savebtn;
/**
 * @return the createnew_opp
 */
public WebElement getCreatenew_opp() {
	return createnew_opp;
}
/**
 * @return the searchtf
 */
public WebElement getSearchtf() {
	return searchtf;
}
/**
 * @return the savebtn
 */
public WebElement getSavebtn() {
	return savebtn;
}

}
