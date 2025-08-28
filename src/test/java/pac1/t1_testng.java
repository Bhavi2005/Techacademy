package pac1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class t1_testng {
	WebDriverWait wait;
	WebDriver driver;
  @Test(dataProvider = "dp", priority=2)
  public void f(String uname, String pword) {
	  System.out.println("This is the test");
	  WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		System.out.println("class is:"+username.getAttribute("class"));
		if(username.isDisplayed())
		{
	
		System.out.println("username is dispalyed");
		username.sendKeys(uname);
		}
		else
		{
			System.out.println("username is not dispalyed");
		}
		
		username.sendKeys(Keys.TAB);
  }
  @Test(priority=1)
  public void test2()
  {
	  System.out.println("this is test2");
  }
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String browser) {
	  System.out.println("This is before method");
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	Thread.sleep(5000);
		
  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
	  WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	Thread.sleep(5000);
  }
	  
	  
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
	  WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	Thread.sleep(5000);
  }
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
    //  new Object[] { "pooja", "welcome" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite");
  }

}
