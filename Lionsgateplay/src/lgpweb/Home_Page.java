package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/header/div/nav/div[1]/ul/li[1]/a")
	WebElement hmepg;
	
	@FindBy(css = "#carosuel-1 > div.owl-stage-outer > div > div:nth-child(15) > div > a > img")
	WebElement babel;
	
	@FindBy(xpath = "/html/body/main/section/div[2]/div/button")
	WebElement wtchbtn;
	
	
	public Home_Page(WebDriver driver) {
		
	this.driver=driver;
	
	PageFactory.initElements(driver, this);

	}
	
	public void homepg() throws InterruptedException
	{
		hmepg.click();
		
		babel.click();
		
		Thread.sleep(3000);
		
		wtchbtn.click();
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		
		
	}
	

	{
		
	
	}

}
