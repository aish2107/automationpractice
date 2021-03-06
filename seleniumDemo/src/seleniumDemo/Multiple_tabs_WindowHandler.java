package seleniumDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_tabs_WindowHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aish2\\Desktop\\Selenium_chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		WebElement ele = driver.findElement(By.xpath("(//*[@target='_blank'])[1]"));
		ele.click();
		String curr_wind = driver.getWindowHandle();
		System.out.println(curr_wind);
		Set <String> all_wind = driver.getWindowHandles();
		List <String> list = new ArrayList<String>();
		list.addAll(all_wind);
		System.out.println(list);
		driver.switchTo().window(list.get(1));
		driver.close();
		driver.switchTo().window(list.get(0));
		driver.quit();
		
	}

}
