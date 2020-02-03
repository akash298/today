package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autoamtion.base.Testbase;
import com.automation.pages.LoginPages;

public class LoginTest extends Testbase {
	
	public LoginPages lp;
	
	public LoginTest() throws Exception
	{
		
		super();
	}
	
	@BeforeMethod
	public void openbrowser() throws Exception
	{
		  setup();
		  lp=new LoginPages();
	}
	@Test(retryAnalyzer=com.automation.utilty.retrylogics.class)
	public void loginandverify()
	{
		lp.setuserpassword("akashpanwar298@gmail.com","Skyis007");
		String str=lp.verifylogin();
		Assert.assertEquals(str,"akash panwar");
		System.out.println("TestCase Passed");
		
	}
	

}
