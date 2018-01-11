package PageScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.ToolsQaPage;

public class toolsQaDemo1 extends ToolsQaPage
{
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) 
	{
		OpebSite();
		my_account();
		prod_subCat(driver);
		driver.quit();
	}
	
	@BeforeTest
	public static void OpebSite()
	{
		try
		{
			driver = new FirefoxDriver();
			driver.get("http://store.demoqa.com/");
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			String currentTitle = driver.getTitle();
			System.out.println(currentTitle);
			String expectedTitle = "ONLINE STORE | Toolsqa Dummy Test site";
			if(currentTitle.equals(expectedTitle))
			{
				System.out.println("Pass: Opened the website as expected");
			}
			else
			{
				System.out.println("Fail: Opened the website not expected");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public static void my_account()
	{
		try
		{
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			myAccount(driver);
			LogName(driver);
			LogPwd(driver);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			btnlogin(driver);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element not available or visible");
		}
	}
	
	@Test
	public static void products()
	{
		try
		{
			driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
			Prod_Cat(driver);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
