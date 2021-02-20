package Salesforce;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadforCampaign {

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
		//Clicking on Campaigns
				WebElement element = driver.findElement(By.xpath("//span[text()='Campaigns']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
				Thread.sleep(50000);
				//click on the 1st campaign
				driver.findElement(By.xpath("//a[@data-special-link='true']")).click();
				Thread.sleep(3000);
				//click on new case
				driver.findElement(By.xpath("//a[@title='Show 7 more actions']")).click();
				Thread.sleep(5000);
				//click on newlead
				driver.findElement(By.xpath("//a[@title='New Lead']")).click();
				Thread.sleep(4000);
				//Enter details
				driver.findElement(By.xpath("//a[@class='select']")).click();
				driver.findElement(By.xpath("//a[@title='Mr.']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys("Praveena");
				driver.findElement(By.xpath("//input[contains(@class,'lastName')]")).sendKeys("Krish");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[contains(@maxlength,'255')])[2]")).sendKeys("TestLeaf");
				//click save button
				driver.findElement(By.xpath("(//span[text()='Save'])[3]")).click();
				//clicking on Leads
				WebElement element1 = driver.findElement(By.xpath("//span[text()='Leads']"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", element1);
				Thread.sleep(8000);
			WebElement Search = driver.findElement(By.xpath("//input[@name='Lead-search-input']"));
			Search.sendKeys("Praveena");
			Thread.sleep(1000);
			Search.click();
				
				
}
	
}
