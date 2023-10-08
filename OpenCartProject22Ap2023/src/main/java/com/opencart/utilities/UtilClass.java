package com.opencart.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {
	
	static WebDriver driver;
	public UtilClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//--------------------------------
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public static void takeScreenshotOfPage(String filename) 
	{
		try 
		{
			String path = "D:\\ECLIPSE_2023_03_WORKPLACE\\OpenCartProject22Ap2023\\screenshots\\";
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path + filename + ".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
