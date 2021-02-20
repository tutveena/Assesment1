package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import SeleniumBaseClass.BaseClass;

public class ServicesPage extends BaseClass{
	
	public RemoteWebDriver driver;
	public ServicesPage (RemoteWebDriver driver)
	
	{
		this.driver=driver;
	}

	public ServicesPage clickReports()
	
	
	{	waitUntilVisibility(driver, "//a[@title='Reports']");
	
	WebElement element = getWebElement("xpath=//a[@title='Reports']");
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
		return this;
	}
	
	
}
