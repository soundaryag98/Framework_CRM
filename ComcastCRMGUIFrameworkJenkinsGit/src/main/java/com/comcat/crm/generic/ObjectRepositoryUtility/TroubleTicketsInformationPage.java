package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketsInformationPage {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public TroubleTicketsInformationPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement act_title;
	@FindBy(id="mouseArea_Description")
	private WebElement act_des;
	@FindBy(id="dtlview_Status")
	private WebElement act_status ;
	@FindBy(className = "dvHeaderText")
	private WebElement createdheaderinfo__tt;
	/**
	 * @return the act_title
	 */
	public WebElement getAct_title() {
		return act_title;
	}
	/**
	 * @return the act_des
	 */
	public WebElement getAct_des() {
		return act_des;
	}
	/**
	 * @return the act_status
	 */
	public WebElement getAct_status() {
		return act_status;
	}
	/**
	 * @return the createdheaderinfo__tt
	 */
	public WebElement getCreatedheaderinfo__tt() {
		return createdheaderinfo__tt;
	}

}
