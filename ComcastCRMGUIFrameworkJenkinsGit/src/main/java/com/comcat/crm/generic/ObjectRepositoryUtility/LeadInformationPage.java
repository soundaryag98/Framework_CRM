package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public LeadInformationPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath =   "//span[@class='dvHeaderText']")
	private WebElement act_headerlead;
	@FindBy(id="mouseArea_Last Name")
	private WebElement createdlastname;
	@FindBy(id="mouseArea_Company")
	private WebElement createdCompany;
	/**
	 * @return the act_headerlead
	 */
	public WebElement getAct_headerlead() {
		return act_headerlead;
	}
	/**
	 * @return the createdlastname
	 */
	public WebElement getCreatedlastname() {
		return createdlastname;
	}
	/**
	 * @return the createdCompany
	 */
	public WebElement getCreatedCompany() {
		return createdCompany;
	}


}
