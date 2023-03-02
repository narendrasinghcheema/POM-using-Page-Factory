package PageObjectMidelusing_PageFectiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_New {

	@FindBy(id = "username") 
	WebElement user_Name;
	
	@FindBy(id = "password") 
	WebElement User_Password;
	
	@FindBy(id = "submit")
	WebElement Submit_button;
	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Log out']")
	public static WebElement Logout_Button;
	
	public LoginPage_New(WebDriver R_driver)
	{
		this.driver = R_driver;
	}
	
	public void Userand_pass(String user_N, String user_P)
	{
		user_Name.sendKeys(user_N);
		User_Password.sendKeys(user_P);
		Submit_button.click();
	}
	
	public static void LoginOut()
	{
		Logout_Button.click();
	}
}
