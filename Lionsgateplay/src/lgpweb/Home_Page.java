package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	
	WebDriver driver;
	
	
	
	@FindBy(css = "#carosuel-1 > div.owl-stage-outer > div > div:nth-child(9) > div > a > img")
	WebElement mile22;
	
	@FindBy(id = "watch_now")
	WebElement wtchbtn;
	
	
	
	public Home_Page(WebDriver driver) {
		
	this.driver=driver;
	
	PageFactory.initElements(driver, this);

	}
	
	public void homepg() throws InterruptedException
	{
		
		
		mile22.click();
		
		Thread.sleep(3000);
		
		wtchbtn.click();
		Thread.sleep(3000);
		
		
		
		
	}
	

	{
		
	
	}

}
