package com.urbanladder.orderplacing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.marriott.com/default.mi");
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='sign-in-tooltip-id']/button")).click();
		driver.findElement(By.id("signin-userid")).sendKeys("rohanbelkeri143@gmail.com");
		driver.findElement(By.id("signin-user-password")).sendKeys("Rohan1999");
		driver.findElement(By.xpath("//*[@id=\"container-7b66ae5aae\"]/div/div/header/nav[2]/div/ul/li[3]/div/div[2]/form/div[3]/button")).click();
		
		
	}

}
