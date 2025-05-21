package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcat.crm.generic.WebdriverUtility.WebDriverUtility;

public class CreateOrganiztionsPage extends WebDriverUtility
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public CreateOrganiztionsPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgname_tf;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save_btn;
	@FindBy(xpath="//select[@name='industry']")
	private WebElement org_industry_dd;
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement org_type_dd;
	@FindBy(id="phone")
	private WebElement org_phoneno;
	/**
	 * @return the orgname_tf
	 */
	public WebElement getOrgname_tf() {
		return orgname_tf;
	}
	/**
	 * @return the save_btn
	 */
	public WebElement getSave_btn() {
		return save_btn;
	}
	/**
	 * @return the org_industry_dd
	 */
	public WebElement getOrg_industry_dd() {
		return org_industry_dd;
	}
	/**
	 * @return the org_type_dd
	 */
	public WebElement getOrg_type_dd() {
		return org_type_dd;
	}
	/**
	 * @return the org_phoneno
	 */
	public WebElement getOrg_phoneno() {
		return org_phoneno;
	}
	
	/**create org
	 * @param orgname
	 */
	public void createOrg(String orgname)
	{
		orgname_tf.sendKeys(orgname);
		save_btn.click();
	}
	
	/**
	 * createOrg with Industry and type
	 * @param orgname
	 * @param industry 
	 * @param type 
	 */
	public void createOrg(String orgname, String industry, String type)
	{
		orgname_tf.sendKeys(orgname);
		selectByValue(org_industry_dd, industry);
		selectByValue(org_type_dd, type);
		save_btn.click();
	}
	/**
	 * create org with phone number
	 * @param orgname
	 * @param Phn_no
	 */
	public void createOrg(String orgname,  String Phn_no)
	{
		orgname_tf.sendKeys(orgname);
		org_phoneno.sendKeys(Phn_no);
		save_btn.click();
	}
	
	
	
}
