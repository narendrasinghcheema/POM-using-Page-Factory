package TakeDataFrom_PageFectory;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BrowserHelper.Helper;
import PageObjectMidelusing_PageFectiry.LoginPage_New;
import graphql.Assert.*;

public class Verify_User {

	@Test
	public void Open_test()
	{
		WebDriver driver = Helper.Select_Browser("firefox", "https://practicetestautomation.com/practice-test-login/");
		LoginPage_New Objfor_Loginpage = PageFactory.initElements(driver, LoginPage_New.class);
		Objfor_Loginpage.Userand_pass("student", "Password123");
		
		
		
		if(Objfor_Loginpage.Logout_Button.isDisplayed())
		{
			assertTrue(true, "user is successfully Login");
			Objfor_Loginpage.LoginOut();
		}
		
		else 
			
		{
			assertTrue(false, "user writen bad credentials");
		}
	}
	
}
