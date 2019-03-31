package windowiframealert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static WebDriver driver;
	  
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        
        driver.findElement(By.xpath("//a[@href='/frames']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
        
        
      driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name='frame-bottom']")));
       System.out.println(driver.findElement(By.tagName("body")).getText());
       
        //driver.switchTo().defaultContent();
       driver.switchTo().parentFrame();
       
       driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name='frame-top']")));
       driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']/frame[@name='frame-middle']")));
       System.out.println(driver.findElement(By.tagName("body")).getText());
       
	}

}
