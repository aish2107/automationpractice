package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aish2\\Desktop\\Selenium_chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://adactin.com/HotelApp/");		
		// ChromeDriver dri = new ChromeDriver();
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Aishu123");
		
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.sendKeys("Adhi12");
		
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		System.out.println("Title==>>"+driver.getTitle());
		System.out.println("Current URL==>>"+driver.getCurrentUrl());
		System.out.println("Page source ==>>"+driver.getPageSource());
		
		String name = driver.findElement(By.id("username_show")).getAttribute("value");
		System.out.println(name);
		
		
		
		
		
		//driver.quit();
		
	}

}
