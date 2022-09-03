import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelement4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//upcasting
		
		   driver.get("https://www.facebook.com/");
		   Thread.sleep(5000);//normal wait
		   //get html tag of webelement
		   String tagname=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getTagName();
          System.out.println("Tagname of facebook logo="+tagname);
          //to get location of a web element
         Point location=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getLocation();
          System.out.println("Location:-"+location);//to get location of object or webelement
         String font= driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getCssValue("font-size");
          System.out.println("Font of fb logo="+font);//to get css value of font size
          String font1= driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getCssValue("font-weight");
          System.out.println("weight of fb logo="+font1);//to get css value of font weight
          String font2= driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getCssValue("color");
          System.out.println("color of fb logo="+font2);//to get css value of color
          
         String attribute= driver.findElement(By.name("email")).getAttribute("placeholder");
         System.out.println("Attribute_value="+attribute);
         
          driver.close(); 
          
          
	}

}
