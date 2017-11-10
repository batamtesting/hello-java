public class LoginTest1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path_to_driver);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("my username");
		driver.findElement(By.name("pw")).sendKeys("my password");
		driver.findElement(By.id("Login")).click();
		driver.close();
	}
}