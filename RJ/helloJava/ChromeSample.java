package helloJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSample {
	public void execute() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver-v2.33_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.python.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("username")).sendKeys("my username");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("pycon");
		searchBox.sendKeys(Keys.ENTER);;
		//driver.findElement(By.id("Login")).click();
		
		//driver.close();
	}
}
