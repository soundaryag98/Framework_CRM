package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganiztionsInfoPage {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public OrganiztionsInfoPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headerMsg;
	@FindBy(id="mouseArea_Phone")
	private WebElement createdPhoneno;
	@FindBy(id="mouseArea_Organization Name")
	private WebElement createOrgname;
	@FindBy(id="dtlview_Industry")
	private WebElement createOrgIndustry;
	@FindBy(id="dtlview_Type")
	private WebElement createOrgType;
	/**
	 * @return the headerMsg
	 */
	public WebElement getHeaderMsg() {
		return headerMsg;
	}
	/**
	 * @return the createdPhoneno
	 */
	public WebElement getCreatedPhoneno() {
		return createdPhoneno;
	}
	/**
	 * @return the createOrgname
	 */
	public WebElement getCreateOrgname() {
		return createOrgname;
	}
	/**
	 * @return the createOrgIndustry
	 */
	public WebElement getCreateOrgIndustry() {
		return createOrgIndustry;
	}
	/**
	 * @return the createOrgType
	 */
	public WebElement getCreateOrgType() {
		return createOrgType;
	}
	
	

}
