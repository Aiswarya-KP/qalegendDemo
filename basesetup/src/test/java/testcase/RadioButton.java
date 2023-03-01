package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import basesetup.RadioBaseSetup;

public class RadioButton extends RadioBaseSetup  {
	@Test(testName="Radio",priority=2)
	public void radiobutton() {
		List<WebElement> Gender=driver.findElements(By.xpath("//input[@type='radio']"));
		int sizeOfCheck=Gender.size();
		for(int i=0;i<sizeOfCheck;i++) {
			String valueOfGender=Gender.get(i).getAttribute("value");
			if(valueOfGender.equalsIgnoreCase("FeMale")) {
				Gender.get(i).click();
				
				Boolean verify=Gender.get(i).isSelected();
				Assert.assertTrue(verify);
				break;
			}}}
				
				@Test(testName="Radio",priority=1)
				public void radiobutton1() {
					List<WebElement> Gender=driver.findElements(By.xpath("//input[@type='radio']"));
					int sizeOfCheck=Gender.size();
					for(int i=0;i<sizeOfCheck;i++) {
						String valueOfGender=Gender.get(i).getAttribute("value");
						if(valueOfGender.equalsIgnoreCase("Male")) {
							Gender.get(i).click();
							
							Boolean verify=Gender.get(i).isSelected();
							Assert.assertTrue(verify);
							break;
}}}}
                  