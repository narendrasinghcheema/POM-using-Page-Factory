package BrowserHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {

	public static WebDriver driver;
	public static WebDriver Select_Browser(String B_Name, String URL)
	{
		//====this code will check the requred browser Name and it will open the same browser====
		
		if (B_Name.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}else if(B_Name.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
		
		//====end of the same as keep as static====
	}
}
