package Section_2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Window 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("i phone 11");
		search.submit();
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]"));
		System.out.println(ele.getText());
		ele.click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		
		for(String ids : allIds)
		{
			if(!parentId.equals(ids))
			{
				driver.switchTo().window(ids);
			}
		}
		
		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		cart.click();
		
		System.out.println(cart.getText());
	}

}
