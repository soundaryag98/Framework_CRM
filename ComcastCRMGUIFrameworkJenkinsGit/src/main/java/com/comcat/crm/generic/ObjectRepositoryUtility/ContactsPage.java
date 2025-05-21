package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public ContactsPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//img[@title='Create Contact...']")
	private WebElement createnew_contact;
	@FindBy(name  = "search_text")
	private WebElement searchtf;
	@FindBy(name  = "submit")
	private WebElement savebtn;
	/**
	 * @return the createnew_org
	 */
	public WebElement getcreatenew_contact() {
		return createnew_contact;
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
