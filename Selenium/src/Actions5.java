import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://jqueryui.com/droppable/");
	     //enter Ugername on login page
	     driver.switchTo().frame(0);
	     
	     WebElement wb=driver.findElement(By.xpath("//div[@id='draggable']"));
	     WebElement wb1=driver.findElement(By.id("droppable"));
	     Actions act=new Actions(driver);
	    // act.dragAndDrop(wb, wb1).build().perform();
	     act.clickAndHold(wb).moveToElement(wb1).build().perform();
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
