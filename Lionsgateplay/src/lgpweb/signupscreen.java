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
	
	@FindBy(id = "btn_TandC")
	WebElement termsbtn;
	
	@FindBy(xpath = "//*[@id=\"legalModalContent\"]/div/div/div[1]/button/span[1]")
	WebElement closebtns;
	
	@FindBy(id = "btn_TandC")
	WebElement privacybtn;
	
	@FindBy(xpath = "/html/body/div[10]/div/div/div[1]/button/span[1]")
	WebElement cnclbtn;
	
	@FindBy(id = "signup-link")
	WebElement loginbtn;
	
	@FindBy(xpath = "//*[@id=\"signup-link\"]")
	WebElement signupg;
	
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
	
	public void signup() throws InterruptedException
	{
		signupbtn.click();
		
		termsbtn.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		closebtns.click();
		
		privacybtn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		cnclbtn.click();
		
		loginbtn.click();
		
		signupg.click();
		
		emailbx.sendKeys("testsoke@yopmail.com");
		
		pswrd.sendKeys("123456");
		
		signupbutton.click();
		
		cancelbtn.click();
		
		
	}
	

}
