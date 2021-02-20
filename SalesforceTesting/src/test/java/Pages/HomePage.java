package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;

public class HomePage extends BaseClass {
	
	public RemoteWebDriver driver;
	public HomePage(RemoteWebDriver driver)
	{
		
			this.driver=driver;

		}

	public HomePage clickToggleButton()
	
	{	//waitUntilVisibility(driver,"//div[@class='slds-icon-waffle']");
		click(getWebElement("xpath=//div[@class='slds-icon-waffle']"));
		return this;
	}
	
public HomePage clickViewAll()
	
	{
	waitUntilVisibility(driver,"//button[text()='View All']");
	click(getWebElement("xpath=//button[text()='View All']"));

	
	   return this;

	}

public HomePage clickSearchField()

{	
	
	waitUntilVisibility(driver,"//label[text()='Search apps or items...']/following::input");
	click(getWebElement("xpath=//label[text()='Search apps or items...']/following::input"));
	
	
	return this;
}

public HomePage enterSearchText(String searchText)

{	
	

	
	waitUntilVisibility(driver,"//label[text()='Search apps or items...']/following::input");
	type(getWebElement("xpath=//label[text()='Search apps or items...']/following::input"),searchText);
	
	
	return this;
}

public HomePage clickPayments()
{	waitUntilVisibility(driver,"//mark[text()='Payments']");
	click(getWebElement("xpath=//mark[text()='Payments']"));
	return this;
}
public HomePage clickSales()

{
	waitUntilVisibility(driver,"//p[text()='Sales']");
	click(getWebElement("xpath=//p[text()='Sales']"));
	return this;
}

public  void waitUntilVisibility(WebDriver driver, String ele)
{
	
	
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver,500);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));
	
	
	
}
}


