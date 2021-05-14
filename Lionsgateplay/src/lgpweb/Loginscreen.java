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
	
	@FindBy(css = "#main > div.container > div.Register.paper-bg > div > div > div.CntButtons.CntButtons--payments > a")
	WebElement cancelbtn;
	
	
	public Loginscreen(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginpage()
	{
		lgnbtn.click();
		
		emails.sendKeys("paanipuri@yopmail.com");
		
		psrd.sendKeys("123456");
		
		loginbutton.click();
		
		cancelbtn.click();
	}

}
