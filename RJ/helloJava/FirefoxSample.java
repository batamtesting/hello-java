package helloJava;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxSample {
	public void execute() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver-v0.19.0-win32\\geckodriver.exe");
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Browsers\\Mozilla Firefox55.0.3-x86\\firefox.exe"));
		FirefoxProfile profile = new FirefoxProfile();
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary(binary);
		options.setProfile(profile);
		WebDriver driver = new FirefoxDriver(options);
			
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
