package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class projecttaskInformationPage 
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public projecttaskInformationPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "dvHeaderText")
	private WebElement p_taskHeaderinfo;

	@FindBy(id="dtlview_Task Name")
	private WebElement act_taskname;
	/**
	 * @return the p_taskHeaderinfo
	 */
	public WebElement getP_taskHeaderinfo() {
		return p_taskHeaderinfo;
	}
	/**
	 * @return the act_taskname
	 */
	public WebElement getAct_taskname() {
		return act_taskname;
	}
	/**
	 * @return the realtedTo
	 */
	
	
}
