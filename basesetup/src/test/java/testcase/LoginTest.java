package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basesetup.LaunchUrl;

public class LoginTest extends LaunchUrl {
   SoftAssert verify=new SoftAssert();
   @Test(testName="valid",priority=1)
  public void validLogin() {
	   driver.findElement(By.id("username")).clear();
	   driver.findElement(By.id("password")).clear();
	   
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.findElement(By.id("password")).sendKeys("123456");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   String expectedTitle="Home - las";
	   String actualTitle=driver.getTitle();
	   SoftAssert verify=new SoftAssert();
	   verify.assertEquals(expectedTitle,actualTitle );
	   driver.findElement(By.xpath("//button[contains(text(),'End tour')]")).click();
	   }
   @Test(testName="user",priority=2)
   public void userPage() {
	   driver.findElement(By.xpath("//button[contains(text(),'End tour')]")).click();
	   driver.findElement(By.linkText("User Management")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.linkText("Users")).click();
	   String expectedUrl=("https://qalegend.com/billing/public/users");
	   String actualUrl=driver.getCurrentUrl();
	   verify.assertEquals(actualUrl,expectedUrl);
	   }
   @Test(testName="Roles",priority=3)
    public void rolePage() {
	   driver.findElement(By.linkText("User Management")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.linkText("Roles")).click();
	   String expectedUrl=("https://qalegend.com/billing/public/roles");
	   String actualUrl=driver.getCurrentUrl();
	   verify.assertEquals(actualUrl,expectedUrl);
	   }
   @Test(testName="Sales Commission Agents",priority=4)
   public void SalesPage() {
	   driver.findElement(By.linkText("User Management")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.linkText("Sales Commission Agents")).click();
	   String expectedUrl=("https://qalegend.com/billing/public/sales-commission-agents");
	   String actualUrl=driver.getCurrentUrl();
	   verify.assertEquals(actualUrl,expectedUrl);
}
   @Test(testName="Suppliers",priority=5)
   public void Contacts() {
	   driver.findElement(By.linkText("Contacts")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.linkText("Suppliers")).click();
	   String expectedUrl=("https://qalegend.com/billing/public/contacts?type=supplier");
	   String actualUrl=driver.getCurrentUrl();
	   verify.assertEquals(actualUrl,expectedUrl);
	   
  }
   
   @Test(testName="Customers",priority=6)
   public void Customers() {
	   driver.findElement(By.linkText("Contacts")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.linkText("Customers")).click();
	   String expectedUrl=("https://qalegend.com/billing/public/contacts?type=customer");
	   String actualUrl=driver.getCurrentUrl();
	   verify.assertEquals(actualUrl,expectedUrl);
   }}
   
