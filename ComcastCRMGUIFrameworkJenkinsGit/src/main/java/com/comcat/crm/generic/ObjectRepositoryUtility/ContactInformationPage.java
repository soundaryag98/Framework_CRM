package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage
{
WebDriver driver;
public ContactInformationPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement act_headerInfo;
@FindBy(id="mouseArea_Last Name")
private WebElement act_lastname;
@FindBy(id="mouseArea_Organization Name")
private WebElement createdOrg;

@FindBy(id="dtlview_Support Start Date")
private WebElement act_startedDate;
@FindBy(id="mouseArea_Support End Date")
private WebElement act_endedDate;

/**
 * @return the act_startedDate
 */
public WebElement getAct_startedDate() {
	return act_startedDate;
}
/**
 * @return the act_endedDate
 */
public WebElement getAct_endedDate() {
	return act_endedDate;
}
/**
 * @return the createdOrg
 */
public WebElement getCreatedOrg() {
	return createdOrg;
}
/**
 * @return the act_headerInfo
 */
public WebElement getAct_headerInfo() {
	return act_headerInfo;
}
/**
 * @return the act_lastname
 */
public WebElement getAct_lastname() {
	return act_lastname;
}


}
