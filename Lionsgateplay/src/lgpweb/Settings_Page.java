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
	}
}
