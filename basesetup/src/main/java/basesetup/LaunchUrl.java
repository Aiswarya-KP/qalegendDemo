package basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LaunchUrl {
	public static WebDriver driver;
	 @BeforeTest
	 public void urlLaunch()
	 {
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");  
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://qalegend.com/billing/public/login"); 
			String title=driver.getTitle();
			System.out.println(title);
			
	 }	
			//@AfterTest
			//public void terminateBrowser(){
		         // driver.close();
	 }
	

