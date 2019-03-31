package windowiframealert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle 
{
    public static WebDriver driver;
    
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://the-internet.herokuapp.com/");
         driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
         System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
         driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
         
        Set<String> handles = driver.getWindowHandles();//getting id of all window
        Iterator<String> it = handles.iterator();
        while(it.hasNext())
       {
        	String parent=it.next();
        	System.out.println(parent);
        	driver.switchTo().window(parent);
        	/*String newwindow=it.next();
        	driver.switchTo().window(newwindow);
        	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        	//System.out.println(driver.getTitle());
        	driver.close();
        	driver.switchTo().window(parent);*/
        }
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        driver.close();
         
	} 


}
