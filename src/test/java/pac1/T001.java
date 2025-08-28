package pac1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	Thread.sleep(5000);
		WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		System.out.println("class is:"+username.getAttribute("class"));
		if(username.isDisplayed())
		{
	
		System.out.println("username is dispalyed");
		username.sendKeys("Admin");
		}
		else
		{
			System.out.println("username is not dispalyed");
		}
		
		username.sendKeys(Keys.TAB);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello');");
		
		/*
		WebElement password=driver.findElement(By.name("password"));
		if(password.isDisplayed())
		{
	
		System.out.println("password is dispalyed");
		username.sendKeys("admin123");
		}
		else
		{
			System.out.println("password is not dispalyed");
		}
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		*/
		
	}

}
