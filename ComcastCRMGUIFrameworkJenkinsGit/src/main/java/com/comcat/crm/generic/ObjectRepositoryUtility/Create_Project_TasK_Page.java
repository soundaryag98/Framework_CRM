package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Project_TasK_Page {
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public Create_Project_TasK_Page(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @return the project_taskname
	 */
	public WebElement getProject_taskname() {
		return project_taskname;
	}
	/**
	 * @return the task_startdate
	 */
	public WebElement getTask_startdate() {
		return task_startdate;
	}
	/**
	 * @return the save_btn
	 */
	public WebElement getSelect_button() {
		return select_button;
	}
	@FindBy(name="projecttaskname")
	private WebElement project_taskname;
	@FindBy(id="jscal_field_startdate")
	private WebElement task_startdate;
	/**
	 * @return the save_btn
	 */
	public WebElement getSave_btn() {
		return save_btn;
	}
	@FindBy(xpath="//img[@title='Select']")
	private WebElement select_button;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement save_btn;
	public void createProjectTask(String Taskname, String startdate)
	{
		project_taskname.sendKeys(Taskname);
		task_startdate.clear();
		task_startdate.sendKeys(startdate);
		select_button.click();
	}
	

}
