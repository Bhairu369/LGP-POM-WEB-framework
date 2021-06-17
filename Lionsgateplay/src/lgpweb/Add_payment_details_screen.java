package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_payment_details_screen 
{
	
	WebDriver driver;
	
	@FindBy(id = "changePayment")
	WebElement apdbutton;
	
	@FindBy(id = "voucherCode")
	WebElement voucherbox;
	
	@FindBy(css = "#voucherCode")
	WebElement evouchercd;
	
	@FindBy(id = "btnContinueVoucher")
	WebElement subscribebtn;
	
	@FindBy(id = "startWatching")
	WebElement thankyubtn;
	
	
	
	public Add_payment_details_screen(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void paymentscreen() throws InterruptedException
	{
		apdbutton.click();
		
		Thread.sleep(2000);
		voucherbox.click();
		
		Thread.sleep(3000);
		evouchercd.sendKeys("m01lgptest");
		
		Thread.sleep(1000);
		subscribebtn.click();
		
		Thread.sleep(2000);
		thankyubtn.click();
	}

}
