package seleniumDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class GoogleSearch_by_Xpath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aish2\\Desktop\\Selenium_chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		WebElement element = driver.findElement(By.xpath("//div[@jscontroller=\"mvYTse\"]//input[@title=\"Search\"]"));
		element.sendKeys("aishwarya rai");
		driver.findElement(By.xpath("//div[@class=\"FPdoLc tfB0Bf\"]// input[@value=\"Google Search\"]")).click();
		//Take Screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D://Screenshot.jpg");
		FileHandler.copy(f1, f2);
		
	}

}
