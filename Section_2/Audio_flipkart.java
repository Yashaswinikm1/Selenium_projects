package Section_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Audio_flipkart 
{
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_31z7R_']")) ;
		
		ArrayList<String> eleToSort = new ArrayList<String>();
		
		Iterator<WebElement> itr = ele.iterator();
		
		while(itr.hasNext())
		{
			String s = itr.next().getText();
			eleToSort.add(s);
		}
		Collections.sort(eleToSort);
		
		System.out.println(eleToSort);
		
		
	}

}
