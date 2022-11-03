package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("Atlanta");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("package-destination-hp-package")).sendKeys("Nevada");
		driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("package-departing-hp-package")).click();
	    driver.findElement(By.xpath("//*[@id=\'package-departing-wrapper-hp-package\']/div/div/div[2]/table/tbody/tr[2]/td[7]/button")).click();
        driver.findElement(By.id("package-returning-hp-package")).click();
        driver.findElement(By.xpath("//*[@id=\'package-returning-wrapper-hp-package\']/div/div/div[2]/table/tbody/tr[3]/td[7]/button")).click();

	}

}
