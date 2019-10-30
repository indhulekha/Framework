package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrack {
	public EnterTimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyHPdisplayed(WebDriver driver, long ETO, String title)
	{
	try
	{
		WebDriverWait ww= new WebDriverWait(driver, ETO);
		ww.until(ExpectedConditions.titleContains(title));
		Reporter.log("page is displayed", true);
	}
	catch(Exception e)
	{
		Reporter.log("home page is not displayed", true);
		Assert.fail();
	}

}
}
