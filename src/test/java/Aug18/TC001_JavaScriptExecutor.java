package Aug18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		// alerts handle with JavaScript
		//js.executeScript("alert('hello')");
		// scrolling a website till to end
		//js.executeScript("window.scroll(0,document.body.scrollHeight)");
		// scrolling up to some point
		js.executeScript("window.scroll(0,500)");
	}

}