 package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketsPage
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public TroubleTicketsPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createtroubletickets;
	/**
	 * @return the createtroubletickets
	 */
	public WebElement getCreatetroubletickets() {
		return createtroubletickets;
	}
}
