package Section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		
		WebElement code = driver.findElement(By.xpath("//select[@id='select1']"));
		Thread.sleep(3000);
		Select codeOption = new Select(code);
		codeOption.selectByValue("+91");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='select3']"));
		Select countryOption = new Select(country);
		countryOption.selectByIndex(3);
		
		WebElement gender = driver.findElement(By.xpath("//select[@id='select2']"));
		Select genderOption = new Select(gender);
		genderOption.selectByVisibleText("Female");
		
		System.out.println(codeOption.isMultiple());
		
	}

}
