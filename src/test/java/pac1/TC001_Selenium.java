package pac1;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Selenium {

	public static void main(String[] args) throws InterruptedException, ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=driver.getTitle();
		System.out.println("The Title is:"+title);
		Thread.sleep(3000);
		//WebElement username=driver.findElement(By.name("username"));
		//username.sendKeys("Admin");
		login_pageobjects obj1=new login_pageobjects(driver);
		obj1.enterusername("Admin");
		obj1.enterpassword("admin123");
		obj1.clickonlogin();
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
	}

}
