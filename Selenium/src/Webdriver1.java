import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//upcasting
		//nevigate to url
		   driver.get("https://online.actitime.com/xyzyzyx/login.do");
		   //Enter user name on login page
		   driver.findElement(By.id("username")).sendKeys("sudhajipur@gmail.com");
           driver.findElement(By.name("pwd")).sendKeys("DY7rHQjP"); 
           driver.findElement(By.id("loginButton")).click();
           Thread.sleep(6000);
           String titlepage=driver.getTitle();
              String currenturl=driver.getCurrentUrl();
              String pagesource=driver.getPageSource();
           System.out.println("The title of actitime is "+titlepage);
           System.out.println("The title of actitime is "+currenturl);
           System.out.println("The title of actitime is "+pagesource);
           
	}

}
