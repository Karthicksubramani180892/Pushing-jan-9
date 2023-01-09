package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensTechnology {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumDask1\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com ");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.close();
}
}
