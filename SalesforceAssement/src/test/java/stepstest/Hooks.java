package stepstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import SeleniumBaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseClass{
	
	@Before
	public void openBrowser()
	{
		launchBrowser();
		
	}
	
	
	@After
	
	public void closing()
	{
		closeBrowser();
		
	}
}
