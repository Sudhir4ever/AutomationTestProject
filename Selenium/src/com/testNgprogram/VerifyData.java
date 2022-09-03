package com.testNgprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyData {
	@Test
	public void verifytext() {
		String Expectedtext="Facebook helps you connect and share with the people in your life";//  .missing
	System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	   driver.get("https://www.facebook.com/");
	String Actualtext= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
	//soft assert
	SoftAssert as=new SoftAssert();
	as.assertEquals(Expectedtext,Actualtext,"Result doesn't match");
	as.assertTrue(false);
	as.assertTrue(true);
	as.assertEquals(11, 15,"Number doesn't match");
  as.assertAll();
	/*hard assert
 Assert.assertEquals(Expectedtext,Actualtext);
 Assert.assertEquals(Expectedtext,Actualtext,"Result doesn't matched");for doesn't matched message*/
  System.out.println("Testcase ended-----");
	}
}