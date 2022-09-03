import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	     WebElement wb=driver.findElement(By.cssSelector(".context-menu-one"));
	     Actions act=new Actions(driver);
	     act.contextClick(wb).build().perform();
	     String copy=driver.findElement(By.cssSelector(".context-menu-icon-copy")).getText();
	     System.out.println("copy");
	}

}
