package windowiframealert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle
{
    public static WebDriver driver;
  
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/frames']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'iFrame')]")).click();
        driver.findElement(By.xpath("//button[@id='mceu_16-open']")).click();
        driver.switchTo().frame(0);
       /* WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);//when nested frame then use findelement to switch the frame
*/      // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Your content goes here.')]")).getText());

	}

}
