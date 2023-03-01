package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basesetup.BaseSetupClass;


public class TestCaseClass extends BaseSetupClass 
{
@Test(testName="demotest")

public void demotestcase()
{
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Aiswarya");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kizhakkedath");
	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Kizhakkedath Parambu");
	driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("aiswaryakp2k@gmail.com");
	driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8138821082");	
}


}
