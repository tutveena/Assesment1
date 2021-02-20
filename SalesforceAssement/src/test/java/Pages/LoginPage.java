package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import SeleniumBaseClass.BaseClass;

public class LoginPage extends BaseClass {

	public RemoteWebDriver driver;
	public LoginPage (RemoteWebDriver driver)
	{
	
		this.driver =driver;
	}

	
	public LoginPage enterUserName(String uName)
	
	{
		type(getWebElement("id=username"), uName);
		return this;
			
			}
	
public LoginPage enterPassword(String pName)
	
	{
		type(getWebElement("id=password"), pName);
		return this;
			
		
	}
public HomePage clickLoginButton()
{
	click(getWebElement("id=Login"));
	HomePage hp = new HomePage(null);
	return hp;
}

}
