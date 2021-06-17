package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginscreen {
	WebDriver driver;
	
	@FindBy(id = "login-button")
	WebElement lgnbtn;
	
	@FindBy(id = "emailLogin")
	WebElement emails;
	
	@FindBy(name = "password")
	WebElement psrd;
	
	@FindBy(id = "ButtonLogin")
	WebElement loginbutton;
	
		
	public Loginscreen(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginpage() throws InterruptedException 
	{
		lgnbtn.click();
		
		emails.sendKeys("testka@yopmail.com");
		
		psrd.sendKeys("123456");
		
		Thread.sleep(3000);
		loginbutton.click();
		
		
	}

}
