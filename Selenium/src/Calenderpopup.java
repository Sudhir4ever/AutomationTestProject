import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calenderpopup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip&ef_id=8b5c9f9c3f3013a738fffc90feafedc9:G:s");
	     driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	    // driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal']")).click();
	     driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	    //  driver.findElement(By.xpath("//label[@for='toCity']/span[@class='lbl_input latoBold  appendBottom5']")).click();
	    /*  Thread.sleep(6000);
	      driver.findElement(By.id("toCity")).sendKeys("bhuba");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//p[contains(text(),'Bhubaneswar')]")).click(); */
	     Thread.sleep(6000);
	     driver.findElement(By.xpath("//div[@aria-label='Wed Aug 31 2022']")).click();
	     
	     
	     
	     
	     
	}

}
