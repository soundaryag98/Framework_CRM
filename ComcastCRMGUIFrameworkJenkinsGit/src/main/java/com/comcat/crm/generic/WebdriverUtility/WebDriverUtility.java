package com.comcat.crm.generic.WebdriverUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility {
	WebDriverWait wait;

	/**
	 * This method is user to wait until page to be loaded
	 * @author sound
	 * @param driver
	 * @param timeout 
	 */
	
	
	public void waitPageToLoad(WebDriver driver, long timeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
	//---------------------------------------------------------------------------------------------------------------------
/**
 * 
 * This method is used to wait till element visibility
 * @author sound
 * @param driver
 * @param element
 * @param timeout 
 */
	public void waitForElementPresence(WebDriver driver, WebElement element, long timeout) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * 
	 * @author
	 * @param driver
	 * @param locator
	 */
	public void RefreshedWait(WebDriver driver, By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/**
	 * 
	 * @author sound
	 * @param driver
	 */
	public void presenceOFAlert(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	/**
	 *
	 * @author sound
	 *
	 * @param driver
	 * @param url
	 */
	public void urlcontains(WebDriver driver, String url) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains(url));
	}
	/**
	 * @author sound
	 * @param driver
	 * @param element
	 */
	public void stalenessOf(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.stalenessOf(element));
	}
	/**
	 * @author sound
	 * @param driver
	 * @param locator
	 */
	public void invisibilityOfElementLocated(WebDriver driver,By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	 
	
//------------------------------------------------------------------------------------------------------------------
	/**
	 * @author sound
	 * @param driver
	 * @param partial_url
	 */
	public void switchToBrowserBasedOnUrl(WebDriver driver, String partial_url) {
		  for (String windowId : driver.getWindowHandles()) {
	            driver.switchTo().window(windowId);
	            if (driver.getCurrentUrl().contains(partial_url)) {
	                return;
	                
	            }
	        }
	}
	/**
	 * @author sound
	 * @param driver
	 * @param index
	 */

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * @author sound
	 * @param driver
	 * @param nameID
	 */
	public void switchToFrame(WebDriver driver, String nameID) {
		driver.switchTo().frame(nameID);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchBacktoDefault(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}

	public void switchToParent(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	//---------------------------------------------------------------------------------------------------------------------
	
	public void switchToAlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	//---------------------------------------------------------------------------------------------------------------------

	public void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void selectByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		s.getWrappedElement();
	}
	public void selectByValue(WebElement element, String value)
	{
		new Select(element).selectByValue(value);
	}
	//---------------------------------------------------------------------------------------------------------------------

	public void mouseToElement(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public void rightClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	public void dragAndDrop(WebDriver driver, WebElement source_element, WebElement target_element) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source_element, target_element).build().perform();
	}

	public void doubleClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}

	public void clickandHold(WebElement element, WebDriver driver) {
		Actions a = new Actions(driver);
		a.clickAndHold(element).build().perform();
	}
	public void scrollTOEle(WebElement element, WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.scrollToElement(element).build().perform();;
	}
	//---------------------------------------------------------------------------------------------------------------------

	public void verification(String act_result, String exceptedresult)
	{
		if (act_result.trim().contains(exceptedresult.trim())) {
			System.out.println(exceptedresult + "is created==>pass");
		} else {
			System.out.println(exceptedresult + "is not created==>fail");
			
		}
	}
	public void maximizeWindow(WebDriver  driver)
	{
		driver.manage().window().maximize();
	}
	

}
