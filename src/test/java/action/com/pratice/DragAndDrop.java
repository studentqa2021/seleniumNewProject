package action.com.pratice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(5000);
		driver.findElement(By.name("cusid")).sendKeys("mizan");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit' and @name='submit']")).click();
		
		//Double click the button to launch an alertbox
		Alert alert= driver.switchTo().alert();
		//alert.accept();
		Thread.sleep(5000);
		alert.dismiss();
		
		
		
	}

}
