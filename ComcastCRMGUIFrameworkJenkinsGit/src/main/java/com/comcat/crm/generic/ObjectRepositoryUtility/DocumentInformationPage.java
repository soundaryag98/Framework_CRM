package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentInformationPage
{
	WebDriver driver;
public DocumentInformationPage(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement Act_Document;
@FindBy(id ="mouseArea_Title")
private WebElement createdTitle;
@FindBy(xpath = "(//td[@class='dvtCellInfo'])[7]")
private WebElement act_des;

/**
 * @return the act_des
 */
public WebElement getAct_des() {
	return act_des;
}
/**
 * @return the act_Document
 */
public WebElement getAct_Document() {
	return Act_Document;
}
/**
 * @return the createdTitle
 */
public WebElement getCreatedTitle() {
	return createdTitle;
}

}