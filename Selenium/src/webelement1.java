import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//upcasting
		//nevigate to url
		   driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
         WebElement wb=driver.findElement(By.name("identifier"));
             wb.sendKeys("sudhirk58@gmail.com");
             Thread.sleep(3000);
             wb.clear();
             //driver.findElement(By.xpath("//span[text()='Next']")).click();
             driver.close();
	}

}
