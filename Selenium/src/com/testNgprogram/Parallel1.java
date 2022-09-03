package com.testNgprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void ParallelTest1() {
		@SuppressWarnings("unused")
		String Expectedtext="Facebook helps you connect and share with the people in your life";//  .missing
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		   driver.get("https://www.facebook.com/");
		@SuppressWarnings("unused")
		String Actualtext= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
	}
}
