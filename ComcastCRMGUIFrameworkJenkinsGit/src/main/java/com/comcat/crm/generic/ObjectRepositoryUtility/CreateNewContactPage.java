package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public CreateNewContactPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="lastname")
	private WebElement lastname_tf;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save_btn;
	@FindBy(id="jscal_field_support_start_date")
	private WebElement SupportStartDate;
	@FindBy(id="jscal_field_support_end_date")
	private WebElement SupportEndDate;

	/**
	 * @return the supportStartDate
	 */
	public WebElement getSupportStartDate() {
		return SupportStartDate;
	}
	/**
	 * @return the supportEndDate
	 */
	public WebElement getSupportEndDate() {
		return SupportEndDate;
	}
	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement addorgicon;
	/**
	 * @return the addorgicon
	 */
	public WebElement getAddorgicon() {
		return addorgicon;
	}
	/**
	 * @return the lastname_tf
	 */
	public WebElement getLastname_tf() {
		return lastname_tf;
	}
	/**
	 * @return the save_btn
	 */
	public WebElement getSave_btn() {
		return save_btn;
	}
	public void createContact(String Lastname)
	{
		lastname_tf.sendKeys(Lastname);
		save_btn.click();
	}
	public void createContactWithDates(String Lastname, String startDate, String endDate) {
		lastname_tf.sendKeys(Lastname);
		SupportStartDate.clear();
		SupportStartDate.sendKeys(startDate);
		SupportEndDate.clear();
		SupportEndDate.sendKeys(endDate);
		save_btn.click();
	}
}
