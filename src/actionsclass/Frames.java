package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0);   // switch to frame with index here only 1 frame is there so index is 0
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.findElement(By.id("draggable")).click();
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		WebElement search=driver.findElement(By.name("s"));
		search.sendKeys("java");
		search.sendKeys(Keys.ENTER);
		//driver.close();

	}

}
