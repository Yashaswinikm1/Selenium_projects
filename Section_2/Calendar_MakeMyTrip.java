package Section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_MakeMyTrip 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		//driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[@role='grid']/div[@role='rowgroup'])/div/div[@aria-disabled='false' and @aria-selected='true']/div/p[@class=' todayPrice']"));
		
		System.out.println(ele.getText());
	}

}
