package BaseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements SeleniumBaseDesign {
	
	public static RemoteWebDriver driver;
	 
	
	public RemoteWebDriver launchBrowser()
	{
		
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public RemoteWebDriver launchBrowser(String browser)
	
	{
		if(browser.equalsIgnoreCase("firefox"))
		  {
			  WebDriverManager.firefoxdriver().setup();
				 driver = new FirefoxDriver();
				driver.manage().window().maximize();
		  }
		  else if 
		  (browser.equalsIgnoreCase("chrome"))
		  {
		  
		  
		  WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
		  }
		  else if (browser.equalsIgnoreCase("edge"))
		  {
			  WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
				driver.manage().window().maximize();
		  }
		return driver;
	
	
	
	
}

	public void closeBrowser()
	{
		driver.close();
		
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void open(String aut) {
		driver.get(aut);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public WebElement getWebElement(String locator) {
		
		String [] ele = locator.split("=",2);
		String key = ele[0];
		String value = ele[1];
		WebElement element = null;
		if(key.equalsIgnoreCase("id"))
		{
			element = driver.findElement(By.id(value));
		}else if(key.equalsIgnoreCase("name"))
			
		{
			element = driver.findElement(By.name(value));
			
		} else if(key.equalsIgnoreCase("xpath"))
		{
			element = driver.findElement(By.xpath(value));
		}
		else if(key.equalsIgnoreCase("classname"))
		{
			element = driver.findElement(By.className(value));
		}
		else if(key.equalsIgnoreCase("LinkText"))
		{
			element = driver.findElement(By.linkText(value));
		}
		else if(key.equalsIgnoreCase("cssselector"))
		{
			element = driver.findElement(By.cssSelector(value));
		}
		else if(key.equalsIgnoreCase("tagname"))
		{
			element = driver.findElement(By.tagName(value));
		}
		return element;
	}
	
	public List<WebElement> getWebElements(String locator)
	{
		String [] eles = locator.split("=",2);
		String key = eles[0];
		String value = eles[1];
		List<WebElement> element = null;
		if(key.equalsIgnoreCase("ID"))
		{
			element = driver.findElements(By.id(value));
		}else if(key.equalsIgnoreCase("name"))
			
		{
			element = driver.findElements(By.name(value));
			
		} else if(key.equalsIgnoreCase("xpath"))
		{
			element = driver.findElements(By.xpath(value));
		}
		else if(key.equalsIgnoreCase("classname"))
		{
			element = driver.findElements(By.className(value));
		}
		else if(key.equalsIgnoreCase("LinkText"))
		{
			element = driver.findElements(By.linkText(value));
		}
		else if(key.equalsIgnoreCase("cssselector"))
		{
			element = driver.findElements(By.cssSelector(value));
		}
		else if(key.equalsIgnoreCase("tagname"))
		{
			element = driver.findElements(By.tagName(value));
		}
		return element;
	}
	
	public void type(WebElement ele, String data)
	{
	ele.sendKeys(data);
	}
	
	public void click(WebElement ele)
	
	{
		ele.click();
		
		
		
	}
	
	public String getText(WebElement ele)
	
	{
		return ele.getText();
	}
	
	public  void waitUntilVisibility(WebDriver driver, String locator)
	{
		
		
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		
		
		
	}
}



