import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alertpopup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	     driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    driver.findElement(By.id("alertBox")).click();
	    
	  Thread.sleep(5000);
	    Alert alt= driver.switchTo().alert();
	    String alerttext=alt.getText();
	    System.out.println(alerttext);
	    alt.accept();//click on alert ok on button
	   // alt.dismiss(); //click on alert cancel on button
	    
	    driver.findElement(By.id("promptBox")).click();
	    Alert alt1=driver.switchTo().alert();
	    Thread.sleep(4000);
	    alt1.sendKeys("sudhirk58@gmail.com");
	    alt1.dismiss();
	     
	     
	     
	     
	     
	     
	}

}
