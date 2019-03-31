package ActionPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop 
{

	public static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://demo.guru99.com/test/drag_drop.html");
		   Actions actions= new Actions(driver);
		   WebElement sourceamt=driver.findElement(By.xpath("//section[@class='g-wrapper']//li[2]//a[1]"));
		   WebElement targetamt=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		   WebElement sourcebank=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		   WebElement targetbank=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		   WebElement targetamt2=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		   WebElement sourcesales=driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		   WebElement targetsales=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		   /*Thread.sleep(10000);
		   actions.dragAndDrop(sourcebank, targetbank).build().perform();
		   Thread.sleep(10000);
		   actions.dragAndDrop(sourceamt, targetamt).build().perform();
		   Thread.sleep(10000);
		   actions.dragAndDrop(sourcesales, targetsales).build().perform();
		   Thread.sleep(10000);
		   actions.dragAndDrop(sourceamt, targetamt2).build().perform();*/
		   //actions.clickAndHold(sourceamt).moveToElement(targetamt).build().perform();
		   actions.clickAndHold(sourceamt).moveToElement(targetamt).release().pause(1000).build().perform();
		   

	}

}
