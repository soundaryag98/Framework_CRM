package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcat.crm.generic.WebdriverUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility{// create a separate java class
	//Object creation
	WebDriver driver;
	@FindBy(name="user_name")
	private WebElement usn;
	@FindBy(name="user_password")
	private WebElement psw;
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	//object Initialization
	/**
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//ObjectEnCapsulation
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	/**
	 * To provide action
	 * @param USN
	 * @param PSW
	 * @param url 
	 * @param timeout 
	 */
	public void loginToApp(String url,String USN, String PSW,  long timeout)
	{waitPageToLoad(driver, timeout);
		driver.get(url);
		maximizeWindow(driver);
		usn.sendKeys(USN);
		psw.sendKeys(PSW);
		loginbtn.click();
		
	}
	

}
