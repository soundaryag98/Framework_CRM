package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAndAddPopPage
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public SearchAndAddPopPage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="search_txt")
private WebElement searchTf;
/**
 * @return the searchTf
 */
public WebElement getSearchTf() {
	return searchTf;
}
/**
 * @return the search_button
 */
public WebElement getSearch_button() {
	return search_button;
}
@FindBy(name="search")
private WebElement search_button;

public void search(CharSequence value) {
	searchTf.sendKeys(value);
	search_button.click();
}

	
	
	
	
	
}
