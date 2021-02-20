package Salesforce;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class EditCampaign {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tutve\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("makaia@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Bootcamp@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(10000);
		//clicking on toggle button on leftside
		driver.findElement(By.className("slds-icon-waffle")).click();
		Thread.sleep(5000);
		//clicking on viewall 
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);
		//clicking on sales from app launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(8000);
		
		//clicking on opportunities
		WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(5000);
		//clicking on the first list
		driver.findElement(By.xpath("//a[@data-special-link='true']")).click();
		Thread.sleep(3000);
		//click on details
		driver.findElement(By.xpath("//a[@data-label='Details']")).click();
		Thread.sleep(3000);
		//click on close date
		driver.findElement(By.xpath("//button[@title='Edit Close Date']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'CloseDate')]")).click();
		Thread.sleep(3000);
		//change date to today+4
		driver.findElement(By.xpath("//span[text()='"+(new Date().getDate()+4)+"' and not(contains(@class,'nextMonth')) and not(contains(@class,'prevMonth'))]")).click();
		//click on edit amount
		//driver.findElement(By.xpath("//button[@title='Edit Amount']")).click();
		//enter amount value as 1000000
		driver.findElement(By.xpath("//label[text()='Amount']/following::input")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Amount']/following::input")).sendKeys("1000000");
		//driver.findElement(By.xpath("//label[text()='Amount']/following::input")).sendKeys("1000000");
		//click on save button
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
	String attribute =	driver.findElement(By.xpath("//label[text()='Amount']/following::input")).getAttribute("value");

	System.out.println(attribute);
	
	
	
	
		
		
		
		
		
		
	
		
		
//		List <WebElement> links =driver.findElements(By.className("slds-truncate outputLookupLink slds-truncate outputLookupLink-0062w0000084XUHAA2-722:0 forceOutputLookup"));
//		for (int i=0; i<links.size(); i++)
//				{
//			 links = driver.findElements(By.className("slds-truncate outputLookupLink slds-truncate outputLookupLink-0062w0000084XUHAA2-722:0 forceOutputLookup")); 
//			 links.get(0).click();
//			 break;
//				}
//		
//	}

}
}
