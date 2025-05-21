package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public LeadsPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//img[@title='Create Lead...']")
	private WebElement createnew_lead;
	@FindBy(name  = "search_text")
	private WebElement searchtf;
	@FindBy(name  = "submit")
	private WebElement savebtn;
	/**
	 * @return the createnew_org
	 */
	public WebElement getCreatenew_lead() {
		return createnew_lead;
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
