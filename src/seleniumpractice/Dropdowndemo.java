package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Select s =new Select(driver.findElement(By.xpath("//*[@id=\'post-2646\']/div[2]/div/div/div/p/select")));
		s.selectByValue("BLR");
		s.selectByIndex(65);
		s.selectByVisibleText("Monaco");
		
		Thread.sleep(10000);
		driver.close();
		
	}

}

