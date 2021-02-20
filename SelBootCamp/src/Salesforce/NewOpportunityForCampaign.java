package Salesforce;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewOpportunityForCampaign {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tutve\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
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
						
				driver.findElement(By.xpath("//a[@data-special-link='true']")).click();
				Thread.sleep(3000);
				//click on details
				driver.findElement(By.xpath("//a[@data-label='Details']")).click();
				Thread.sleep(3000);
				//edit opportunity name
				driver.findElement(By.xpath("//button[@title='Edit Opportunity Name']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).clear();
			Thread.sleep(5000);
				driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("PraveenaTest");
				Thread.sleep(3000);
				//click on close date
				driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).click();
				driver.findElement(By.xpath("//input[contains(@name,'CloseDate')]")).click();
				Thread.sleep(3000);
				//close date as Tmrw
				driver.findElement(By.xpath("//span[text()='"+(new Date().getDate()+1)+"' and not(contains(@class,'nextMonth')) and not(contains(@class,'prevMonth'))]")).click();
				//driver.findElement(By.xpath("//span[text()='"+(new Date().getDate()+1)+"' and not(contains(@class,'nextMonth')) and not(contains(@class,'prevMonth'))]")).click();
				Thread.sleep(7000);
				driver.executeScript("window.scrollBy(0,500)");
				//driver.findElement(By.xpath("//button[@title='Edit Stage']")).click();
				driver.findElement(By.xpath("//label[text()='Stage']/following::input")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
				Thread.sleep(5000);
				//click on save button
				driver.findElement(By.xpath("//button[text()='Save']")).click();
				Thread.sleep(5000);
				//driver.findElement(By.xpath("//button[text()='Save']")).click();
				
				
				
				//click on campaign
				
				WebElement element1 = driver.findElement(By.xpath("//span[text()='Campaigns']"));
				driver.executeScript("arguments[0].click();", element1);
				
				//click on opportunities
				
				
	WebElement element2 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click();", element2);

}
	
}
