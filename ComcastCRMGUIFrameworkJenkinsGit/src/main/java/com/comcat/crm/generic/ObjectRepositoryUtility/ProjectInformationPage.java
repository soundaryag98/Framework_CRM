package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectInformationPage {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public ProjectInformationPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "dvHeaderText")
	private WebElement act_projectheader;
	/**
	 * @return the act_projectheader
	 */
	public WebElement getAct_projectheader() {
		return act_projectheader;
	}
	/**
	 * @return the act_projectname
	 */
	public WebElement getAct_projectname() {
		return act_projectname;
	}

	@FindBy(id="dtlview_Project Name")
	private WebElement act_projectname;
}
