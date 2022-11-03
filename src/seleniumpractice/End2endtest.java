package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class End2endtest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'cookie-root\']/div[2]/div/div/button[1]")).click();
		
		WebElement source=driver.findElement(By.id("src"));
		//source.clear();
		source.sendKeys("Hyd");
		Thread.sleep(5000);
	    source.sendKeys(Keys.ENTER);
		 WebElement destination=driver.findElement(By.id("dest"));
         destination.sendKeys("Ban");
         Thread.sleep(3000);
         destination.sendKeys(Keys.ENTER);
         WebElement date=driver.findElement(By.id("onward_cal"));
         date.sendKeys(Keys.ENTER);
         driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[4]/td[6]")).click();
         WebElement Return = driver.findElement(By.id("return_cal"));
         Return.sendKeys(Keys.ENTER);
         driver.findElement(By.xpath("//*[@id=\'rb-calendar_return_cal\']/table/tbody/tr[6]/td[6]")).click();
         driver.findElement(By.xpath("//*[@id=\'search_btn\']")).click();
        
        Thread.sleep(3000);
		driver.close();
	}
	
	
	
}

