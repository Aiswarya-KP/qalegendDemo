package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basesetup.Launch;

public class CheckBox extends Launch {
@Test(testName="Check",priority=2)
public void checkbox() {
	List<WebElement> hobbies=driver.findElements(By.xpath("//input[@type='checkbox']"));
	int sizeOfCheck=hobbies.size();
	for(int i=0;i<sizeOfCheck;i++) {
		String valueOfHobbies=hobbies.get(i).getAttribute("value");
		if(valueOfHobbies.equalsIgnoreCase("Hockey")) {
			hobbies.get(i).click();
			
			Boolean verify=hobbies.get(i).isSelected();
			Assert.assertTrue(verify);
			break;
		}
	}
}
@Test(testName="Check2",priority=1)
public void checkbox2() {
	List<WebElement> hobbies=driver.findElements(By.xpath("//input[@type='checkbox']"));
	int sizeOfCheck=hobbies.size();
	for(int i=0;i<sizeOfCheck;i++) {
		String valueOfHobbies=hobbies.get(i).getAttribute("value");
		if(valueOfHobbies.equalsIgnoreCase("Movies")) {
			hobbies.get(i).click();
			
			Boolean verify=hobbies.get(i).isSelected();
			Assert.assertTrue(verify);
			break;
}}}}
