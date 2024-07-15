package Section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Pointer 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("i phone 11");
		search.submit();
		
		Thread.sleep(3000);
		
		WebElement leftPointer = driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
		WebElement rightPointer = driver.findElement(By.xpath("(//div[@class='PYKUdo'])[2]"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(leftPointer, 30, 0).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(rightPointer, -30, 0).perform();
		
		
	}

}
