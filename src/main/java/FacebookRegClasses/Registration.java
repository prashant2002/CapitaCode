package FacebookRegClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	
	public static void NavigateToURL(WebDriver driver,String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	public static void EnterData(WebDriver driver,String strloctype, String strlocvalue, String Value)
	{
		switch(strloctype)
		{
		case "id":
			driver.findElement(By.id(strlocvalue)).sendKeys(Value);
			break;
		case "xpath":
			driver.findElement(By.xpath(strlocvalue)).sendKeys(Value);
			break;
		}
	}
	
	public static void ClickButton(WebDriver driver, String strloctype, String strlocvalue)
	{
		switch(strloctype)
		{
		case "id":
			driver.findElement(By.id(strlocvalue)).click();;
			break;
		case "xpath":
			driver.findElement(By.xpath(strlocvalue)).click();
			break;
		case "linktext":
			driver.findElement(By.linkText(strlocvalue)).click();
			break;
		}
	}

}
