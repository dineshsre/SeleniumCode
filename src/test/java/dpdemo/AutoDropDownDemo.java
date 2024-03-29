package dpdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoDropDownDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//span[@class = 'langCardClose']")).click();
		driver.findElement(By.xpath("//div[@data-cy = 'account']")).click();
		/*driver.findElement(By.xpath("//input[@value = 'DEL - New Delhi, IN ']")).click();
		driver.findElement(By.xpath("//input[@value = 'DEL - New Delhi, IN ']")).clear();*/
		WebElement from = driver.findElement(By.xpath("//input[@placeholder = 'From']"));
		Thread.sleep(3000);
		from.sendKeys("Sydney");
		Thread.sleep(3000);
		from.sendKeys(Keys.ARROW_DOWN);		Thread.sleep(3000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();

	}

}
