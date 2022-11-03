package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowndynamicselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(4000);
		//int i=1;
		//while(i<5)
		//{
		//driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
		//i++;
		//}
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).getText());
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
		}
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).getText());
		driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
		
		driver.close();
		
	}

}

