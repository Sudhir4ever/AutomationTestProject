//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.FluentWait;

public class webelement3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//upcasting
		//nevigate to url
		   driver.get("https://online.actitime.com/xyzyzyx/login.do");  
		  WebElement wb=driver.findElement(By.id("keepLoggedInCheckBox"));
                wb.click();
               boolean issel=wb.isSelected();
               System.out.println("Clicked checkbox successfully=="+issel);
               wb.click();
               boolean issel1=wb.isSelected();
               System.out.println("Clicked checkbox successfully=="+issel1);
             //  FluentWait wait=new FluentWait(driver);
            //   wait.withTimeout(5000, TimeUnit.MILLISECONDS);
            //   wait.pollingEvery(500, TimeUnit.MILLISECONDS);
            //   wait.ignoring(NoSuchElementException.class)
               
               boolean enable=driver.findElement(By.id("loginButton")).isEnabled();
               System.out.println("Button is enabled=="+enable);
               
               
	}

}
