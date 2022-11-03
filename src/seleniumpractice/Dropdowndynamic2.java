package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowndynamic2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		//driver.findElement(By.xpath("//*[@id=\'cookie-root\']/div[2]/div/div/button[1]")).click();
		
		WebElement source=driver.findElement(By.id("src"));
		//source.clear();
		source.sendKeys("Hyd");
		Thread.sleep(2000);
	source.sendKeys(Keys.ARROW_DOWN);
		WebElement destination=driver.findElement(By.id("dest"));
         destination.sendKeys("Ban");
         Thread.sleep(5000);
         destination.sendKeys(Keys.ENTER);
         Thread.sleep(2000);
		//driver.close();
	}
	
	
	
}

