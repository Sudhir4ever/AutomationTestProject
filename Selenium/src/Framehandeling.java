import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandeling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.selenium.dev/selenium/docs/api/dotnet/index.html");
	     
	     Thread.sleep(3000);
	     driver.switchTo().frame("TopicContent");
	     driver.findElement(By.linkText("Cookie")).click();
	     driver.switchTo().defaultContent();
	     driver.findElement(By.partialLinkText("IAllowsFileDetection")).click();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
