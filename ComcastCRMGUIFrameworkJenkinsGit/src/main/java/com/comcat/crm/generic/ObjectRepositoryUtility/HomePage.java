package com.comcat.crm.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcat.crm.generic.WebdriverUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility
{
	WebDriver driver;
	/**
	 * Constructor for initialization
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//img[@title='vtiger-crm-logo.gif']")
private WebElement vtigerLogo;
@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
private WebElement homeicon;
@FindBy(linkText = "Calendar")
private WebElement calendar_link;
@FindBy(linkText = "Organizations")
private WebElement organizations_;
@FindBy(xpath = "//a[.='Contacts']")
private WebElement contacts_link;
@FindBy(linkText = "Opportunities")
private WebElement opportunities_link;
@FindBy(linkText = "Products")
private WebElement products_link;
@FindBy(linkText = "Documents")
private WebElement documents_link;
@FindBy(linkText = "Email")
private WebElement email_link;
@FindBy(linkText = "Trouble Tickets")
private WebElement troubleTickets_link;
@FindBy(linkText = "Dashboard")
private WebElement dashboard_link;
@FindBy(linkText = "Leads")
private WebElement leads_link;

@FindBy(linkText = "More")
private WebElement moredd_link;
@FindBy(linkText = "SMSNotifier")
private WebElement smsNotifier_linl;
@FindBy(linkText = "RSS")
private WebElement rss_link;
@FindBy(linkText = "Our Sites")
private WebElement ourSites_link;
@FindBy(linkText = "Integration")
private WebElement integration_link;
@FindBy(linkText = "Mail Manager")
private WebElement mailManager_link;
@FindBy(linkText = "PBX Manager")
private WebElement pBXManager_link;
@FindBy(linkText = "Comments")
private WebElement comments_link;
@FindBy(linkText = "Recycle Bin")
private WebElement recycleBin_link;

@FindBy(linkText = "Reports_link")
private WebElement reports;

@FindBy(linkText = "Campaigns")
private WebElement campaigns_link;
@FindBy(linkText = "Services")
private WebElement services_link;
@FindBy(linkText = "Assets")
private WebElement assets_link;
@FindBy(linkText = "Purchase Order")
private WebElement purchaseOrder_link;
@FindBy(linkText = "Price Books")
private WebElement priceBooks_link;
@FindBy(linkText = "Vendors")
private WebElement vendors_link;

@FindBy(linkText = "Project Milestones")
private WebElement projectMilestones_link;
@FindBy(linkText = "Project Tasks")
private WebElement projectTasks_link;
@FindBy(linkText = "Projects")
private WebElement projects_link;
@FindBy(linkText = "FAQ")
private WebElement fAQ_link;
@FindBy(linkText = "Service Contracts")
private WebElement serviceContracts_link;

@FindBy(linkText = "Invoice")
private WebElement invoice_link;
@FindBy(linkText = "Sales Order")
private WebElement salesOrder_link;
@FindBy(linkText = "Quotes")
private WebElement quotes_link;






@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement admin_img;
@FindBy(id="_my_preferences_")
private WebElement mypreferences_link;
@FindBy(linkText = "Sign Out")
private WebElement sign_out_link;

@FindBy(xpath = "//select[@id='qccombo']")
private WebElement quickcreate_dd;

/**
 * @return the quickcreate_dd
 */
public WebElement getQuickcreate_dd() {
	return quickcreate_dd;
}


/**
 * @return the driver
 */
public WebDriver getDriver() {
	return driver;
}


/**
 * @return the vtigerLogo
 */
public WebElement getVtigerLogo() {
	return vtigerLogo;
}


/**
 * @return the homeicon
 */
public WebElement getHomeicon() {
	return homeicon;
}


/**
 * @return the calendar_link
 */
public WebElement getCalendar_link() {
	return calendar_link;
}


/**
 * @return the organizations_
 */
public WebElement getOrganizations_() {
	return organizations_;
}


/**
 * @return the contacts_link
 */
public WebElement getContacts_link() {
	return contacts_link;
}


/**
 * @return the opportunities_link
 */
public WebElement getOpportunities_link() {
	return opportunities_link;
}


/**
 * @return the products_link
 */
public WebElement getProducts_link() {
	return products_link;
}


/**
 * @return the documents_link
 */
public WebElement getDocuments_link() {
	return documents_link;
}


/**
 * @return the email_link
 */
public WebElement getEmail_link() {
	return email_link;
}


/**
 * @return the troubleTickets_link
 */
public WebElement getTroubleTickets_link() {
	return troubleTickets_link;
}


/**
 * @return the dashboard_link
 */
public WebElement getDashboard_link() {
	return dashboard_link;
}


/**
 * @return the leads_link
 */
public WebElement getLeads_link() {
	return leads_link;
}


/**
 * @return the moredd_link
 */
public WebElement getMoredd_link() {
	return moredd_link;
}


/**
 * @return the smsNotifier_linl
 */
public WebElement getSmsNotifier_linl() {
	return smsNotifier_linl;
}


/**
 * @return the rss_link
 */
public WebElement getRss_link() {
	return rss_link;
}


/**
 * @return the ourSites_link
 */
public WebElement getOurSites_link() {
	return ourSites_link;
}


/**
 * @return the integration_link
 */
public WebElement getIntegration_link() {
	return integration_link;
}


/**
 * @return the mailManager_link
 */
public WebElement getMailManager_link() {
	return mailManager_link;
}


/**
 * @return the pBXManager_link
 */
public WebElement getpBXManager_link() {
	return pBXManager_link;
}


/**
 * @return the comments_link
 */
public WebElement getComments_link() {
	return comments_link;
}


/**
 * @return the recycleBin_link
 */
public WebElement getRecycleBin_link() {
	return recycleBin_link;
}


/**
 * @return the reports
 */
public WebElement getReports() {
	return reports;
}


/**
 * @return the campaigns_link
 */
public WebElement getCampaigns_link() {
	return campaigns_link;
}


/**
 * @return the services_link
 */
public WebElement getServices_link() {
	return services_link;
}


/**
 * @return the assets_link
 */
public WebElement getAssets_link() {
	return assets_link;
}


/**
 * @return the purchaseOrder_link
 */
public WebElement getPurchaseOrder_link() {
	return purchaseOrder_link;
}


/**
 * @return the priceBooks_link
 */
public WebElement getPriceBooks_link() {
	return priceBooks_link;
}


/**
 * @return the vendors_link
 */
public WebElement getVendors_link() {
	return vendors_link;
}


/**
 * @return the projectMilestones_link
 */
public WebElement getProjectMilestones_link() {
	return projectMilestones_link;
}


/**
 * @return the projectTasks_link
 */
public WebElement getProjectTasks_link() {
	return projectTasks_link;
}


/**
 * @return the projects_link
 */
public WebElement getProjects_link() {
	return projects_link;
}


/**
 * @return the fAQ_link
 */
public WebElement getfAQ_link() {
	return fAQ_link;
}


/**
 * @return the serviceContracts_link
 */
public WebElement getServiceContracts_link() {
	return serviceContracts_link;
}


/**
 * @return the invoice_link
 */
public WebElement getInvoice_link() {
	return invoice_link;
}


/**
 * @return the salesOrder_link
 */
public WebElement getSalesOrder_link() {
	return salesOrder_link;
}


/**
 * @return the quotes_link
 */
public WebElement getQuotes_link() {
	return quotes_link;
}




/**
 * It will navigate to campaginPage
 * @param driver
 */
/**
 * @return the admin_img
 */
public WebElement getAdmin_img() {
	return admin_img;
}


/**
 * @return the mypreferences_link
 */
public WebElement getMypreferences_link() {
	return mypreferences_link;
}


/**
 * @return the sign_out_link
 */
public WebElement getSign_out_link() {
	return sign_out_link;
}
public void navigateToCampaginPage(WebDriver driver)
{
	mouseToElement(driver, moredd_link);
	campaigns_link.click();
}
public void navigateToSalesOrder(WebDriver driver)
{
	mouseToElement(driver, moredd_link);
	salesOrder_link.click();
}

public void selectInquickcreatedd(String value)
{
	quickcreate_dd.click();
	selectByValue(quickcreate_dd, value);
}
public void logout()
{
	mouseToElement(driver, admin_img);
	sign_out_link.click();
}

}
