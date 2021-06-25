package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page 
{
	WebDriver driver;
	
	@FindBy(css = "#search-bar > label > svg")
	WebElement srchicn;
	
	@FindBy(id = "input-search")
	WebElement inpsrch;
	
	
	public Search_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void srch() throws InterruptedException
	{
		srchicn.click();
		
		inpsrch.sendKeys("HUNTER KILLER");
		
		String urls=driver.getCurrentUrl();

		System.out.println("the current url of the page is" +urls);
		
		Thread.sleep(3000);
		driver.navigate().back();
		
	}

}
