package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("Khaledh");
		driver.findElement(By.id("login-signin")).click();;
		WebDriverWait d=new WebDriverWait(driver,5);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
		driver.findElement(By.id("login-passwd")).sendKeys("784512");
		driver.close();
}
}