package com.testNgprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel3 {
@SuppressWarnings("deprecation")
@Test
public void ParallelTest3() {
	
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip&ef_id=8b5c9f9c3f3013a738fffc90feafedc9:G:s");
      try {
	     driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
      }catch(Exception e) {
    	  System.out.println("Popup is not displaying");
      }
	}
}

