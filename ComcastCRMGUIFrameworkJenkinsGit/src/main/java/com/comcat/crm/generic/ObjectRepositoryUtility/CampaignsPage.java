package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CampaignsPage
{
	WebDriver driver;
	public CampaignsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement createChampIcon;
	/**
	 * @return the createChampIcon
	 */
	public WebElement getCreateChampIcon() {
		return createChampIcon;
	}
	
	
	
















}
