package PageScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.GuruLoginPage;

public class LoginPage_Guru extends GuruLoginPage
{

	
	//static String burl;
	private static WebDriver driver = null;
	private static Alert LoginAlert;
	
	public static void main(String[] args) 
	{
		//openUrl();
		//passLogin("mngr106247");
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium\\SeleniumDowns\\geckodriver.exe");
		
		login();
		verifyLogin();
		System.out.println("Closing firefox now...!!!");
		driver.quit();
	}
	
	@Test
	public static void login()
	{
		try
		{
			driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
			driver.get("http://www.demo.guru99.com/V4/");
			txt_loginName(driver);
			txt_password(driver);
			
			if(isLoginButtonDisplayed(driver) == true)
			{
				System.out.println("Login button is displayed");
				System.out.println("Signing in now..!!!");
				btnlogin(driver);
			}
			
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Login button is not displayed");
		}
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public static void verifyLogin()
	{
		try
		{
			LoginPage_Guru ln = new LoginPage_Guru();
			ln.isAlertDisplayed();
			if(ln.isAlertDisplayed() == true)
				LoginAlert.accept();
			else
			{
				String actual = "Guru99 Bank Manager HomePage"; 
				if(actual.equals(driver.getTitle()))
				{
					System.out.println("User logged in successfully");
				}
				else
				{
					System.out.println("User failed to login");
					driver.quit();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//Assert.assertFalse(login(), "User failed");
	}
	
	public boolean isAlertDisplayed()
	{
		try
		{
			LoginAlert = driver.switchTo().alert();
			//String LoginAlertName = LoginAlert.getText();
			System.out.println(this.LoginAlert.getText());
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}

}
