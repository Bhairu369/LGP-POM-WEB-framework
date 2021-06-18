package lgpweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginscreen {
	WebDriver driver;
	
	@FindBy(id = "login-button")
	WebElement lgnbtn;
	
	@FindBy(id = "signup-link")
	WebElement sgnplnk;
	
	@FindBy(xpath = "/html/body/main/div/div[1]/div/section/form/div[3]/div/p[2]/a")
	WebElement lgnbn;
	
	@FindBy(id = "supportBtn")
	WebElement suportbtn;
	

	
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
		
		sgnplnk.click();
		
		Thread.sleep(3000);
		
		lgnbn.click();
		
		suportbtn.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("contact-email")).sendKeys("hellboy@yopmail.com");
		
		driver.findElement(By.xpath("/html/body/main/div[1]/div[4]/div/div/div[2]/form/fieldset/div[2]/div[1]/button")).click();
		
		Thread.sleep(3000);
		Select subject=new Select(driver.findElement(By.xpath("//*[@id=\"contact-modal\"]/div/div/div[2]/form/fieldset/div[2]/div[1]/ul/li[2]/a")));
		subject.selectByValue("Playing movies/series from website");
		
		emails.sendKeys("testka@yopmail.com");
		
		psrd.sendKeys("123456");
		
		Thread.sleep(3000);
		loginbutton.click();
		
		
	}

}
