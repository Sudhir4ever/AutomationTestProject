import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelement2 {

	public static void main(String[] args) throws InterruptedException {
		String value="Facebook helps you connect and share with the people in your life.";
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//upcasting
		   driver.get("https://www.facebook.com/");
		   Thread.sleep(5000);
		   boolean dis=driver.findElement(By.xpath("//div[img[@class='fb_logo _8ilh img']]")).isDisplayed();
		   System.out.println("Facebook --logo is displayed sucessfully=="+dis);
		   
		  String text1=driver.findElement(By.xpath("//div[img[@class='fb_logo _8ilh img']]/following-sibling::h2")).getText();
        if(value.equals(text1)) {
        	
        	System.out.println("Text is matched sucessfully==pass");
        }
	}

}
