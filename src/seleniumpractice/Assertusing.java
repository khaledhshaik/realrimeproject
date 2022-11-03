package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertusing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		System.out.println(driver.findElements(By.cssSelector("a[class*='custom-check']")).size()); //to count number of checkboxes
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\'seniorcitizen_offer\']/a")).isSelected());
		driver.findElement(By.xpath("//*[@id=\'seniorcitizen_offer\']/a")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		
	}
	

}