package TestScripts;

import org.testng.annotations.Test;

import Pages.CampaignsPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProjectSpecific;

public class TestScript001 extends ProjectSpecific{
	
	@Test
	public void Test01Campaign() throws InterruptedException
	{
		new LoginPage(driver)
		.enterUserName("makaia@testleaf.com")
		.enterPassword("Bootcamp@123")
		.clickLoginButton();
		new HomePage(driver)
		.clickToggleButton()
		.clickViewAll()
		.clickSales();
		new CampaignsPage(driver)
		.clickCampaign()
		.clickNewCampaign();

	}

	private HomePage clickToggleButton() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
