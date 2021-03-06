package lgpweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass 
{
	static WebDriver driver;

	
		public void basematerial()
		{
		
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://pre.lionsgateplay.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		}
		
		public static void main(String[] args) throws InterruptedException {
			
			Mainclass obj2=new Mainclass();
			obj2.basematerial();
			
			
			//Signup page
			
			signupscreen obj3=new signupscreen(driver);
			obj3.signup();
			
			Logout obj7=new Logout(driver);
			obj7.logut();
			
			
			//Login page
			
			Loginscreen obj4=new Loginscreen(driver);
			obj4.loginpage();
			
			Add_payment_details_screen obj5=new Add_payment_details_screen(driver);
			obj5.paymentscreen();
			
			Search_page obj9=new Search_page(driver);
			obj9.srch();
			
			Settings_Page obj10=new Settings_Page(driver);
			obj10.setingpage();
			
			Parental_Control obj11=new Parental_Control(driver);
			obj11.restriction();
			
			//Home_Page obj6=new Home_Page(driver);
			//obj6.homepg();
			
			

			//Shows_Page obj8= new Shows_Page(driver);
			//obj8.show();
			
	}

}
