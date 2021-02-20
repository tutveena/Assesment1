package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;

public class CampaignsPage extends BaseClass {

	public RemoteWebDriver driver;
	public CampaignsPage(RemoteWebDriver driver)
	{
	
		this.driver=driver;
	}
	
	public CampaignsPage clickCampaign()
	{
		waitUntilVisibility(driver,"//span[text()='Campaigns'][1]");
		click(getWebElement("xpath=//span[text()='Campaigns'][1]"));
		
		
		return this;
	}
	
	public void clickNewCampaign()
	{
		waitUntilVisibility(driver,"//div[@title='New']");
		click(getWebElement("xpath=//div[@title='New']"));
		
	}
	
	public void enterCampaignName(String locator, String CampaignName)
	
	{
		
		driver.findElement(By.xpath(locator)).sendKeys(CampaignName);
		
	}
	
	public void getCampaignName(String locator)
	{
		String name1 = driver.findElement(By.xpath(locator)).getText();
		
		System.out.println(name1);
	}
	
	public void clickStartDate(String locator,String locator1)
	{
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath(locator1)).click();
	}
	public void clickEndDate(String locator,String locator1)
	{
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath(locator1)).click();
		
	}
	public void clickSaveButton(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void verifyToastMessage(String locator)
	{
		String toastmsg =driver.findElement(By.xpath(locator)).getText();
		System.out.println(toastmsg);
	}

	public void click1stCampaign(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	
	
	public void clickNewLead(String locator,String locator1)
	
	{
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath(locator1)).click();
	}
	
	public void enterNewLeadDetails(String locator, String locator1)
	{
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath(locator1)).click();
	}
	
	public void enterNewLeadFirstName(String locator, String LeadFirstName)
	{
		driver.findElement(By.xpath(locator)).sendKeys(LeadFirstName);
	}
	
	public void enterNewLeadLastName(String locator, String LeadLastName)
	{
		driver.findElement(By.xpath(locator)).sendKeys(LeadLastName);
	}
	public void enterNewLeadCompanyName(String locator, String CompanyName)
	{
		driver.findElement(By.xpath(locator)).sendKeys(CompanyName);
	}
	public void leadCreationSavebutton(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
		System.out.println("Leadcreated");
	}
	public  void waitUntilVisibility(WebDriver driver, String ele)
	{
		
		
		WebDriverWait wait = new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));
		
		
		
	}
}
	
	

