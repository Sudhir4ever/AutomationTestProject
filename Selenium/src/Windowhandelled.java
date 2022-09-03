import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandelled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://google.com");
	     driver.switchTo().newWindow(WindowType.TAB);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
