package com.comcast.crm.basetest;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.comcat.crm.generic.ObjectRepositoryUtility.CampaignInformationPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CampaignsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.ContactInformationPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.ContactsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreateNewContactPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreateNewProductPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreateOrganiztionsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreateProjectPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.Create_New_Ticket_Page;
import com.comcat.crm.generic.ObjectRepositoryUtility.Create_Project_TasK_Page;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreatingNewCampaignsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreatingNewDocumentPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreatingNewLeadPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreatingNewOpportunityPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.CreatingNewSalesOrderPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.DocumentInformationPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.DocumentsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.HomePage;
import com.comcat.crm.generic.ObjectRepositoryUtility.LeadInformationPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.LeadsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.LoginPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.OpportunitiesPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.OrganiztionsInfoPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.OrganiztionsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.ProductInformationPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.ProductsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.ProjectInformationPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.SalesOrderPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.SearchAndAddPopPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.TroubleTicketsInformationPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.TroubleTicketsPage;
import com.comcat.crm.generic.ObjectRepositoryUtility.projecttaskInformationPage;
import com.comcat.crm.generic.WebdriverUtility.JavaUtility;
import com.comcat.crm.generic.WebdriverUtility.UtilityClassObject;
import com.comcat.crm.generic.WebdriverUtility.WebDriverUtility;
import com.comcat.crm.generic.databaseutility.DatabaseUtility;
import com.comcat.crm.generic.fileUtility.ExcelUtility;
import com.comcat.crm.generic.fileUtility.FileUtility;

public class BaseClass {

	public WebDriver driver = null;
	 
	public FileUtility file = new FileUtility();
	public ExcelUtility excel = new ExcelUtility();
	public JavaUtility java = new JavaUtility();
	public WebDriverUtility web = new WebDriverUtility();
	public DatabaseUtility database = new DatabaseUtility();
	
	public LoginPage login ;

	public HomePage homePage;
	public OrganiztionsPage orgPage;
	public CreateOrganiztionsPage createOrgPage;
	public OrganiztionsInfoPage orgInfoPage;
	public SearchAndAddPopPage searchInpopPage;

	public ContactsPage contactPage;
	public CreateNewContactPage createContactPage;
	public ContactInformationPage contactInfoPage;

	public LeadsPage leadsPage;
	public CreatingNewLeadPage createLeadPage;
	public LeadInformationPage leadInfoPage;

	public TroubleTicketsPage troubleTicketsPage;
	public Create_New_Ticket_Page createTicketPage;
	public TroubleTicketsInformationPage troubleTicketsInfoPage;

	public ProductsPage productsPage;
	public CreateNewProductPage createProductPage;
	public ProductInformationPage productInfoPage;

	public CreateProjectPage createProjectPage;
	public ProjectInformationPage projectInfoPage;

	public Create_Project_TasK_Page createProjectTaskPage;
	public projecttaskInformationPage projectTaskInfoPage;

	public DocumentsPage documentPage;
	public CreatingNewDocumentPage createDocumentPage;
	public DocumentInformationPage documentInfoPage;

	public CampaignsPage campaignsPage;
	public CreatingNewCampaignsPage createCampaignsPage;
	public CampaignInformationPage campaignInfoPage;

	public OpportunitiesPage opportunitiesPage;
	public CreatingNewOpportunityPage createOpportunityPage;

	public SalesOrderPage salesOrderPage;
	public CreatingNewSalesOrderPage createSalesOrderPage;

	@BeforeSuite(groups = { "smoke", "regression" })
	public void configBS() throws SQLException {
		System.out.println("provide db connection, Conf Report");
		database.getConnection();
		
		
		
	}
@Parameters("BROWSER")
	@BeforeClass(groups = { "smoke", "regression" })
	public void configBc(/*String browser*/) throws IOException {
		System.out.println("Launch The Browser");
		String BROWSER =//browser;
				System.getProperty("browser",file.getDataFromPropertiesfile("browser"));
		 

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		 UtilityClassObject.setDriver(driver);
		homePage = new HomePage(driver);
		orgPage = new OrganiztionsPage(driver);
		createOrgPage = new CreateOrganiztionsPage(driver);
		orgInfoPage = new OrganiztionsInfoPage(driver);
		searchInpopPage = new SearchAndAddPopPage(driver);
		contactPage = new ContactsPage(driver);
		createContactPage = new CreateNewContactPage(driver);
		contactInfoPage = new ContactInformationPage(driver);
		leadsPage = new LeadsPage(driver);
		createLeadPage = new CreatingNewLeadPage(driver);
		leadInfoPage = new LeadInformationPage(driver);
		troubleTicketsPage = new TroubleTicketsPage(driver);
		createTicketPage = new Create_New_Ticket_Page(driver);
		troubleTicketsInfoPage = new TroubleTicketsInformationPage(driver);
		productsPage = new ProductsPage(driver);
		createProductPage = new CreateNewProductPage(driver);
		productInfoPage = new ProductInformationPage(driver);
		createProjectPage = new CreateProjectPage(driver);
		projectInfoPage = new ProjectInformationPage(driver);
		createProjectTaskPage = new Create_Project_TasK_Page(driver);
		projectTaskInfoPage = new projecttaskInformationPage(driver);
		documentPage = new DocumentsPage(driver);
		createDocumentPage = new CreatingNewDocumentPage(driver);
		documentInfoPage = new DocumentInformationPage(driver);
		campaignsPage = new CampaignsPage(driver);
		createCampaignsPage = new CreatingNewCampaignsPage(driver);
		campaignInfoPage = new CampaignInformationPage(driver);
		opportunitiesPage = new OpportunitiesPage(driver);
		createOpportunityPage = new CreatingNewOpportunityPage(driver);
		salesOrderPage = new SalesOrderPage(driver);
		createSalesOrderPage = new CreatingNewSalesOrderPage(driver);
		  login = new LoginPage(driver);

	}

	@BeforeMethod(groups = { "smoke", "regression" })
	public void configBm() throws IOException {
		System.out.println("Login To Appl");
		
		String URL =System.getProperty("browser",file.getDataFromPropertiesfile("UR_L")) ;
		String Username =System.getProperty("browser",file.getDataFromPropertiesfile("US_N")) ;
		String Password =System.getProperty("browser",file.getDataFromPropertiesfile("PS_W"))  ;
		login.loginToApp(URL, Username, Password, 20);

	}

	@AfterMethod(groups = { "smoke", "regression" })
	public void configAM() {
		System.out.println("Logout From application");
		homePage.logout();
	}

	@AfterClass(groups = { "smoke", "regression" })
	public void configAc() {
		System.out.println("Close the Browser");
		driver.close();
	}

	@AfterSuite(groups = { "smoke", "regression" })
	public void configAS() throws SQLException {
		System.out.println("Close the db Connection");
		database.closeConnection();
		
	}
}
