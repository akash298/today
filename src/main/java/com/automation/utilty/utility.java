package com.automation.utilty;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.autoamtion.base.Testbase;

public class utility extends Testbase{
	
	public utility() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void screenshotsave()
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentdir=System.getProperty("user.dir");
		try {
			FileUtils.copyFile(src,new File(currentdir+"\\screenshot\\"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
