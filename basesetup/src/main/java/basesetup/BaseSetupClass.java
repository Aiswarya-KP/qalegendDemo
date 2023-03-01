package basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseSetupClass {
public static WebDriver driver;
    @BeforeTest
public void browserLaunch()
{
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");  
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html"); 
	
}
}
