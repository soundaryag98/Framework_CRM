package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformationPage
{
WebDriver driver;
public CampaignInformationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement act_headerinfo;
@FindBy(id="mouseArea_Campaign Name")
private WebElement act_champname;
@FindBy(xpath = "//tr[td[.='Target Audience']]/td[4]")
private WebElement act_closedate;
/**
 * @return the act_headerinfo
 */
public WebElement getAct_headerinfo() {
	return act_headerinfo;
}
/**
 * @return the act_champname
 */
public WebElement getAct_champname() {
	return act_champname;
}
/**
 * @return the act_closedate
 */
public WebElement getAct_closedate() {
	return act_closedate;
}





}
