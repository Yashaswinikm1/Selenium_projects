package Section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_performed_2 
{
	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
		Actions act = new Actions(driver);
		WebElement mobAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
		WebElement mobCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		act.dragAndDrop(mobCharger, mobAccessories).perform();
		Thread.sleep(3000);
		act.dragAndDrop(mobCover, mobAccessories).perform();
		Thread.sleep(3000);
		
		WebElement lapAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
		WebElement lapCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement lapCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		act.dragAndDrop(lapCharger, lapAccessories).perform();
		Thread.sleep(3000);
		act.dragAndDrop(lapCover, lapAccessories).perform();
		Thread.sleep(3000);
	}

}
