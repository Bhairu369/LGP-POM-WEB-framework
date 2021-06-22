package lgpweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shows_Page 
{
	WebDriver driver;
		
		@FindBy(xpath = "//*[@id=\"navbarHeader\"]/div[1]/ul/li[2]/a")
		WebElement shws;
		
		@FindBy(css = "#carosuel-2 > div.owl-stage-outer > div > div:nth-child(12) > div > a > img")
		WebElement ssgb;
		
		@FindBy(xpath = "/html/body/main/section/div[2]/div/a")
		WebElement wtchnw;
		
		
		public Shows_Page(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public void show() throws InterruptedException
		{
			shws.click();
			
			String shw=driver.getTitle();
			
			System.out.println("the shows page title is"+shw);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ssgb.click();
			Thread.sleep(2000);
			wtchnw.click();
			
			
		}
}
