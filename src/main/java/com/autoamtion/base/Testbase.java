package com.autoamtion.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.automation.utilty.Evenfring;


public class Testbase {
	
	
	public static WebDriver driver;
	public Properties prop;
	
	EventFiringWebDriver ew;
	Evenfring ev;
	
	
	public Testbase() throws Exception
	{
		
		FileInputStream fis=new FileInputStream("C:/Users/DELL/workspace/NewGen/src/main/java/com/automation/config/Confi.properties");
		prop=new Properties();
		prop.load(fis);
		
	}
	
	
	public void setup() throws Exception
	{
		String str=prop.getProperty("Browser");
		if(str.equalsIgnoreCase("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C://Users//DELL//Desktop//driver//chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		ew=new EventFiringWebDriver(driver);
		ev=new Evenfring();
		ew.register(ev);
		driver=ew;
		driver.get(prop.getProperty("URL"));
		
		
	}
	
	
}
