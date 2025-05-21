package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewSalesOrderPage {
	WebDriver driver;

	public CreatingNewSalesOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="subject")
	private WebElement subjecr_tf;
	@FindBy(xpath="//select[@name='sostatus']")
	private WebElement status_dd;
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement add_oppicon;
	@FindBy(xpath = "(//img[@title='Select'])[4]")
	private WebElement add_orgicon;
	@FindBy(name="bill_street")
	private WebElement billing_address;
	@FindBy(name="ship_street")
	private WebElement shipping_address;
	@FindBy(id="searchIcon1")
	private WebElement add_prooductIcon;
	@FindBy(id="qty1")
	private WebElement qty_tf;
	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")
	private WebElement save_btn;

	/**
	 * @return the subjecr_tf
	 */
	public WebElement getSubjecr_tf() {
		return subjecr_tf;
	}
	/**
	 * @return the status_dd
	 */
	public WebElement getStatus_dd() {
		return status_dd;
	}
	/**
	 * @return the add_oppicon
	 */
	public WebElement getAdd_oppicon() {
		return add_oppicon;
	}
	/**
	 * @return the add_orgicon
	 */
	public WebElement getAdd_orgicon() {
		return add_orgicon;
	}
	/**
	 * @return the billing_address
	 */
	public WebElement getBilling_address() {
		return billing_address;
	}
	/**
	 * @return the shipping_address
	 */
	public WebElement getShipping_address() {
		return shipping_address;
	}
	/**
	 * @return the add_prooductIcon
	 */
	public WebElement getAdd_prooductIcon() {
		return add_prooductIcon;
	}
	/**
	 * @return the qty_tf
	 */
	public WebElement getQty_tf() {
		return qty_tf;
	}
	/**
	 * @return the save_btn
	 */
	public WebElement getSave_btn() {
		return save_btn;
	}
	
	
	
	

}
