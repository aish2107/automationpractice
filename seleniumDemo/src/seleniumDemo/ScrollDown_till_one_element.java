package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_till_one_element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aish2\\Desktop\\Selenium_chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		WebElement ele = driver.findElement(By.name("SubmitNewsletter"));
		WebElement tar = driver.findElement(By.xpath("(//*[@title=\"Women\"])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//To scroll down
		js.executeScript("arguments[0].scrollIntoview(true);",ele);

	}

}
