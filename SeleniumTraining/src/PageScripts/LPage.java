package PageScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LPage 
{

	public static WebDriver drv;
	static String burl;
	public static WebElement uname;
	
	public static void main(String[] args) 
	{
		openUrl();
		passUname();
	}
	
	static void openUrl()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\SeleniumDowns\\geckodriver.exe");
		drv = new FirefoxDriver();
		burl = "http://www.demo.guru99.com/V4/";
		drv.get(burl);
	}
	
	static void passUname()
	{
		uname = drv.findElement(By.name("uid"));
		uname.sendKeys("mngr77477");
		//uname = drv.findElement(By.xpath("//input[@name='uid']"));
		if (uname.isDisplayed())
			System.out.println("Pass");
		else
			System.out.println("Fail, User name field is not available");
			
	}
}
