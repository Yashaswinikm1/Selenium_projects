package Section_2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown 
{
	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		WebElement ele = driver.findElement(By.xpath("//input[@type='password']"));
		ele.sendKeys("admin123");
		ele.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
		
		
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']/div/span"));
		//Thread.sleep(3000);
		/*for(int i = 0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			System.out.println("==================");
		}*/
		Iterator <WebElement> itr1 = options.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next().getText());
			//System.out.println("===========================");
		}
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='CAN - FMLA']")).click();
		
		
		
	}

}
