import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	  
	    WebElement wb=driver.findElement(By.id("email"));
	    wb.sendKeys("abcdefgh");
	    /* Actions act=new Actions(driver);
		act.sendKeys(wb,Keys.chord(Keys.CONTROL,"a")).build().perform();*/
		wb.sendKeys(Keys.CONTROL,"a");
		wb.sendKeys(Keys.CONTROL,"C");
		WebElement wb1=driver.findElement(By.id("pass"));
          wb.sendKeys(Keys.TAB);
          wb1.sendKeys(Keys.CONTROL,"V");
          
          
          
	}

}
