package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usinglocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("8688414321");
		driver.findElement(By.id("pass")).sendKeys("8688414321");
		driver.findElement(By.name("login")).click();
		driver.close();
		
	}

}
