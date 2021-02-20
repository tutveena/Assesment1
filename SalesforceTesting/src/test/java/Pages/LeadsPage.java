package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadsPage {
	public WebDriver driver;
	public LeadsPage(WebDriver driver)
	
	{
		this.driver = driver;
	}
	
public void clickLeads(String locator)

{
	WebElement element1 = driver.findElement(By.xpath(locator));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", element1);

}
public void searchCreatedLead(String locator,String LeadName) throws InterruptedException 

{
	WebElement Search = driver.findElement(By.xpath(locator));
	Search.sendKeys(LeadName);
	Thread.sleep(3000);
	Search.click();
}

public  void waitUntilVisibility(WebDriver driver, String ele)
{
	
	
	WebDriverWait wait = new WebDriverWait(driver,500);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));
	
	
	
}
}
