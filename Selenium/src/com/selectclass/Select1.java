package com.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	    
	     Thread.sleep(3000);
	     WebElement wb1=driver.findElement(By.id("day"));//for index
	     Select sel=new Select(wb1);
	     sel.selectByIndex(9); 
	     
	     WebElement wb2=driver.findElement(By.id("month"));//for value
	     Select sel1=new Select(wb2);
	     sel1.selectByValue("3");
	     
	     WebElement wb3=driver.findElement(By.id("year"));//for value
	     Select sel2=new Select(wb3);
	     sel2.selectByVisibleText("1991");//by visible text
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     

	}

}
