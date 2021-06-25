package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Page {
	
	WebDriver driver;
	
	@FindBy(id = "settingsUser")
	WebElement setticn;
	
	@FindBy(id = "dropSettings")
	WebElement setbt;
	
	@FindBy(name = "firstName")
	WebElement forstnme;
	
	@FindBy(id = "lastName")
	WebElement lustnme;
	
	/*@FindBy(id = "button_changeemail")
	WebElement chngeemail;
	
	@FindBy(id = "newEmail_change")
	WebElement newemail;
	
	@FindBy(name = "newConfirmEmail")
	WebElement cnfrmemail;
	
	@FindBy(xpath = "//*[@id=\"changeEmail\"]/div/div/form/div[2]/button")
	WebElement submmitbton;
	
	@FindBy(id = "button_changepass")
	WebElement changpass;
	
	@FindBy(name = "password")
	WebElement oldpass;
	
	@FindBy(id = "newPassword")
	WebElement newpasswor;
	
	@FindBy(id = "passwordRetype")
	WebElement repass;
	
	@FindBy(id = "changepassword-send")
	WebElement sobmitbtn;*/
	
	
	public Settings_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void setingpage() throws InterruptedException
	{
		setticn.click();
		
		setbt.click();
		
		forstnme.clear();
		
		Thread.sleep(4000);
		forstnme.sendKeys("Bhairu");
		
		
		lustnme.clear();
		Thread.sleep(4000);
		lustnme.sendKeys("Bhanage");
		
		/*chngeemail.click();
		
		newemail.sendKeys("testtomaksoa@yopmail.com");
		
		cnfrmemail.sendKeys("testtomaksoa@yopmail.com");
		
		Thread.sleep(3000);
		submmitbton.click();
		
		changpass.click();
		
		oldpass.sendKeys("123456");
		
		newpasswor.sendKeys("1234566");
		
		repass.sendKeys("1234566");
		
		sobmitbtn.click();*/
	}
}
