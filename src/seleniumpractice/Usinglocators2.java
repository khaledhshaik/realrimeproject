package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usinglocators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("8688414321");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("8688414321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\'login_link\']/div/a")).click();
		//driver.findElement(By.xpath("/*[@id='initiate_interstitial']")).click();
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
