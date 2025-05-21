package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOpportunityPage
{
	WebDriver driver;
	public CreatingNewOpportunityPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="potentialname")
	private WebElement opp_name;
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement add_org_icon;
	@FindBy(xpath = "(//img[@title='Select'])[2]")
	private WebElement add_cam_icon;
	@FindBy(name="closingdate")
	private WebElement expected_closingdate;
	@FindBy(xpath="//select[@name='sales_stage']")
	private WebElement salesStage;
	@FindBy(name="button")
	private WebElement save_btn;
	/**
	 * @return the save_btn
	 */
	public WebElement getSave_btn() {
		return save_btn;
	}
	/**
	 * @return the opp_name
	 */
	public WebElement getOpp_name() {
		return opp_name;
	}
	/**
	 * @return the add_org_icon
	 */
	public WebElement getAdd_org_icon() {
		return add_org_icon;
	}
	/**
	 * @return the add_cam_icon
	 */
	public WebElement getAdd_cam_icon() {
		return add_cam_icon;
	}
	/**
	 * @return the expected_closingdate
	 */
	public WebElement getExpected_closingdate() {
		return expected_closingdate;
	}
	/**
	 * @return the salesStage
	 */
	public WebElement getSalesStage() {
		return salesStage;
	}
	
	


}
