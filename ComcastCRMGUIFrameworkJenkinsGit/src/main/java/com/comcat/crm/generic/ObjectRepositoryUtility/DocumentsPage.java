package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPage {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public DocumentsPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//img[@title='Create Document...']")
	private WebElement createnew_doc;
	@FindBy(name  = "search_text")
	private WebElement searchtf;
	@FindBy(name  = "submit")
	private WebElement savebtn;
	/**
	 * @return the createnew_org
	 */
	public WebElement getCreatenew_doc() {
		return createnew_doc
				;
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
