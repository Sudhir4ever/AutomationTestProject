package com.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
   public static WebDriver driver;
	
	  public static WebDriver getBrowser() {
		  if(Project_constants.browser.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			  driver=new ChromeDriver();
		  
		  }else if(Project_constants.browser.equals("firefox")) {
			  System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  
		  }else if(Project_constants.browser.equals("safari")) {
			  System.setProperty("webdriver.safari.driver","");
			  driver=new SafariDriver();
			  
		  }else if(Project_constants.browser.equals("IE")) {
			  System.setProperty("webdriver.ie.driver","");
			  driver=new InternetExplorerDriver();
		    
		  }
		  return driver;
		  }
}
