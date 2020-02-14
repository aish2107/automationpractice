package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor_valuePassing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aish2\\Desktop\\Selenium_chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource.demo.Orangehrmlive.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('txtUsername').setAttribute('value','Admin');");
		js.executeScript("document.getElementById('txtPassword').setAttribute('value','admin123');");
		//To find login button
		WebElement ele = driver.findElement(By.id("btnLogin"));
		//To click login button
		js.executeScript("arguments[0].click()",ele);
		//To scroll down
		js.executeScript("Window.ScrollBy(0,200)");

		
	}

}
