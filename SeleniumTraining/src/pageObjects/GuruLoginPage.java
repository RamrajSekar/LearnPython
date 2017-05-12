package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GuruLoginPage extends PageScripts.LPage {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		uname = drv.findElement(By.xpath("//input[@name='uid']"));
	}

}
