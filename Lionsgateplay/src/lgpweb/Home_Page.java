package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	
	WebDriver driver;
	
	
	
	@FindBy(xpath = "/html/body/main/section/div[4]/div/div[1]/div[1]/div/div[15]/div/a/img")
	WebElement babel;
	
	@FindBy(xpath = "//*[@id=\"watch_now\"]/svg")
	WebElement wtchbtn;
	
	@FindBy(xpath = "/html/body/main/section/div[2]/article/header/div/button[1]/svg/path[1]")
	WebElement trailerbtn;
	
	
	
	public Home_Page(WebDriver driver) {
		
	this.driver=driver;
	
	PageFactory.initElements(driver, this);

	}
	
	public void homepg() throws InterruptedException
	{
		
		
		babel.click();
		
		Thread.sleep(3000);
		
		wtchbtn.click();
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		
		trailerbtn.click();
	}
	

	{
		
	
	}

}
