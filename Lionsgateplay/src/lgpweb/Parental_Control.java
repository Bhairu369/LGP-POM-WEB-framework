package lgpweb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parental_Control 
{
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"profile-parental-control\"]/div[2]/a[1]")
	WebElement U;
	
	@FindBy(xpath = "/html/body/header/div/nav/div[1]/ul/li[1]/a")
	WebElement hommetab;
	
	@FindBy(xpath = "/html/body/header/div/nav/div[1]/ul/li[2]/a")
	WebElement showstab;
	
	@FindBy(id = "settingsUser")
	WebElement sottingicon;
	
	@FindBy(id = "dropSettings")
	WebElement dropseting;
	
	@FindBy(xpath = "/html/body/main/section/div/article/form/div/div/div[2]/div[2]/a[2]")
	WebElement UA7;
	
	@FindBy(xpath = "//*[@id=\"parental-password-form\"]/div[1]/fieldset/div/span[1]")
	WebElement eyeicon;
	
	@FindBy(id = "passwordParental")
	WebElement possrd;
	
	@FindBy(id = "parental_submit")
	WebElement sobmott;
	
	public Parental_Control(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void restriction() throws InterruptedException
	{
		U.click();
		
		Thread.sleep(2000);
		
		hommetab.click();
		Thread.sleep(4000);
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,7000)", "");
		
		Thread.sleep(3000);
		
		showstab.click();
	    Thread.sleep(3000);
	    driver.navigate().back();
	    
	    sottingicon.click();
	    
	    dropseting.click();
	    
	    UA7.click();
	    
	    eyeicon.click();
	    
	    possrd.sendKeys("123456");
	    
	    sobmott.click();
		
	}

}
