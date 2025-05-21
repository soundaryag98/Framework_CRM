package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProjectPage {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public CreateProjectPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "projectname")
	private WebElement projectname;
	/**
	 * @return the projectname
	 */
	public WebElement getProjectname() {
		return projectname;
	}
	/**
	 * @return the startdate
	 */
	public WebElement getStartdate() {
		return startdate;
	}
	/**
	 * @return the enddate
	 */
	public WebElement getEnddate() {
		return enddate;
	}
	/**
	 * @return the save_btn
	 */
	public WebElement getSave_btn() {
		return save_btn;
	}
	@FindBy(id="jscal_field_startdate")
	private WebElement startdate;
	@FindBy(id="jscal_field_targetenddate")
	private WebElement enddate;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save_btn;
	public void createProject(String Project_name, String startDate, String endDate)
	{
		projectname.sendKeys(Project_name);
		startdate.clear();
		startdate.sendKeys(startDate);
		enddate.clear();
		enddate.sendKeys(endDate);
		save_btn.click();
	}

}
