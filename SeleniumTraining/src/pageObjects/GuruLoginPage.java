package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuruLoginPage {

	//static WebElement userId;
	private static WebElement element = null;
	
	public static WebElement txt_loginName(WebDriver driver)
	{
		element = driver.findElement(By.name("uid"));
		element.sendKeys("mngr106247");
		return element;
	}
	
	public static WebElement txt_password(WebDriver driver)
	{
		element = driver.findElement(By.name("password"));
		element.sendKeys("ymutuza");
		return element;
	}
	
	public static WebElement btnlogin(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		element.click();
		return element;
	}
	
	public static boolean isLoginButtonDisplayed(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		element.isDisplayed();
		//System.out.println("Whether Login button is displayed? "+element.isDisplayed());
		String btnName = element.getText();
		System.out.println("The button name is: "+btnName);
		return true;
	}

}
