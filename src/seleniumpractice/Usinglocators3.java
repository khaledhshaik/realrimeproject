package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usinglocators3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("khaledh");
		driver.findElement(By.id("password")).sendKeys("8688414321");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		//driver.findElement(By.xpath("/*[@id='initiate_interstitial']")).click();
		
		Thread.sleep(10000);
		driver.close();
		
	}

}

