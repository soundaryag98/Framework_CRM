
package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcat.crm.generic.WebdriverUtility.WebDriverUtility;

public class OrganiztionsPage extends WebDriverUtility
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public OrganiztionsPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//img[@title='Create Organization...']")
	private WebElement createnew_org;
	@FindBy(name  = "search_text")
	private WebElement searchtf;
	@FindBy(name  = "submit")
	private WebElement savebtn;
	/**
	 * @return the createnew_org
	 */
	public WebElement getCreatenew_org() {
		return createnew_org;
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
