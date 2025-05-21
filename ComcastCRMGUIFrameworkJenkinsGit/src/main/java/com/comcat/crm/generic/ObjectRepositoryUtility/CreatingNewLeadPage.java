package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public CreatingNewLeadPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="lastname")
	private WebElement last_name;
	@FindBy(name="company")
	private WebElement company_name;
	@FindBy(xpath ="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save_btn;
	/**
	 * @return the last_name
	 */
	public WebElement getLast_name() {
		return last_name;
	}
	/**
	 * @return the company_name
	 */
	public WebElement getCompany_name() {
		return company_name;
	}
	/**
	 * @return the save_btn
	 */
	public WebElement getSave_btn() {
		return save_btn;
	}
	public void createLead(String lastname, String companyname)
	{
		last_name.sendKeys(lastname);
		company_name.sendKeys(companyname);
		save_btn.click();
	}
}
