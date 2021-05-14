package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupscreen 
{
	WebDriver driver;
	
	@FindBy(id="signup-button")
	WebElement signupbtn;
	
	@FindBy(id = "email")
	WebElement emailbx;
	
	@FindBy(id = "password")
	WebElement pswrd;
	
	@FindBy(id = "ButtonRegisterScreen")
	WebElement signupbutton;
	
	@FindBy(css = "#main > div.container > div.Register.paper-bg > div > div > div.CntButtons.CntButtons--payments > a")
	WebElement cancelbtn;
	
	
	
	
	
	public signupscreen(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signup()
	{
		signupbtn.click();
		
		emailbx.sendKeys("paani@yopmail.com");
		
		pswrd.sendKeys("123456");
		
		signupbutton.click();
		
		cancelbtn.click();
		
		
	}
	

}
