package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcat.crm.generic.WebdriverUtility.WebDriverUtility;

public class CreatingNewDocumentPage extends WebDriverUtility
{
	
	WebDriver driver;
	public CreatingNewDocumentPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="notes_title")
	private WebElement doc_title;
	@FindBy(xpath ="//html[@dir='ltr']")
	private WebElement doc_des;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save_btn;
	
	
	public void createDocument(String title, String description, int index)
	{
		doc_title.sendKeys(title);
		switchToFrame(driver, index);
		doc_des.sendKeys(description);
		switchBacktoDefault(driver);
		save_btn.click();
	}
	

}
