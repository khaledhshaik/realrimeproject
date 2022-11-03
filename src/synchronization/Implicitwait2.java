package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("Khaledh");
		driver.findElement(By.id("login-signin")).click();;
		driver.findElement(By.id("login-passwd")).sendKeys("784512");
		driver.close();
}
}