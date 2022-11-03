package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Entercapsandrightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));    // by creating webelement method
		a.moveToElement(move).contextClick().build().perform();              //to Right click we use contextclick()

	}

}
