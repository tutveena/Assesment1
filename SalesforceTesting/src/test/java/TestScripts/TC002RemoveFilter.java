package TestScripts;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.Payments;
import Pages.ProjectSpecific;

public class TC002RemoveFilter extends ProjectSpecific {

	@Test
	public void Test02()
	{
		new LoginPage(driver)
		.enterUserName("makaia@testleaf.com")
		.enterPassword("Bootcamp@123")
		.clickLoginButton();
		new HomePage(driver)
		.clickToggleButton()
		.clickViewAll()
		.clickSearchField()
		.enterSearchText("Payments")
		.clickPayments();
		new Payments(driver).
		clickRecentlyViewed()
		.clickAll().
		clickFilter()
		.clickRemoveAll().clickSaveButton()
		.clickCloseFilter();
		
	}
}
