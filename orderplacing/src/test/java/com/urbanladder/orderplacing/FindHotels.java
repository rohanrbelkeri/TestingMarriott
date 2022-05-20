package com.urbanladder.orderplacing;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindHotels {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.marriott.com/default.mi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='destinationAddress.destination']")).click();
		driver.findElement(By.xpath("//span[@class='icon-location t-subtitle-m']")).click();

		
		driver.findElement(By.xpath("//span[@class='icon-dropdown-down']")).click();
		int i=1;
		while(i<3) {
			driver.findElement(By.xpath("//span[@class='icon-plus']")).click();
			i++;
		}
//		
		driver.findElement(By.xpath("//span[@class='h-r-form-field-txt search__calendar-value']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sun May 22 2022']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sat May 28 2022']")).click();
		driver.findElement(By.xpath("//button[@class='m-button-secondary']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		

	}

}
