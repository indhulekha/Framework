package com.testpom;

import org.testng.annotations.Test;

import com.generics.BaseTest;
import com.generics.XL;
import com.pom.EnterTimeTrack;
import com.pom.LoginPage;

public class TestLogin extends BaseTest
{
	@Test
	public void validLogin()
	{
		String username = XL.getData(XLPATH, Sheet, 1, 0);
		String password = XL.getData(XLPATH, Sheet, 1, 1);
		String title = XL.getData(XLPATH, Sheet, 1, 2);
		
		LoginPage lp = new LoginPage(driver);
		lp.username(username);
		lp.setpassword(password);
		lp.onclick();
		
		
		EnterTimeTrack enter =new EnterTimeTrack(driver);
		enter.verifyHPdisplayed(driver, 5, title);
		
	}
	
	@Test
	public void invalidLogin()
	{
		String username = XL.getData(XLPATH, Sheet, 2, 0);
		String password = XL.getData(XLPATH, Sheet, 2, 1);
		String title = XL.getData(XLPATH, Sheet, 2, 2);
		
		LoginPage lp = new LoginPage(driver);
		lp.username(username);
		lp.setpassword(password);
		lp.onclick();
		
		
		EnterTimeTrack enter =new EnterTimeTrack(driver);
		enter.verifyHPdisplayed(driver, 5, title);
	}
	
	@Test
	public void invalid1()
	{
		String username = XL.getData(XLPATH, Sheet, 3, 0);
		String password = " ";
		String title = XL.getData(XLPATH, Sheet, 3, 2);
		
		LoginPage lp = new LoginPage(driver);
		lp.username(username);
		lp.setpassword(password);
		lp.onclick();
		
		
		EnterTimeTrack enter =new EnterTimeTrack(driver);
		enter.verifyHPdisplayed(driver, 5, title);
	}
	
	
	
	
	
	
	
	
	

}
