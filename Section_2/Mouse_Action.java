package Section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		act.moveToElement(ele).contextClick().perform();
		
	}

}
