package Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import BaseClass.BaseClass;

public class ProjectSpecific extends BaseClass{
	
	@BeforeTest
	public void openBrowser()
	{
		launchBrowser();
		open("https://login.salesforce.com");
	}
	
	
	@AfterTest
	
	public void closing()
	{
		closeBrowser();
		
	}
}
