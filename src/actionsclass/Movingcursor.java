package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movingcursor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		// by creating webelement method below code
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();

	}

}
