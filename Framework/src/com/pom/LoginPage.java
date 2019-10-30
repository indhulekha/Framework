package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy (id="loginButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String username)
	{
		unTB.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		pwTB.sendKeys(password);
	}
	public void onclick()
	{
		loginButton.click();
	}

}
