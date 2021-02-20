package Salesforce;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateCampaign {

	
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tutve\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("makaia@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Bootcamp@123");
		driver.findElement(By.id("Login")).click();
		
		waitUntilVisibility(driver, "//div[@class='slds-icon-waffle']");
		//waitUntilVisibility(driver, driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")));		
		//clicking on toggle button on leftside
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		waitUntilVisibility(driver, "//button[text()='View All']");
		//clicking on viewall 
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		waitUntilVisibility(driver, "//p[text()='Sales']");
		//clicking on sales from app launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
		waitUntilVisibility(driver, "//span[text()='Campaigns']");
		//Clicking on Campaigns
		WebElement element = driver.findElement(By.xpath("//span[text()='Campaigns']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		//clicking on New campaign
		waitUntilVisibility(driver, "//div[@title='New']");
	driver.findElement(By.xpath("//div[@title='New']")).click();
	waitUntilVisibility(driver, "//input[contains(@maxlength,'80')]");
	//entering campaign name
	//String name1 = "bootcamp";
	driver.findElement(By.xpath("//input[contains(@maxlength,'80')]")).sendKeys("Bootcamp");
	String name1 = driver.findElement(By.xpath("//input[contains(@maxlength,'80')]")).getText();
	
	System.out.println(name1);
	
	//Select Start and end date
	driver.findElement(By.xpath("//a[contains(@class,'datePicker-openIcon display')][1]")).click();
	driver.findElement(By.xpath("//table[@class='calGrid']//span[contains(@class,'selectedDate ')]/following::span[1]")).click();
	driver.findElement(By.xpath("(//a[contains(@class,'datePicker-openIcon display')])[2]")).click();
	driver.findElement(By.xpath("//table[@class='calGrid']//span[contains(@class,'selectedDate ')]/following::span[2]")).click();
	//click on Save
	driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	waitUntilVisibility(driver, "//div[@data-aura-class='forceToastMessage']");
	//boolean display = driver.findElement(By.xpath("(//span[text()='bootcamp'])")).isDisplayed();
	//System.out.println("bootcamp is created" +display);

	String toastmsg =driver.findElement(By.xpath("//div[@data-aura-class='forceToastMessage']")).getText();
	System.out.println(toastmsg);
	
	
	}
	


	public static void waitUntilVisibility(ChromeDriver driver, String ele)
{
	
	
	WebDriverWait wait = new WebDriverWait(driver,500);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));
	
	
	
}
	
	//(

//	
//	System.out.println(TodayAsString);
//	System.out.println(TmrwAsString);
//	//String1.compareTo(TmrwAsString);
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

	
}













