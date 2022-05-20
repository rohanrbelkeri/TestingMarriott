package com.urbanladder.orderplacing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Join {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marriott.com/default.mi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\'sign-in-tooltip-id\']/a")).click();
		driver.findElement(By.id("field-first-name")).sendKeys("suresh");
		driver.findElement(By.id("field-last-name")).sendKeys("Kumar");
		 

		driver.findElement(By.id("field-email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("field-password")).sendKeys("Aabcd@123");
		driver.findElement(By.id("field-password-confirmation")).sendKeys("Aabcd@123");
		
		driver.findElement(By.id("enroll-join")).click();

		
	}

}
