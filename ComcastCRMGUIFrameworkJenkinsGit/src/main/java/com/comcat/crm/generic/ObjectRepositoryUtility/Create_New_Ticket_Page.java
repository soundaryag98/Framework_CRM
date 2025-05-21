package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcat.crm.generic.WebdriverUtility.WebDriverUtility;

public class Create_New_Ticket_Page extends WebDriverUtility
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public Create_New_Ticket_Page(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "ticket_title")
	private WebElement title;
	/**
	 * @return the title
	 */
	public WebElement getTitle() {
		return title;
	}
	/**
	 * @return the description
	 */
	public WebElement getDescription() {
		return description;
	}
	/**
	 * @return the status
	 */
	public WebElement getStatus() {
		return status;
	}
	/**
	 * @return the save_btn
	 */
	public WebElement getSave_btn() {
		return save_btn;
	}
	@FindBy(name = "description")
	private WebElement description;
	@FindBy(name = "ticketstatus")
	private WebElement status;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save_btn;
	public void createTroubleTickets(String troubletitle, String Description, String value)
	{
		title.sendKeys(troubletitle);
		description.sendKeys(Description);
		selectByValue(status, value);
		save_btn.click();
	}
}
