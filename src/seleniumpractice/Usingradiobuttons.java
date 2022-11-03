package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingradiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for (int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equals("Cheese"))
					{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}	
		}
		Thread.sleep(5000);
		driver.close();
		
	}

}

