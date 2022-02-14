package action.com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;


public class ActionClassPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		// driver.findElement(By.xpath("//*[contains(text(),' Accept All ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id = 'accept-cookie-notification-cross']")).click();
		Actions actoinObj = new Actions(driver);
		 WebElement mouseHoverElemet = driver.findElement(By.xpath("//span[contains(text(),'Developers')]"));
		actoinObj.moveToElement(mouseHoverElemet).build().perform();
		Thread.sleep(5000);
		WebElement clickEvent = driver.findElement(By.xpath("//a[contains(text(),'Events')]"));
		//clickEvent.click();//selenium click
		actoinObj.click(clickEvent).perform();//actoinObj click

	}

}
