package pac1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	/*	driver.get("https://letcode.in/dropdowns");
		
		WebElement fruits=driver.findElement(By.id("fruits"));
		Select sle=new Select(fruits);
		sle.selectByIndex(4);
		List<WebElement> allfruirts=sle.getOptions();
		for(int i=0;i<allfruirts.size();i++)
		{
			System.out.println(allfruirts.get(i).getText());
		}
		
		*/
				
/*		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		Alert ale=driver.switchTo().alert();
		System.out.println("Alert message:"+ale.getText());
		ale.accept();
		
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("confirm")).click();
		Alert ale1=driver.switchTo().alert();
		System.out.println("Alert message:"+ale1.getText());
		ale1.accept();

		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("prompt")).click();
		Alert ale2=driver.switchTo().alert();
		//System.out.println("Alert message:"+ale2.getText());
		ale2.sendKeys("hema");
		ale2.accept();
		*/
		
		

		driver.get("https://letcode.in/window");
		
		System.out.println("window:"+driver.getWindowHandle());
		
		driver.findElement(By.id("multi")).click();
		Set<String> l1=driver.getWindowHandles();
		System.out.println("count:"+l1.size());
		
		for(String childwindow:l1)
		{
			driver.switchTo().window(childwindow);
			String url=driver.getCurrentUrl();
			System.out.println("url:"+url);
			
			if(url.equals("https://letcode.in/alert"))
			{
				//driver.get("https://letcode.in/alert");
				driver.findElement(By.id("accept")).click();
				Alert ale=driver.switchTo().alert();
				System.out.println("Alert message:"+ale.getText());
				ale.accept();
			}
		
			if(url.equals("https://letcode.in/dropdowns"))
			{
				//driver.get("https://letcode.in/dropdowns");
			
			WebElement fruits=driver.findElement(By.id("fruits"));
			Select sle=new Select(fruits);
			sle.selectByIndex(4);
			List<WebElement> allfruirts=sle.getOptions();
			for(int i=0;i<allfruirts.size();i++)
			{
				System.out.println(allfruirts.get(i).getText());
			}
		}
		
		}
		
		
		
		
		}	
		
				
	

}
