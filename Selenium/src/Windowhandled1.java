import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandled1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.naukri.com");
	     WebElement wb=driver.findElement(By.xpath("//div[text()='Companies']"));
	     Actions act=new Actions(driver);
	     act.moveToElement(wb).build().perform();
	      
	     Thread.sleep(3000);
	     driver.findElement(By.linkText("Product based")).click();
	     
	     
	    Set<String> set= driver.getWindowHandles();
	    Iterator<String> itr=set.iterator();
	     String parentid=itr.next();
	     String childid=itr.next();
	     driver.switchTo().window(childid);
	     driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]/preceding-sibling::i")).click();
	      
	     
	     driver.close();
	     driver.switchTo().window(parentid);
	     
	     Actions act1=new Actions(driver);
	     act1.moveToElement(driver.findElement(By.xpath("//div[text()='Services']"))).build().perform();
	     
	     Thread.sleep(3000);
	     driver.findElement(By.linkText("Jobs4u")).click();
	     
	     
	     
	     
	     
	     
	     
	     

	}

}
