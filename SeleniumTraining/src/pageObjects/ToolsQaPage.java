package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableScripts.ReusableScripts;

public class ToolsQaPage extends ReusableScripts
{
	private static WebElement element = null;
	
	public static WebElement myAccount(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='account']/a"));
		if(element.isDisplayed())
		{
			System.out.println(element.getText()+ " is displayed.");
			element.click();
		}
		return element;
	}
	
	public static WebElement LogName(WebDriver driver)
	{
		element = driver.findElement(By.id("log"));
		element.sendKeys("Ramraj");
		return element;
	}
	
	public static WebElement LogPwd(WebDriver driver)
	{
		element = driver.findElement(By.id("pwd"));
		element.sendKeys("toolsqa@123");
		return element;
	}
	
	public static WebElement btnlogin(WebDriver driver)
	{
		element = driver.findElement(By.id("login"));
		System.out.println("Login button is displayed: " +element.isDisplayed());
		element.click();
		return element;
	}
	
	public static WebElement Prod_Cat(WebDriver driver)
	{
		element = driver.findElement(By.id("menu-item-33"));
		System.out.println(element.getText());
		mouseHover(driver,element);
		
		return element;
	}
	
	public static WebElement prod_subCat(WebDriver driver)
	{
		Prod_Cat(driver);
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		return null;
	}
}
