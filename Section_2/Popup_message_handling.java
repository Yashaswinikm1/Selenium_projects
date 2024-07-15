package Section_2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_message_handling 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		Alert alt = null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		/*
		WebElement message = driver.findElement(By.xpath("//p[text()='Alert Button Clicked']"));
		if(alt.getText() == message.toString())
			System.out.println("True");
			Thread.sleep(3000);
			*/
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		
		
		
	}

}
