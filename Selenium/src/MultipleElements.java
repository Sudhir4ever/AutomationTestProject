import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	
	public static void main(String[] args) {
		int no_of_links = 319;
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.bbc.com/");
	 @SuppressWarnings("unchecked")
	List<WebElement> lst= (List<WebElement>) driver.findElement(By.xpath("//a"));
        int linkcount=lst.size();
        
		if(no_of_links==linkcount)
        {
        	System.out.println("link verified==pass");
        }else {
        	System.out.println("link not verified==fail");
        }
        for(int i=0;i<lst.size();i++)
        {
		@SuppressWarnings("unused")
		String linktext= lst.get(i).getText();
        System.out.println("linktext");
        }
      }
   }