package lgpweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_payment_details_screen 
{
	
	WebDriver driver;
	
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[1]/div/div/div[1]/div[4]")
    WebElement yearlyplan;
	
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div[1]/div[2]/ul/li[1]/a/span[1]")
    WebElement creditcrd;
    
    @FindBy(id = "firstname")
    WebElement fstnme;
    
    @FindBy(id = "lastname")
    WebElement lstuname;
    
    @FindBy(id = "ccreditcard")
    WebElement crdnumbr;
    
   /* @FindBy(id = "csecuritycode")
    WebElement CVVbtn;
    
    @FindBy(id = "btnSubmitPayment")
    WebElement submttbtn;
    
    @FindBy(id = "cardNumber")
    WebElement cordno;
    
    @FindBy(name = "cardExpiry")
    WebElement crdexpiry;
    
    @FindBy(name = "cardCvv")
    WebElement cvva;
    
    @FindBy(xpath = "//*[@id=\"ccdcCardsForm\"]/button/div")
    WebElement proceedbtn;*/
    
    @FindBy(css = "#main > div.container > div.Register.paper-bg > div > div > div.payuPlans.payuPlans-IN > div.paymentPlan2.paymentPlan.paymentPlanSelected")
    WebElement yearlyplans;
    
    @FindBy(xpath = "/html/body/main/div[1]/div/div[1]/div[2]/ul/li[2]/a/span[1]")
    WebElement dbtcrd;
    
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[1]/div/div/div[1]/div[2]")
    WebElement mnthlyplan;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div[1]/div[2]/ul/li[1]/a/span[1]")
	WebElement credcrd;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[1]/div/div/div[1]/div[2]")
    WebElement mnthlyplans;
	
	@FindBy(xpath = "/html/body/main/div[1]/div/div[1]/div[2]/ul/li[2]/a/span[1]")
	WebElement dbtcard;
	
	@FindBy(id = "voucherCode")
	WebElement vouchercd;
	
	@FindBy(xpath = "//*[@id=\"voucherCode\"]")
	WebElement vcher;
	
	@FindBy(id = "btnContinueVoucher")
	WebElement subscibebtns;
	
	@FindBy(id = "startWatching")
	WebElement thnkubtn;
	
	public Add_payment_details_screen(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void paymentscreen() throws InterruptedException
	{
	
		yearlyplan.click();
		
		
		creditcrd.click();
		Thread.sleep(3000);
		
		fstnme.sendKeys("Bhairu");
		
		lstuname.sendKeys("B");
		
		crdnumbr.sendKeys("123456789369");
		
		/*WebElement mnt=driver.findElement(By.cssSelector("#contentMonth > button"));
		Select moneth=new Select(mnt);
		moneth.selectByIndex(3);
		
		WebElement yr=driver.findElement(By.cssSelector("#contentYear > button"));
		Select yere=new Select(yr);
		yere.selectByIndex(6);
		
		CVVbtn.sendKeys("123");
		
		submttbtn.click();
		
		cordno.sendKeys("364535461236");
		
		crdexpiry.sendKeys("0623");
		
		cvva.sendKeys("369");
		
		proceedbtn.click();*/
		
		driver.navigate().back();
		
		yearlyplans.click();
		
		dbtcrd.click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		mnthlyplan.click();
		
		credcrd.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		mnthlyplans.click();
		
		dbtcard.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		vouchercd.click();
		
		vcher.sendKeys("M01LGPTEST");
		
	    subscibebtns.click();
	    
	    driver.getTitle();
	    Thread.sleep(3000);
	    thnkubtn.click();
		
		
	}

}
