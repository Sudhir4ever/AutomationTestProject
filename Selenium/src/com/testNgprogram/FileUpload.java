package com.testNgprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
  @Test
  public void fileupload_documentTest() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.grammarly.com/plagiarism-checker");
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,200)", ""); 
	     
	     driver.findElement(By.xpath("//div[text()='Upload a file']")).click();
	     Thread.sleep(2000);
	     //create object of robot class
	     Robot rw=new Robot();
	     //copying filepath into clipboard
	     StringSelection str=new StringSelection("C:\\Users\\SUDHIR\\Documents\\rough.txt");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	     //press control v for pasting
	     rw.keyPress(KeyEvent.VK_CONTROL);
	     rw.keyPress(KeyEvent.VK_V);
	     //release control v for pasting
	     rw.keyRelease(KeyEvent.VK_CONTROL);
	     rw.keyRelease(KeyEvent.VK_V);
	     //press and release enter key
	     rw.keyPress(KeyEvent.VK_ENTER);
	     rw.keyRelease(KeyEvent.VK_ENTER);
	     
	     
	     
	     
  }
}
