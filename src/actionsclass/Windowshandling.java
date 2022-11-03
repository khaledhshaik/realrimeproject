package actionsclass;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spotify.com/in-en/signup");
	    driver.findElement(By.xpath("//*[@id=\'__next\']/main/div/div/form/div[9]/p[1]/span/a")).click();
	    System.out.println(driver.getTitle());
	    Set<String>ids=driver.getWindowHandles();
	    Iterator<String> it=ids.iterator();
	    String parentid=it.next();
	    String childid=it.next();
	    driver.switchTo().window(childid);
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(parentid);
	    System.out.println(driver.getTitle());
	    
		
	}

}
