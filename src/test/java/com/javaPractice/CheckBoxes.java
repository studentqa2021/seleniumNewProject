package com.javaPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		// String color = driver.findElement(By.xpath("//a[contains(text(),'Sign
		// Up')]")).getCssValue("color");
		// String font = driver.findElement(By.xpath("//a[contains(text(),'Sign
		// Up')]")).getCssValue("font-size");
		// System.out.println("This is color: "+color + " .This is font: " + font);
		List<WebElement> element = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		// System.out.println(element.size());
		int size = element.size();
		for (int i = 0; i < size; i++) {
			String text = element.get(i).getAttribute("id");
			System.out.println(text);
			if(text.equals("wednesday")||text.equals("saturday")||text.equals("sunday")) {
			
			element.get(i).click();	
			}
		}
		// Thread.sleep(5000);
		TimeUnit.SECONDS.sleep(5);
		// driver.quit();
	}

}	
