package com.automation.pages;

import java.beans.Visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autoamtion.base.Testbase;

public class LoginPages extends Testbase {
	
	@FindBy(xpath="//*[@type='text']")
	WebElement element;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement element1;
	
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	WebElement element2;
	
	@FindBy(xpath="//*[@class='user-display']")
	WebElement element3;
	public LoginPages() throws Exception
	{
		

		PageFactory.initElements(driver,this);	
	}
	
	public void setuserpassword(String username,String password)
	{
		element.sendKeys(username);
		element1.sendKeys(password);
		
		
		
	}
	public String verifylogin()
	{
		element2.click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='user-display']")));
		String str=element3.getText();
		return str;
	}
	
	

}
