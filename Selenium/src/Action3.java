

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	  
	    driver.findElement(By.id("email")).sendKeys("abcdefgh"); 
	     Actions act=new Actions(driver);
	     act.doubleClick(driver.findElement(By.id("email"))).build().perform();	     
	     //act.dragAndDrop(source, target);
	     
	     
	     

	}

}
