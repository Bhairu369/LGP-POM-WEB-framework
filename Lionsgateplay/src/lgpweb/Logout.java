package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout
{
	WebDriver driver;
	
	@FindBy(className = "Controls-item-link")
	WebElement setingbtn;
	
	@FindBy(id = "logoutSettings")
	WebElement lgutbtn;
	
	

	public Logout(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void logut()
	{
		setingbtn.click();
		
		lgutbtn.click();
	}

}
