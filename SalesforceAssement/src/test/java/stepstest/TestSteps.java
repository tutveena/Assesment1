package stepstest;

import Pages.Hooks;
import Pages.LoginPage;
import Pages.ReportsPage;
import Pages.ServicesPage;
import Pages.HomePage;
import SeleniumBaseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps extends BaseClass {
	
	@Given ("Launch the application")
	public void Test()
	{
		open("https://login.salesforce.com");
	}
	@And ("Enter username as 'makaia@testleaf.com'")
	
	public void loginEnterUsername()
	{
		new LoginPage(driver).enterUserName("makaia@testleaf.com");
		
	}
	@And ("Enter password as 'Bootcamp@123'")
	public void loginEnterPassword()
	{
		new LoginPage(driver).enterPassword("Bootcamp@123");
	}
	@When ("Click login button")
	public void LoginButton()
	{
		new LoginPage(driver).clickLoginButton();
	}

	
	@Given("User is in Home Page and clicks on applaauncher")
	public void appLauncher()
	{
	  new HomePage(driver).clickToggleButton();
	}
	
	@When("click on ViewAll")
	public void viewAll()
	{
	  new HomePage(driver).clickViewAll();
	}

	@And("Click on Services")
	public void services()
	{
	  new HomePage(driver).clickService();
	}
	@And("Click on Reports")
	public void reports()
	{
	  new ServicesPage(driver).clickReports();
	}
	@And("Click on  New ReportSalesForce Classic" )
	public void newReportSalesforce()
	
	{
		new ReportsPage(driver).clickNewReportSalesForceClassic();
	}
	@And ("Click on Leads")
	public void leads()
	{
		new ReportsPage(driver).clickLeads();
	}
	
	@Then ("download the Lead Report Image on the Right side and click on Create")
			
	public void  Create()
	{
		new ReportsPage(driver).clickCreateButton();
	}
	
}